import java.util.NoSuchElementException;

public class RingBuffer {

    private Element head,tail;
    private Element[] elements;
    private boolean isEmpty = true;

    public RingBuffer(int capacity){
        if(capacity < 0) throw NegativeArraySizeException;
        Element[] elements = new Element[capacity];
        for(int i = 0; i < elements.length; i++){
            if(i == 0){
                elements[i] = new Element();
                elements[i].setNextElement(elements[i]);
                elements[i].setPreviousElement(elements[i]);
            } else {
                elements[i] = new Element();
                elements[i].setPreviousElement(elements[i-1]);
                if(i == elements.length){
                    elements[i].setNextElement(elements[0]);
                } else {
                    elements[i].setNextElement(elements[i+1]);
                }
                
            }
            this.head = elements[0];
            this.tail = elements[0];
            this.elements = elements;
        } 
        

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


    public int peek(RingBuffer rBuffer){
        if(rBuffer.getHead() == rBuffer.getTail()){
            return -1;
        } else {
            return rBuffer.getHead().getValue();
        }
    }

    public void put(int value){
        if(this.getTail() != this.getHead()){
            this.getTail().setValue(value);
            this.setTail(this.getTail().getNextElement());
            this.getHead().setPreviousElement(this.getTail().getPreviousElement());
            this.getTail().setNextElement(this.getHead());
        } else {
            this.getTail().setValue(value);
            this.setTail(this.getTail().getNextElement());
            this.setHead(this.getTail().getNextElement());
        }
    }

    public int remove(){
        if(this.getHead().getValue() == null) throw NegativeArraySizeException;
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
    
}
