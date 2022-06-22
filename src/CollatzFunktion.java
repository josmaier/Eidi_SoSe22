import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CollatzFunktion {


    public static int collatz(int n){
        if(n == 0){
            System.out.println("Die Eingabe ist ungueltig");
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n%2 != 0) {
            return collatz(3*n + 1);
        } else {
            return collatz(n/2);
        }
        
    }
    
    /* 
     * Generell benoetigen Primzahlen im durschnitt länger zur berechnung
     * als nicht Primzahlen.
     * Zwischen ungeraden und geraden Zahlen lässt sich kein großer unterschied feststellen.
     * Die größe der Zahlen schein auch keine besondere Rolle zu spielen
     */
    public static void main(String[] args) {
        long time = 0;
        //schreiben der werte in eine extra .txt Datei zum einfacheren lesen
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("Output.txt"));
            for(int i = 1; i <= 1000; i++){
                long start = System.nanoTime();
                collatz(i);
                long end = System.nanoTime();
                time = (end - start);
                System.out.println(i + " elapsed time: " + time);//ausgabe in Konsole da in Aufgabe gewünscht
                writer.write(i + " elapsed time: " + time + "\n");
                }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}
