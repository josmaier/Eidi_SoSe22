package KlausurVorbereitung;

public class Element {
        private final int value;
        private Element prev;
        private Element next;

        public Element(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public Element(int value, Element prev, Element next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        public void setNextElement(Element element) {
            this.next = element;
        }

        public Element getNextElement() {
            return this.next;
        }

        public void setPrevElement(Element element) {
            this.prev = element;
        }

        public Element getPrevElement() {
            return this.prev;
        }

        public int getValue() {
            return this.value;
        }
}
