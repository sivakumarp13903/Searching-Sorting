package alg;

public class Heap_Sort {
	static void heapfying(int arr[],int n,int i) {
		int parent=i;
		int left_child=i*2+1;
		int right_child=i*2+2;
		if(left_child<n && arr[parent]<arr[left_child]) {
			parent=left_child;
		}
		if(right_child<n && arr[parent]<arr[right_child]) {
			parent=right_child;
		}
		if(parent!=i) {
			int temp=arr[parent];
			arr[parent]=arr[i];
			arr[i]=temp;
			heapfying(arr,n,parent);
		}
	}
	static void heapSort(int[] arr) {
		int n=arr.length;
		for(int i=(n/2)-1;i>=0;i--) {
			heapfying(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapfying(arr,i,0);
		}
	}
	
	static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String arg[]) {
		int arr[]= {12,34,1,76,6,5,4,32,2,65};
		heapSort(arr);
		printArray(arr);
	}
}
