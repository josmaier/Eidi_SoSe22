/*
EidI SoSe 2022
Blatt 10
Aufgabe 2
*/

class Element {
    private int value;
    private Element next;
    private Element previous;

    public Element() {
        this.next = null;
        this.previous = null;
        this.value = 0;
    }

    public Element(int value){
        this.value = value;
        this.next = null;
        this.previous = null;
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
    }

    public int getValue() {
        return this.value;
    }

}
