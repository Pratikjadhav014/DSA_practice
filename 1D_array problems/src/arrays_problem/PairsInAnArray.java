package arrays_problem;
import java.util.Scanner;
public class PairsInAnArray {

	public static void pairs(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				System.out.println("("+a[i]+","+a[j]+")");
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		int n = arr.length;
		System.out.println("enter the no:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		pairs(arr,n);
		sc.close();

	}

}
