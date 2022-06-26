public class IterativeSort {

    public static void swapElements(int[] array, int i, int j) {
        int N = array.length;
        if (N < 2 || i < 0 || j < 0 || i > N || j > N) {
            System.out.println("Error: Invalid input");
            return;
        }
        //Vertauschen der Array Elemente an Position i und j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] iterativeSort(int[] array) {
        int N = array.length;
        if(N < 2){
            System.out.println("Error: Invalid input");
            return null;
        }
        /*
         * j < N da bei j <= N wir out of bounds gehen
         * wenn i bei 1 anfangen wuerde, erhalten wir den Fehler
         * das naturelich unser erstes Element nicht mit sortiert wird
         * 
         * Aufgabe 1b)
         * Laufzeit = O(n^2)
         * da wir eine doppelt verschachtelte Schleife benutzen
         */
        int i = 1;
        while (i < N){
            int j = i + 1;
            while(j <= N){
                if(array[i] > array[j]){//Wenn ein Element größer als das nächste ist, dann tauschen
                    swapElements(array, i, j);
                }
                j++;
            }
            i++;
        }
        return array;
    }

    //Gibt Array in schöner form aus
    public static String toString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if(i != array.length - 1){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        //Generate one random array of the length 10
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array 1: " + toString(iterativeSort(array)));
    }
}
