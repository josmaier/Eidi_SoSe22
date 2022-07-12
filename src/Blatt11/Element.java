package Blatt11;
/*
EidI SoSe 2022
Blatt 10
Aufgabe 2
*/

class Element {
    private int value;
    private Element next;
    private Element prev;

    public Element() {
        this.next = null;
        this.prev = null;
    }

    public void setNextElement(Element nextElement) {
        this.next = nextElement;
    }

    public Element getNextElement() {
        return this.next;
    }

    public void setPrevElement(Element prevElement) {
        this.prev = prevElement;
    }

    public Element getPrevElement() {
        return this.prev;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
