package alg;

public class Quick_Sorting {
	static int partition(int arr[],int l,int r) {
		int pivot=arr[l];
		int i=l,j=r;
		while(i<j) {
			while(i<r && pivot>=arr[i]) {
				i++;
			}
			while(pivot<arr[j]) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[l];
		arr[l]=arr[j];
		arr[j]=temp;
		return j;
	}
	static void quickSort(int arr[],int l,int r) {
		if(l<r) {
			int j=partition(arr,l,r);
			quickSort(arr,l,j-1);
			quickSort(arr,j+1,r);
		}
	}
	static void printArray(int arr[]) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String arg[]) {
		int arr[]= {5,4,5,3,9,2,1,8};
		System.out.print("Before Sorting\n");
		printArray(arr);
		System.out.print("\nAfter Sorting\n");
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}
}
