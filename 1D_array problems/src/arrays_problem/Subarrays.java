package arrays_problem;

public class Subarrays {
	public static void subArray(int a[],int n)
	{
		int total_subarray=0;
		int msum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int sum = 0;
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]);
					if(k<j)
					{
						System.out.print(",");
					}
					sum += a[k];
					
				}
				System.out.print("="+sum);
				if(msum<sum)
				{
					msum=sum; 
				}
				total_subarray++;
				System.out.print(" ");
			}
			System.out.println("");
			
		}
		System.out.println("total subarrays:"+total_subarray);
		System.out.println("sum of maximum subarray:"+msum);
	}
	public static void main(String[] args) {
		
		int [] arr = new int[] {1,-2,6,1,13};
		int n = arr.length;	
		
		subArray(arr,n);
	}

}
