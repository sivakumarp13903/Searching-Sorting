package alg;

import java.util.*;

public class Radix_Sort {
	static void counting_sort(int[] arr,int n,int pass) {
		int count[]=new int[10];
		for(int i=0;i<n;i++) {
			++count[(arr[i]/pass)%10];
		}
		for(int i=1;i<count.length;i++) {
			count[i]+=count[i-1];
		}
		int B[]=new int[n];
		for(int i=n-1;i>=0;i--) {
			B[--count[(arr[i]/pass)%10]]=arr[i];
		}
		System.arraycopy(B, 0, arr, 0, n);
	}
	static void radix_sort(int[] arr,int n) {
		int max=Arrays.stream(arr).max().getAsInt();
		for(int pass=1;max/pass>0;pass*=10) {
			counting_sort(arr,n,pass);
		}
	}
	static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Before Sorting : \n");
		display(arr);
		radix_sort(arr,arr.length);
		System.out.println("\nAfter Sorting : \n");
		display(arr);
		sc.close();
	}
}
