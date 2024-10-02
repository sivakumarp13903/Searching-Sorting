package alg;
import java.util.*;
public class Selection_sort {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            if(minIndex!=i) {
            	int t=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=t;
            }
  
            }
        for(int i: arr) {
            System.out.print(i + " ");
        }
		sc.close();
	}
}
