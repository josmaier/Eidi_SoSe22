public class PositiveEintraege {

    public static int anzahlPositive(double[][] matrix){
        int x = 0;
        if(matrix.length == 0 || matrix == null 
        || matrix[0].length == 0){
            System.out.println("Matrix ungueltig");
            return -1;
        }
        for(double[] array : matrix){
            for(double element : array){
                if(element > 0){
                    x++;
                }
            }
        }
        return x;
    }
    public static void main(String[] args) {
        double[][] array = new double[3][3];
        array[1][1] = 1;
        array[2][2] = -23;

        System.out.println("Das Array enthält " 
        + anzahlPositive(array) + " positive Elemente");


    }
    
}
