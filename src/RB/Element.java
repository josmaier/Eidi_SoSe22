package RB;
/*
EidI SoSe 2022
Blatt 10
Aufgabe 2
Edits: MG JM July 2022
*/

class Element {
    // boolean to define if the value of the element was initialized or is the default 0;
    private boolean isWritten = false;
    private int value;
    private Element next;
    private Element previous;

    public Element() {
        this.next = null;
        this.previous = null;
    }

    //Create Element without value
    public Element(Element previous, Element next ) {
        this.previous = previous;
        this.next = next;
    }

    //Create Element with value
    public Element(int value, Element previous, Element next ) {
        this.value = value;
        this.previous = previous;
        this.next = next;
        this.isWritten = true;
    }
        
    public void setNextElement(Element nextElement) {
        this.next = nextElement;
    }

    public Element getNextElement() {
        return this.next;
    }

    public void setPreviousElement(Element previousElement) {
        this.previous = previousElement;
    }

    public Element getPreviousElement() {
        return this.previous;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setStatus(boolean value) {
        this.isWritten = value;
    }

    public boolean getStatus() {
        return this.isWritten;
    }
    
}
