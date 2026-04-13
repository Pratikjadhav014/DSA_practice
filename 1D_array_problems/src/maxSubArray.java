

class maxSubArray
{
    public static void main(String[] args) {
        
        int nums[] = {1,-2,6,-1,3};
        int sum = Integer.MIN_VALUE;
        int mSum = Integer.MIN_VALUE;
        for(int x = 0;x<nums.length;x++)
        {
            for(int i=x;i<nums.length;i++)
            {
                sum = 0;
                for(int j=x;j<=i;j++)
                {
                    sum += nums[j];
                }
                if(sum>mSum)
                {
                    mSum = sum;
                }
            }
        }
        System.out.println(mSum);
    }
}