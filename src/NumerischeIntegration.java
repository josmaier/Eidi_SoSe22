public class NumerischeIntegration {

    public static double berechneF(double x){
        return Math.pow(Math.E, -Math.pow(x, 2));
    }

    public static double berechneTrapezFlaeche(double x1, double x2){
        if(!(x2 >= x1)){
            System.out.println("Die Eckpunkte sind ungueltig");
            return 0.0;
        } 

        return ((x2-x1)*((berechneF(x1)+berechneF(x2))/2));
    }

    public static double trapezVerfahren(int n){
        if(n <= 0){
            System.out.println("n ist ungueltig");
            return -1.0;
        }

        double sum = 0;
        double segmentGroesse = 1/(double)n;
        double x1 = 0;
        double x2 = segmentGroesse;

        for(int i = 0; i < n; i++){
            sum += berechneTrapezFlaeche(x1,x2);
            x1 = x2;
            x2 += segmentGroesse;
        }

        return sum;
    }

    public static void main(String[] args) {
    }
    
}
