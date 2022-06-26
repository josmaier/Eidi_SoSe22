public class IterativeSort {

    public static void swapElements(int[] array, int i, int j) {
        int N = array.length;
        if (N < 2 || i < 0 || j < 0 || i > N || j > N) {
            System.out.println("Error: Invalid input");
            return;
        }
        //Swap array elements at position i and j
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
         * Aufgabe 1b)
         * Laufzeit = O(n^2)
         * da wir eine doppelt verschachtelte Schleife benutzen
         */
        int i = 1;
        while (i < N){
            int j = i + 1;
            while(j <= N){
                if(array[i] > array[j]){//If next element is bigger than current one, swap them
                    swapElements(array, i, j);
                }
                j++;
            }
            i++;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = {4, 2, 24, 5123, 12, 2145, 12, 44, 124, 11, 0, 1};
        System.out.println("Array 1: ");
        iterativeSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
