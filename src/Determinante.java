/**
 * Ein Demo-Programm zur Determinantenberechnung Laplace Entwicklung nach 1.
 * Spalte
 * 
 * @author Friedhelm Schwenker
 * Edit: Joscha Maier Martin Graf July 2022
 * -Added calculateDeterminanteReducedMatrix(int [][]) 
 * -Implemented det(int[][], int, int)
 * @version 1.1
 */

public class Determinante {

    public static void main(String[] args) {
        int n = 3; // Vorsicht n<=10
        int[][] mat = new int[n][n];

        init(mat);
        printMatrix(mat);

        System.out.println("det(M) = " + det(mat, 0, 0));

    }

    // initialisiert mat mit zufälligen werten
    private static void init(int[][] mat) {
        float scale = 10.0f;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) ((Math.random() - 0.5) * scale);
            }
        }
    }

    /**
     * Recusive calculation for the determiant of a matrix, gets less 
     * accurate with increasing matrix size 
     * @param mat       input matrix
     * @param sum       sum needed for calculation
     * @param i         count variable needed for sum calculation
     * @return          determinant of the input matrix
     */
    private static int det(int[][] mat, int sum, int i) {
        if (mat.length <= 10 && i <= mat.length - 1) {
            // sum i = 0 to n of (-1^i+1 * mi1 * det * m-i1)
            sum += (Math.pow(-1, i + 1)) * mat[i][0] * calculateDeterminantReducedMatrix(reduceMatrix(mat, i));
            return det(mat, sum, (i + 1));
        } else if (mat.length == 1) {
            return mat[0][0];
        } else if (i == mat.length) {
            return sum;
        } else {
            System.out.println("Input error");
            return -1;
        }

    }

    //works, no touchy
    /**
     * Used to calculate the deteminant of the reduced matrix,
     * if the input matrix is larger than n=2 use the det function
     * to calculate it's determinant
     * @param mat       reduced matrix
     * @return int      determinant
     */
    private static int calculateDeterminantReducedMatrix(int[][] mat) {
        if(mat.length > 2){
            return det(mat, 0, 0);
        }
        if (mat[0][0] == 0 && mat[0][1] == 0 || mat[0][0] == 0 && mat[1][0] == 0
        || mat[0][1] == 0 && mat[1][1] == 0 || mat[0][0] == 0 && mat[1][1] == 0) {
            return 0;
        } else {
            return (mat[0][0] * mat[1][1]) - (mat[1][0] * mat[0][1]);
        }
    }

    // Streicht die erste spalte und Zeile row aus mat
    private static int[][] reduceMatrix(int[][] mat, int row) {
        int[][] redMat = new int[mat.length - 1][mat.length - 1];

        for (int i = 0; i < redMat.length; i++) {
            for (int j = 0; j < redMat.length; j++) {
                if (i < row)
                    redMat[i][j] = mat[i][j + 1];
                else
                    redMat[i][j] = mat[i + 1][j + 1];
            }
        }
        return redMat;
    }

    // gibt den inhalt von mat aus
    private static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

}
