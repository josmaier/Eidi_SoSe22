public class ShakerSort {

    /**
     * Recursive Method to use shaker sort on the given array.
     * @param array             The array to sort.
     * @param lowerBoundary     The lower boundary of the sort.
     * @param upperBoundary     The upper boundary of the sort.
     * @return                  The sorted array or a recursive call if the array is not sorted.
     */
    public static int[] sort(int[] array, int lowerBoundary, int upperBoundary){

        if(lowerBoundary == upperBoundary + 1){//if the array is sorted return it
            return array;
        } else if(array == null || array.length < 2 || lowerBoundary < 0 
        || upperBoundary < 0 || lowerBoundary > upperBoundary || upperBoundary > array.length-1){//check for non compliant inout
            System.out.println("Illegal Input");
            return null;//return null if input is non compliant
        } else {
            //iterate through array from the left to the right 
            for(int i = lowerBoundary; i < upperBoundary; i++){
                if(array[i] > array[i+1]){//swap elements
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            //iterate through array from the right to the left
            for(int i = upperBoundary; i > lowerBoundary; i--){
                if(array[i] < array[i-1]){//swap elements
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
            }
            //recursive call to sort the array, but with the new boundaries
            //now not looking at the sorted part of the array anymore
            return sort(array, lowerBoundary+1, upperBoundary-1);
        }
    }

    public static String toString(int[] arr){
        String s = "[ ";
        for(int i = 0; i < arr.length; i++){
            s += arr[i] + " ";
        }
        s += "]";
        return s;
    }

    public static void main(String[] args) {
        int[] array = {29, 13, 89, 41, 30, 71, 92, 39, 64, 37};
        System.out.println("Unsorted Array: " + toString(array));
        int[] sortedArray = sort(array, 0, array.length-1);
        System.out.println("Sorted Array: " + toString(sortedArray));
    }
}
