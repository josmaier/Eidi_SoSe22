public class RingBufferV2 {

    ElementV2 tail, head;
    boolean isEmpty;

    public RingBufferV2(int capacity) {

        //Array to initialise elements of buffer
        ElementV2[] elementV2s = new ElementV2[capacity];

        //filling array with elements
        for(int i = 0; i < elementV2s.length; i++){
            elementV2s[i] = new ElementV2();
        }

        //connecting elements
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
        

        //setting head and tail
        this.head = elementV2s[0];
        this.tail = elementV2s[0];
        this.setIsEmptyV2(true);

    }

    //TODO has a issue which results in element positions in the buffer being changed
    //Idk why trying to fix
    public void addValueV2(int value) {
        //if buffer is empty
        if (this.head == this.tail) {
            addValueFirst(value);
            return;
        }
        //if buffer is not empty and not full
        if (this.tail.getNextElementV2() != this.head) {
            this.tail.setValueV2(value);
            this.setTailV2(this.tail.getNextElementV2());
        } else if (this.tail.getNextElementV2() == this.head) { //if buffer is full
            this.tail.setValueV2(value);
            this.setTailV2(this.getHeadV2());
        } else { //override elements if added after buffer is full
            this.head.setValueV2(value);
            this.setHeadV2(this.getHeadV2().getNextElementV2());
            this.setTailV2(this.getHeadV2());
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

    //sub method for setting the first value of the buffer
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

    //unsure tbh
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
        //TODO Implement
        
    }

}
