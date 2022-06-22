public class Potenz {

    private double basis;
    private int potenz;


    public Potenz(double b, int p) {
        this.basis = b;
        this.potenz = p;
    }

    public void printAttribute(){
        System.out.println("Basis: " + this.basis);
        System.out.println("Potenz: " + this.potenz);
    }
    


    //getter
    public double getBasis() {
        return this.basis;
    }

    public int getPotenz() {
        return this.potenz;
    }

    //setter    
    public void setBasis(double basis) {
        this.basis = basis;
    }

    public void setPotenz(int potenz) {
        this.potenz = potenz;
    }

   





    



    
}
