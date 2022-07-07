import java.util.NoSuchElementException;
import java.lang.NegativeArraySizeException;

/*
 * TODOS:
 * Tail advanced nicht richtig,
 * value put passt
 * Aufpassen wegen out of bounds bei kleinen buffern
 * Konstruktor schöner macher
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
        
        Element[] elements = new Element[capacity];
        for(int i = 0; i < elements.length-1; i++){
            if(i == 0){
                elements[i] = new Element();
                elements[i].setNextElement(elements[i]);
                elements[i].setPreviousElement(elements[i]);
            } else {
                elements[i] = new Element();
                elements[i].setPreviousElement(elements[i-1]);
                if(i == elements.length-1){
                    elements[i].setNextElement(elements[0]);
                } else {
                    elements[i-1].setNextElement(elements[i]);
                }

                
            }
            
        } 
        elements[elements.length-1] = new Element();
        elements[elements.length-1].setPreviousElement(elements[elements.length-2]);
        elements[elements.length-1].setNextElement(elements[0]);
        elements[elements.length-2].setNextElement(elements[elements.length-1]);
        this.head = elements[0];
        this.tail = elements[0];
        this.elements = elements;
    
    }

    public void setHead(Element e){
        this.head = e;
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
        if(this.getTail() != this.getHead()){
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
            this.setHead(this.getTail().getNextElement());
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
