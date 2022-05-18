public class Quersumme {


    public static int ganzzahligAbrunden(double x){
       return (int)x;
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int quersumme;
        int divRest;

        if(n < 0){
            System.out.println("Eingabe Ungültig");
            return;
        } else  {
            quersumme = 0;
            while(n > 0){
                divRest = n % 10;
                quersumme = quersumme + divRest;
                n = ganzzahligAbrunden(n/10);
            }
        }
        System.out.println(quersumme);
    }
}
