package RB;
//MG JM July 2022
import java.lang.NegativeArraySizeException;
import java.util.NoSuchElementException;

public class RingBuffer {
    
    private Element head;
    private Element tail;
    private int capacity = 0;
    private int size = 0;
    
    public RingBuffer(){
    }

    public RingBuffer(int capacity) {
        
        if (capacity < 0) throw new NegativeArraySizeException("capacity cant be negative");

        this.capacity = capacity;
        createHead();

        var element = new Element(null, null);

        Element tempElement;
        head.setNextElement(element);
        tail.setNextElement(element);

        for(int i=1; i <= capacity; i++) {
            tempElement = new Element(element,null);
            element.setNextElement(tempElement);

            element = tempElement;
        }  
        element.setNextElement(head.getNextElement());
        FirstElementCorrection(element);

    }

    /*
     * Adds previous element link to last element in list to first element
     */
    private void FirstElementCorrection(Element lastElement){
        head.getNextElement().setPreviousElement(lastElement);
    }

    private void createHead() {
        head = new Element(null,null);
        tail = new Element(null,null);
    }

    /**
	 * Returns value of Head Element
	 */
    public int peek(){
        if(size == 0 )
            throw new NoSuchElementException("Element does not exist as buffer is not initialized");

        int value = head.getNextElement().getValue();
        return value;
    }

	/**
	 * Inserts value to the buffer at the end of the buffer
	 * @param       int The value for the new element.
	 */
	public void put(int value) {  
        
        tail.getNextElement().setValue(value);
        tail.getNextElement().setStatus(true);
    
        tail.setNextElement(tail.getNextElement().getNextElement());

        if (isBufferFilled()){
            System.out.println("buffer full, value inserted instead of: " + tail.getNextElement().getValue());
            head.setNextElement(head.getNextElement().getNextElement());
        } else{
            size++;
        }
	} 

    private boolean isBufferFilled(){
        return size == capacity? true:false;
    }

    private boolean isBufferEmpty(){
        return size ==0? true:false;
    }

    public void printList(){
        var currentElement = head.getNextElement();
        for(int i = 0; i < capacity; i++){
            System.out.println(currentElement.getValue()); 
            currentElement = currentElement.getNextElement();
        }
    }

    /** 
    Die Methode public int remove() der Klasse RingBuffer soll den Wert an der Position zur̈uckliefern, auf
    die head zeigt und head um eine Stelle zurückverschoben werden. Diese Methode simuliert also ein Abarbeiten
    der Elemente im Buffer. Sollte der Buffer leer sein, soll eine NoSuchElementException ausgel ̈ost werden. 
    */
    public int remove(){
        if(isBufferEmpty()) throw new NoSuchElementException("Buffer Empty");

        var value = head.getNextElement().getValue();

        //Aufgabenstellung ist irreführend; von einem tatsächlichen löschen des Wertes ist hier nicht die rede.
        head.setNextElement(head.getNextElement().getPreviousElement());
        size--;

        return value;
    }

}
