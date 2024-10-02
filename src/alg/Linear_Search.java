package alg;
import java.util.*;
public class Linear_Search {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:\n");
		int n=sc.nextInt();
		boolean res=false;
		System.out.println("Enter the Array Elements:\n");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Search Element:\n");
		int ser=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(ser==arr[i]) {
				System.out.println("Element found At index :"+i);
				res=true;
				break;
			}
		}
		if(!res) {
				System.out.println("Element Not found");
			
		}
		sc.close();
	}
}
