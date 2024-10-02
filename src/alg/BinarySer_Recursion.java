package alg;
import java.util.*;
public class BinarySer_Recursion {
	static int binarySearch(int[] arr,int l,int h,int ser) {
		if(l>h) {
			return -1;
		}
		else {
			int mid=l+(h-l)/2;
			if(arr[mid]==ser) {
				return mid;
			}
			if(arr[mid]>ser) {
				return binarySearch(arr,l,mid-1,ser);
			}
			else {
				return binarySearch(arr,mid+1,h,ser);
			}
		}
	}
	
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of the Array:\n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the Array Elements\n");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Search Element:\n");
		int ser=sc.nextInt();
		int a=binarySearch(arr,0,n-1,ser);
		if(a==-1) {
			System.out.println("Element Not Found\n");
		}
		else {
			System.out.println("Element Found at index : "+(a+1));
		}
		sc.close();
	}
}
