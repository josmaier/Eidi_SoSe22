/**
 * Programm zur binaeren Suche eine gegebenen Elements (ganze Zahl) in einer 
 * Folge von Elementen. Die Elemente sind in einem Array abgelegt.
 * Edit: Funktion wurde ungeschrieben und ist nun Rekursiv
 * Es werden vorgestellt:
 * - Verwendung von Arrays (geordnet) fuer binaere Suche (mit sukzessiver 
 *   Halbierung der Datenmenge)
 * - iterative Positionsbestimmung fuer ein in dem Array vorkommendes Element
 * Autor: hn, Jan.2011, Anpassungen JK Dez. 2015, Anpassungen Joscha Maier Jun. 2022
 */
public class BinarySearch {
	
	/** The value if key was not found. */
	static final int NO_KEY = -1;
	
	/**
	 * The main program.
	 */
	public static void main(String[] args) {
		
		
		int[] seq = new int[] { 2, 4, 5, 6, 7, 8, 9, 11};  // Elemente sind sortiert
		int   k   = 15;  // konvertiere Konsole-Eingabe in int

		System.out.println("Binäre Suche (Position): " + search(seq, k, 0, seq.length-1));
	}  // end main

	/**
	 * Recrusive Binary search for the given key in the given integer-array.
	 * @param sequence The given int-array.
	 * @param key The given key to search for.
	 * @param min Lower bound of the search.
	 * @param max Upper bound of the search.
	 * @return the index of the key if found, -1 otherwise. 
	 */
	/*
	 * 3b) Die Methode ist Endrekurisv, da der Rekursionsaufruf am
	 * ende der Methode steht.
	 *  
	 * 3c) Der Worst case tritt auf, wenn das element nicht im Array enthalten ist
	 * und der search key größer als das letzte Element/kleiner als das erste element ist.
	 * 
	 * 3d) O(log(n)) Da wir die Daten in jedem schritt halbieren,
	 * benötigen für einen extra schritt jedes mal, wenn sich die 
	 * Datenmenge verdoppelt
	 */	
	 static int search(int[] sequence, int key, int min, int max) {
		
		//Checking if the input is legal
		if (min > max || min < 0 || max < 0 || sequence.length < 1 
		|| max > sequence.length-1) {
			System.out.println("Error: Illegal Input");
			return NO_KEY;
		}
		int middle = (min + max) / 2;
		if(sequence[middle] == key){
			return middle;
		} else if(middle == sequence.length-1|| middle == 0){
			//Used to exit the function if the given key is not contained
			//in the array given
			System.out.println("Error: Key not in Array");
			return NO_KEY;
		} else if (sequence[middle] > key){
			return search(sequence, key, min, middle - 1);
		} else if (sequence[middle] < key){
			return search(sequence, key, middle + 1, max);
		} else {
			return NO_KEY;
		}
		
	}  // end search 
	
}  // end class BinarySearch
