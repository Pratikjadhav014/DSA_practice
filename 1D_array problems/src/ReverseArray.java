package arrays_problem;
import java.util.Scanner;

public class ReverseArray {
	
	public static void swap(int a[],int f,int e)
	{
		a[f] = a[f] + a[e];
		a[e] = a[f] - a[e];
		a[f] = a[f] - a[e];
	}
	
	public static void reverseNo(int a[],int n)
	{
		int first = 0,end = n-1;
		while(first<end)
		{
			swap(a,first,end);
			first++;
			end--;
			
			/*int temp = a[first];
			a[first] = a[end];
			a[end] = temp;
			first++;
			end--;*/
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		int n = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no :");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		reverseNo(arr,n);
		System.out.println("reverse array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
