public class RingBufferV2 {

    ElementV2 tail, head;
    boolean isEmpty;

    public RingBufferV2(int capacity) {

        ElementV2[] elementV2s = new ElementV2[capacity];

        for(int i = 0; i < elementV2s.length; i++){
            elementV2s[i] = new ElementV2();
        }

        for (int j = 0; j < elementV2s.length; j++) {
            if (j == 0) {
                elementV2s[j].setPreviousElementV2(elementV2s[elementV2s.length - 1]);
            } else {
                elementV2s[j].setPreviousElementV2(elementV2s[j - 1]);
            }
            if(j == elementV2s.length-1){
                elementV2s[j].setNextElementV2(elementV2s[0]);
            } else {
                elementV2s[j].setNextElementV2(elementV2s[j + 1]);
            }
        }
        

        
        this.head = elementV2s[0];
        this.tail = elementV2s[0];
        this.setIsEmptyV2(true);

    }

    public void addValueV2(int value) {
        if (this.head == this.tail) {
            addValueFirst(value);
            return;
        }
        if (this.tail.getNextElementV2() != this.head) {
            this.tail.setValueV2(value);
            this.setTailV2(this.tail.getNextElementV2());
        } else {
            this.tail.getNextElementV2().setValueV2(value);
            this.tail = this.head;
            this.head = this.tail.getNextElementV2();
        }

    }

    public ElementV2 getTailV2() {
        return this.tail;
    }

    public void setTailV2(ElementV2 e) {
        this.tail = e;
    }

    public ElementV2 getHeadV2() {
        return this.head;
    }

    public void setHeadV2(ElementV2 e) {
        this.head = e;
    }

    public boolean getIsEmptyV2() {
        return this.isEmpty;
    }

    public void setIsEmptyV2(boolean b) {
        this.isEmpty = b;
    }

    private void addValueFirst(int value) {
        this.head.setValueV2(value);
        this.tail = this.head.getNextElementV2();
        this.setIsEmptyV2(false);
    }

    public int peekV2() {
        if (this.isEmpty) {
            return -1;
        }
        return this.head.getValueV2();
    }

    public int removeV2(){
        if(this.isEmpty){
            return -1;
        }
        int value = this.head.getValueV2();
        this.head = this.head.getNextElementV2();
        this.setIsEmptyV2(this.head == this.tail);
        return value;
    }

    public void printBufferV2(){
        ElementV2 e = this.head;
        int i = 1;
        //TODO Implement
    }

}
