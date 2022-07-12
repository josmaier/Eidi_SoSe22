package Blatt11;

import java.util.NoSuchElementException;

public class Stack {

    private int size;
    private Element top;

    //Create new stack
    public Stack() {
        this.size = 0;
        this.top = null;
    }

    /**
     * Add new Element to stack and connect it to the other elements
     * if size > 1
     * @param value     value of the added Element
     */
    public void push(int value) {
        Element newElement = new Element();
        newElement.setValue(value);
        if (size == 0) {
            top = newElement;
        } else {
            this.top.setNextElement(newElement);
            newElement.setPrevElement(this.top);
            this.top = newElement;
        }
        this.size++;
    }

    /**
     * Remove top element from stack and retun its value
     * @return      int Value of the top Element
     */
    public int pop() {
        if (size == 0) throw new NoSuchElementException("The Stack is empty");
        if (size == 1) {
            int value = top.getValue();
            this.top = null;
            size--;
            return value;
        } else {
            int value = top.getValue();
            this.top = top.getPrevElement();
            this.top.setNextElement(null);
            size--;
            return value;
        }
    }

    /**
     * Print Stack to the console
     */
    public void printStack(){
        if(size == 0) throw new NoSuchElementException("The Stack is empty");
        Element e = this.top;
        int i = this.size;
        while (e.getPrevElement() != null) {
            System.out.println("Value of Element " + i + ": " + e.getValue());
            e = e.getPrevElement();
            i--;
        }
        System.out.println("Value of Element " + i + ": " + e.getValue());
    }
}
