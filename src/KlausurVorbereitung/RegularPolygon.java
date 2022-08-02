package KlausurVorbereitung;

public class RegularPolygon {

    protected final int numSides;
    protected final double sideLength;
    public RegularPolygon(int numSides, double sideLength){
        this.numSides = numSides;
        this.sideLength = sideLength;
    }

    public int getNumSides(){
        return this.numSides;
    }

    public double getCircumfrence(){
        return this.numSides * this.sideLength;
    }

    public double getArea();
    
}
