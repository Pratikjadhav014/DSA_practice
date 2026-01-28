package arrays_problem;

public class TrappingRainWater {

	public static void calLeftMax(int arr[],int leftMax[],int n)
	{
        leftMax[0] = arr[0];
        System.out.print("left max array :"+leftMax[0]);
		for(int i=1;i<n;i++)
		{
			if(leftMax[i-1]<arr[i])
			{
				leftMax[i] = arr[i];
			}
			else
			{
				leftMax[i] = leftMax[i-1];
			}
			System.out.print(leftMax[i]);
		}
	}
	public static void calRightMax(int arr[],int rightMax[],int n)
	{
		rightMax[n-1] = arr[n-1];
		
		for(int i=n-2;i>=0;i--)
		{
			if(rightMax[i+1]<arr[i])
			{
				rightMax[i] = arr[i];
			}
			else
			{
				rightMax[i] = rightMax[i+1];
			}
		}
		System.out.print("\nright max array :");
		for(int i=0;i<n;i++)
		{
			System.out.print(rightMax[i]);
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[] {4,2,0,6,3,2,5};
		int leftMax[] = new int[7];
		int rightMax[] = new int[7];
		int n = arr.length;
		calLeftMax(arr,leftMax,n);
		calRightMax(arr,rightMax,n);
		int tw = 0;
		
		System.out.println(" ");
		for(int i=0;i<n;i++)
		{
			int wl = Math.min(leftMax[i],rightMax[i]);
			tw += (wl-arr[i]);
			int p = (wl-arr[i]);
			System.out.println("trapped water:"+arr[i]+"="+p);
		}

		System.out.println("total trapped water :"+tw);
	}

}
