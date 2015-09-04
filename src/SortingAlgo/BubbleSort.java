package SortingAlgo;

import java.util.Scanner;

public class BubbleSort {

	/*code basics 
	 * 
	 * for i = arr.length -1 ; i>= o ;i-- //select 1st element of array 
	 * for int j =1 ;j<= i ; j++ //no of iterations . select 2nd element of array
	 * if arr.[j-1] > arr.[j]
	 * {int temp = arr.[j-1]
	 *  int [j-1] = arr.[j]
	 *  int [j] = temp ;
	 * 
	 * */
	 public static void main(String []args) {
		    int n, c, d, swap;
		    Scanner in = new Scanner(System.in);
		 
		    System.out.println("Input number of integers to sort");
		    n = in.nextInt();
		 
		    int array[] = new int[n];
		 
		    System.out.println("Enter " + n + " integers");
		 
		    for (c = 0; c < n; c++)  /*loop for user input elements */
		      array[c] = in.nextInt();
		 
		    for (c = 0; c < ( n - 1 ); c++) {
		      for (d = 0; d < n - c - 1; d++) {
		        if (array[d] > array[d+1]) /* For descending order use < */
		        {
		          swap       = array[d];
		          array[d]   = array[d+1];
		          array[d+1] = swap;
		        }
		      }
		    }
		 
		    System.out.println("Sorted list of numbers");
		 
		    for (c = 0; c < n; c++) 
		      System.out.println(array[c]);
		  }
}
