package alg;

import java.util.Arrays;

public class Counting_Sort {
	public static void main(String arg[]) {
		int inputArray[]= {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
		int k=Arrays.stream(inputArray).max().getAsInt()+1;//getting Max Value
		//range = 0-maxvalue is 9
		int n=inputArray.length;//length
		int count[]=new int[k];//count of each distinct element
		for(int i:inputArray) {
			count[i]++;//3,3,4,0,1,1,0,2,1,2
		}
		for(int i=1;i<k;i++) {
			count[i]+=count[i-1];//prefix sum
			//3,6,10,10,11,12,12,14,15,17
		}
		int sortedArray[]=new int[n];//temp array to assing the sorted array
		//array traversal start from rigth to left beacuse of stablity
		for(int i=n-1;i>=0;i--) {
			sortedArray[--count[inputArray[i]]]=inputArray[i];
		}
		System.arraycopy(sortedArray, 0, inputArray, 0, n);
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(inputArray[i]+" ");
		}
	}
}
