package arrays_problem;
import java.util.*;

public class MamSubarraySum2 {

	public static void maxSubArray(int arr[],int n)
	{
		int sum = 0,max_sum = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				sum= i==0 ? arr[j] : arr[j]-arr[i-1];
				System.out.println("="+sum);
			}
			if(max_sum<sum)
			{
				max_sum = sum;
			}
			sum = 0;
		}
		System.out.println("\nmax subarray sum :"+max_sum);
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,-2,6,-1,3};
		int n = arr.length;
		
		for(int i=1;i<n;i++)
		{
			arr[i] = arr[i-1] + arr[i];
		}
		System.out.print("prefix sum of arr:");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		maxSubArray(arr,n);

	}

}
