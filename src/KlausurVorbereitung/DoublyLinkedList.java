package KlausurVorbereitung;

public class DoublyLinkedList implements SeekAndRemove {

    private Element first;
    private Element last;
    private int length;
    
    public DoublyLinkedList() {
        first = null;
        last = null;
        length = 0;
    }

    public void addFront(int value) {
        Element element = new Element(value, null, first);
        if(length == 0)
            last = element;
        else
            first.setPrevElement(element);

        first = element;
        length++;
    }

    public void addBack(int value) {
        Element element = new Element(value, last, null);

        if(length == 0)
            first = element;
        else
            last.setNextElement(element);

        last = element;
        length++;
    }

    public int getLength() {
        return length;
    }

    // Private helper method
    private void removeElement(Element element) {
        if(element.equals(first))
            first = element.getNextElement();
        if(element.equals(last))
            last = element.getPrevElement();

        if(element.getPrevElement() != null)
            element.getPrevElement().setNextElement(element.getNextElement());

        if(element.getNextElement() != null)
            element.getNextElement().setPrevElement(element.getPrevElement());

        length--;
    }

    public static void printList(DoublyLinkedList list) {
        System.out.print("[");
        Element current = list.first;

        while(current.getNextElement() != null) {
            System.out.print(current.getValue() + ", ");
            current = current.getNextElement();
        }
        System.out.println(current.getValue() + "]");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        for(int i = 1; i <= 9; i++) {
            list.addFront(i);
            list.addBack(i);
        }
        printList(list);
        list.removeFirst(9);
        printList(list);
        list.removeLast(9);
        printList(list);
        list.removeAll(1);
        printList(list);
    }
}
