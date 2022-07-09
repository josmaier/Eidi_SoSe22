public class ElementV2 {
    
    private int value;
    private ElementV2 next, previous;
    private boolean hasValue;

    public ElementV2(){
        this.next = null;
        this.previous = null;
        this.hasValue = false;
    }

    public void setNextElementV2(ElementV2 e){
        this.next = e;
    }

    public ElementV2 getNextElementV2(){
        return this.next;
    }

    public void setPreviousElementV2(ElementV2 e){
        this.previous = e;
    }

    public ElementV2 getPreviousElementV2(){
        return this.previous;
    }

    public void setValueV2(int value){
        this.value = value;
        this.hasValue = true;
    }

    public int getValueV2(){
        if(this.getHasValueV2()) return this.value;

        return -1;
    }

    public boolean getHasValueV2(){
        return this.hasValue;
    }


}
