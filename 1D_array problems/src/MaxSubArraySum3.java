package arrays_problem;

public class MaxSubArraySum3 {

	public static void main(String[] args) {
		
		
		int arr[] = new int[] {-1,-2,-6,-1,-3};
		int n = arr.length;
		int sum = 0,msum=Integer.MIN_VALUE;
		//kadanse algo fail when all no are negative
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				count++;
			}
		}
		if(count != n)
		{
			for(int i=0;i<n;i++)
			{
				sum +=arr[i];
				if(sum<0)
				{
					sum=0;
				}
				if(msum<sum)
				{
					msum = sum;
				}
			}
		}
		else
		{
			 msum=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				if(msum<arr[i])
				{
					msum = arr[i];
				}
			}
		}
		
		System.out.println("max subarray of sum using kadance algorithm :"+  msum);

	}

}
