package SortingAlgo;

public class InsertionSort {

	
	/*code
	 * for j =2 to arr.length
	 * key = a[j]  - -insert a[j] into sorted sequence a[i...j-1]
	 * --it will pick the jth element , key k is used to hold jth element
	 * i = j-1;
	 * 
	 * */
	public static void main(String[] args) {
        
        int[] input = { 14, 2, 19, 60, 23, 12, 34, 0, 10 };
        insertionSort(input);
    }
     
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
 
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];                     //here ,array[i+1] is j's previous value. 
                i--;										// when i-- takes i=0 it will brake the while loop so 
                											// value of i+1 goes to the key.and start the loop again.  
            }
            array[i+1] = key;
            printNumbers(array);
        }
    }
}
