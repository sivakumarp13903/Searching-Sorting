package alg;
import java.util.*;
public class Insertion_Sort {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array Size:\n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
