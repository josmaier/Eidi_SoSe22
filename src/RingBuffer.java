import java.util.NoSuchElementException;
import java.lang.NegativeArraySizeException;

/*
 * TODOS:
 * Tail advanced nicht richtig,
 * value put passt
 * Aufpassen wegen out of bounds bei kleinen buffern
 * peek und remove testen
 * print funzt nicht
 */
public class RingBuffer {


    private Element head,tail;
    private Element[] elements;
    private boolean isEmpty = true;
    NegativeArraySizeException exception = new NegativeArraySizeException("Illegal Buffer Length");
    NoSuchElementException exception2 = new NoSuchElementException("The Buffer is empty");

    public RingBuffer(int capacity){
        if(capacity < 0) throw exception;
        
        
        this.elements = initialiseElements(capacity);
        this.head = this.elements[0];
        this.tail = this.elements[0];
    
    }

    public void setHead(Element e){ 
        this.head = e;
    }
    
    /*
     * Initialising Elemtents out of constructor for easier readability 
     * of said constructor
     */
    public Element[] initialiseElements(int capacity){
        Element[] elementsTemp = new Element[capacity];
        for(int i = 0; i < elementsTemp.length-1; i++){
            if(i == 0){
                elementsTemp[i] = new Element();
                elementsTemp[i].setNextElement(elementsTemp[i]);
                elementsTemp[i].setPreviousElement(elementsTemp[i]);
            } else {
                elementsTemp[i] = new Element();
                elementsTemp[i].setPreviousElement(elementsTemp[i-1]);
                if(i == elementsTemp.length-1){
                    elementsTemp[i].setNextElement(elementsTemp[0]);
                } else {
                    elementsTemp[i-1].setNextElement(elementsTemp[i]);
                }

                
            }
            
        } 
        elementsTemp[elementsTemp.length-1] = new Element();
        elementsTemp[elementsTemp.length-1].setPreviousElement(elementsTemp[elementsTemp.length-2]);
        elementsTemp[elementsTemp.length-1].setNextElement(elementsTemp[0]);
        elementsTemp[elementsTemp.length-2].setNextElement(elementsTemp[elementsTemp.length-1]);
        return elementsTemp;
    }

    public Element getHead(){
        return this.head;
    }

    public void setTail(Element e){
        this.tail = e;
    }

    public Element getTail(){
        return this.tail;
    }

    public boolean getIsEmpty(){
        return this.isEmpty;
    }


    public int peek(RingBuffer rBuffer){
        if(rBuffer.getIsEmpty()) throw exception2;
        if(rBuffer.getHead() == rBuffer.getTail()){
            return -1;
        } else {
            return rBuffer.getHead().getValue();
        }
    }

    public void put(int value){
        if(this.getTail() == this.getHead()){
            this.getTail().setValue(value);
            this.getTail().setHasValue(true);
            this.setTail(this.getTail().getNextElement());
            this.getHead().setPreviousElement(this.getTail().getPreviousElement());
            this.getTail().setNextElement(this.getHead());
            this.isEmpty = false;
        } else {
            this.getTail().setValue(value);
            this.getTail().setHasValue(true);
            this.setTail(this.getTail().getNextElement());
        }
    }

    public int remove(){
        if(this.getHead().getHasValue() == false) throw exception2;
        int x = -1;
        if(this.getHead() != this.getTail()) {
            x = this.getHead().getValue();
            this.setHead(this.getHead().getPreviousElement());
        } else {
            x = this.getHead().getValue();
            this.setHead(this.getHead().getPreviousElement());
        }
        return x;
    }

    public void printBuffer(){
        Element e = this.getHead();
        int i = 0;
        while(e != this.getTail()){
            if(e.getHasValue()){
                System.out.println("This is Element: " + i + " and it has the value: " + e.getValue());
                i++;
                e = e.getNextElement();
            }
        }
    }
    
}
