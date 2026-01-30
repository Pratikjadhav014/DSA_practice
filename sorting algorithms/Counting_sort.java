class Counting_sort
{
    public static void main(String[] args) {
        
        int arr[] = {1,4,1,3,2,4,3,7};
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            max = Math.max(max,arr[i]);
        }
        int extra[] = new int[max+1];

        for(int i=0;i<n;i++)
        {
            int a = arr[i];
            extra[a]++;
        }
        //[0,2,1,2,2,0,0,1]
        
        int index = 0;
        for(int i=0;i<extra.length;i++)
        {
            while(extra[i]>0)
            {
                arr[index] = i;
                index++;
                extra[i]--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.err.println(arr[i]);
        }
    }
}