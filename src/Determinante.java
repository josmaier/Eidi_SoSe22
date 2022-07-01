/**
 * Ein Demo-Programm zur Determinantenberechnung Laplace Entwicklung nach 1. Spalte
 * @author Friedhelm Schwenker
 * @version 1.0
 */


public class Determinante {

    public static void main(String[] args) {
	int n = 3; 				// Vorsicht n<=10 
        int [][] mat = new int [n][n]; 

 	init(mat);
	printMatrix(mat);

       System.out.println("det(M) = " + det(mat));	

    }

    // initialisiert mat mit zufälligen werten
    private static void init(int [][] mat){
	float scale = 10.0f;
	for(int i=0; i < mat.length; i++) {
           for(int j=0; j < mat.length; j++) {
               mat[i][j] = (int) ((Math.random() - 0.5) * scale);
           }
       }
    }

    // implementieren sie diese methode
    private static int det(int [][] mat){
        // TODO


    }

    // streicht die erste sparlte und zeile row aus mat
    private static int [][] reduceMatrix(int [][] mat, int row){
	int [][] redMat = new int [mat.length-1][mat.length-1];
	
	for(int i=0; i < redMat.length; i++){ 
	    for(int j=0; j < redMat.length; j++){
                if (i < row)
          	    redMat[i][j] = mat[i][j+1];
          	else
	            redMat[i][j] = mat[i+1][j+1];
	    }
	}
	return redMat;
    } 

    // gibt den inhalt von mat aus
    private  static void printMatrix(int [][] mat){
        for(int i=0; i < mat.length; i++){ 
            for(int j=0; j < mat.length; j++)
                System.out.print(mat[i][j] + " ");
                System.out.println();
	}
    }


}   
