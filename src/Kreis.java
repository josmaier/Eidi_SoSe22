public class Kreis {

    private double radius;
    private double umfang;
    private double flaeche;

    public Kreis(double radius) {
        if (radius >= 0) {
            this.radius = radius;
            this.umfang = 2 * Math.PI * radius;
            this.flaeche = Math.PI * radius * radius;
        } else {
            System.out.println("Radius darf nicht negativ sein");
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0){
        this.radius = radius;
        updateFlaeche(radius);
        updateUmfang(radius);
        } else {
            System.out.println("Radius darf nicht negativ sein");
        }
    }

    public double getUmfang() {
        return this.umfang;
    }

    public double getFlaeche() {
        return this.flaeche;
    }

    public void printAttribute() {
        System.out.println("Radius: " + this.radius);
        System.out.println("Umfang: " + this.umfang);
        System.out.println("Fläche: " + this.flaeche);
    }

    
    public double updateUmfang(double radius){
        this.umfang = 2 * Math.PI * radius;
        return this.umfang;
    }

    public double updateFlaeche(double radius){
        this.flaeche = Math.PI * radius * radius;
        return this.flaeche;
    }


}
