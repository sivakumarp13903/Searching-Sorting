package alg;

public class Merge_Sort {
	static void mergeSort(int arr[],int l,int m,int r) {
		int n1=m-l+1;
		int n2=r-m;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		//array cpy
		for(int i=0;i<n1;i++) {
			L[i]=arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			R[i]=arr[m+1+i];
		}
		
		int k=l,i=0,j=0;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k++]=L[i++];
			}
			else {
				arr[k++]=R[j++];
			}
		}
		
		for(;i<n1;i++) {
			arr[k++]=L[i];
		}
		for(;j<n2;j++) {
			arr[k++]=R[j];
		}
		
	}
	
	static void merge(int arr[],int l,int r) {
		if(l<r) {
			int mid=(l+r)/2;
			merge(arr,l,mid);
			merge(arr,mid+1,r);
			mergeSort(arr,l,mid,r);
		}
	}
	
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public static void main(String arg[]) {
		int arr[]= {6,3,8,32,5,2,6,2};
		System.out.print("Before Sorting\n");
		printArray(arr);
		merge(arr,0,arr.length-1);
		System.out.print("After Sorting\n");
		printArray(arr);
		
	}
}
