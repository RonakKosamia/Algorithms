package SortingAlgo;

public class Mergesort {
/*
 *    Divide the unsorted 
 *    array into n partitions, each partition contains 1 element. Here the one element is considered as sorted.
 *    Repeatedly merge partitioned units to produce new sublists until there is only 1 sublist remaining. This 
 *    will be the sorted list at the end.
 *    
 *    merge(A p q r){
 *    n1 = q -p+1
 *    n2 = r-q
 *    let L[1 .to.. n1+1] && R[1 .to.. n2+1]
 *    for i =1 to n1
 *    //copy first list into L aarray
 *    L[i] = A[p+i -1]
 *    for (j = 1 to n2)
 *    R[i ]= A[q+j]
 *    L[n1 + 1 ] = infinity   --set last eleemnts as infinity
 *    R[n2 + 1 ] = infinity  -- 
  * */
	 private int[] array;
	    private int[] tempMergArr;
	    private int length;
	 
	    public static void main(String a[]){
	         
	        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
	        Mergesort mms = new Mergesort();
	        mms.sort(inputArr);
	        for(int i:inputArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
	     
	    public void sort(int inputArr[]) {
	        this.array = inputArr;
	        this.length = inputArr.length;
	        this.tempMergArr = new int[length];
	        doMergeSort(0, length - 1);
	    }
	 
	    private void doMergeSort(int lowerIndex, int higherIndex) {
	         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            // Below step sorts the left side of the array
	            doMergeSort(lowerIndex, middle);
	            // Below step sorts the right side of the array
	            doMergeSort(middle + 1, higherIndex);
	            // Now merge both sides
	            mergeParts(lowerIndex, middle, higherIndex);
	        }
	    }
	 
	    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	 
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr[i] = array[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (tempMergArr[i] <= tempMergArr[j]) {
	                array[k] = tempMergArr[i];
	                i++;
	            } else {
	                array[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	    }

}
