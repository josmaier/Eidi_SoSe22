/*
EidI SoSe 2022
Blatt 10
Aufgabe 2
*/

class Element {
    private int value;
    private Element next;
    private Element previous;
    private boolean hasValue;

    public Element() {
        this.next = null;
        this.previous = null;
        this.hasValue = false;
    }

    public Element(int value){
        this.value = value;
        this.next = null;
        this.previous = null;
        this.hasValue = true;
        
    }

    public void setNextElement(Element nextElement) {
        this.next = nextElement;
    }

    public void setPreviousElement(Element previousElemet){
        this.previous = previousElemet;
    }

    public Element getNextElement() {
        return this.next;
    }
    
    public Element getPreviousElement(){
        return this.previous;
    }

    public void setValue(int value) {
        this.value = value;
        this.hasValue = true;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getHasValue(){
        return this.hasValue;
    }

    public void setHasValue(boolean b){
        this.hasValue = b;
    }

}
