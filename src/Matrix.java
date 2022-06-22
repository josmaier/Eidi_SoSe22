public class Matrix {

    /**
     * This method calculates the absolute sum of all values
     * in a array, then retuns the sum. It first checks if the array
     * is invalid, if so it returns -1.0 and a error message
     * @param arr           double[] array used to calculate the sum
     * @return              double   absolute sum
     */
    public static double berechneBetragssumme(double[] arr){
        double sum = 0;
        //check for invalid array
        if(arr == null || arr.length ==0){
            System.out.println("Das Array ist ungültig");
            return -1;
        }
        //for each loop used to walk through array
        for(double element : arr){
            sum += Math.abs(element);
        }
        return sum;
    }

    /**
     * This method first calculates all the absolute values of each 
     * "line" of the 2 dimensional array. It first checks if the 
     * array is valid, if so it prints a error message into the console
     * and returns -1. It then calculates the absolute sum of each
     * "line", then checks which one has the highest absolute sum 
     * and returns the highest
     * @param mat           double[][] 2 dimensional array
     * @return              double     highest absolute sum
     */ 
    public static double berechneZeilennorm(double[][] mat){
       
        if(mat == null|| mat.length == 0 || mat[0].length == 0){
            System.out.println("Das Array ist ungültig");
            return -1;
        }
        
        double[] results = new double[3];
        int i = 0;
        double res = 0;
        
        for(double[] temparr : mat){
            results[i] = berechneBetragssumme(temparr);
            if(results[i] > res){
                res = results[i];
            }
            i++;
        }

        return res;
        
    }


    public static void main(String[] args) {
        double[][] array = {
            {2.4,3.5,6.65},
            {5.3,4.3,3.3},
            {8.9,2452.0,444.0},
        };

        System.out.println(berechneZeilennorm(array));

    }
    
}
