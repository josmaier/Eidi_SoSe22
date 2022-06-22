public class KreisMain {

    public static void main(String[] args) {
        Kreis k = new Kreis(Double.parseDouble(args[0]));

        k.printAttribute();

        System.out.println();
        k.setRadius(4);

        k.printAttribute();

    }
    
}
