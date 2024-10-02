package alg;
import java.util.*;
public class Binary_Search {
	static int binarySearch(int[] arr,int n,int ser) {
		int l=0,h=n-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==ser) {
				return mid;
			}
			if(arr[mid]>ser) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}return -1;
	}
	
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of the Array:\n");
		int n=sc.nextInt();
		System.out.print("Enter the Array Elements\n");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Search Element:\n");
		int ser=sc.nextInt();
		int a=binarySearch(arr,n,ser);
		if(a==-1) {
			System.out.println("Element Not Found\n");
		}
		else {
			System.out.println("Element Found at index : "+(a+1));
		}
		sc.close();
	}
}
