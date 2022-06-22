public class Quersummen {

    public static void quersummenVonQuersummen(boolean quersummeVonQuersumme, int... numbers) {

        int quersumme;
        int divRest;
        int summe = 0;

        if (numbers == null || numbers.length <= 0) {
            System.out.println("Die eingabe it ungueltig");
            return;
        }

        for (int n : numbers) {
            quersumme = 0;
            while (n > 0) {
                divRest = n % 10;
                quersumme = quersumme + divRest;
                n = (int) (n / 10);
            }
            System.out.println(quersumme);
            summe += quersumme;
        }

        System.out.println(summe);

        //Wenn der boolean Wert true ist wiederhole den Quersummen 
        //Algorithmus mit der Summe der vorherigen Quersummen
        if (quersummeVonQuersumme) {
            quersumme = 0;
            while (summe > 0) {
                divRest = summe % 10;
                quersumme = quersumme + divRest;
                summe = (int) (summe / 10);
            }
            System.out.println(quersumme);
        }

    }

    public static void main(String[] args) {
        quersummenVonQuersummen(true, 123, 92, 57, 30);
        System.out.println();
        quersummenVonQuersummen(false, 12,9,4);

    }

    

}
