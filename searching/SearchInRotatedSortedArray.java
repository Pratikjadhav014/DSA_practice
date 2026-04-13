class SearchInRotatedSortedArray
{
    public static void main(String []args)
    {
        int arr[] = new int[]{5,6,1,2,3,4};
        int target = 3;

        int si = 0;
        int ei = arr.length-1;
        while(si<=ei)
        {
            int mid = (si+ei)/2;
            
            if(arr[mid] == target)
            {
                System.out.println(mid);
            }
            if(arr[si]<=arr[mid])
            {
                if(arr[si]<=target&&target<=arr[mid])
                {
                    ei = mid-1;
                }
                else
                {
                    si = mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target&&target<=arr[ei])
                {
                    si = mid+1;
                }
                else
                {
                    ei=mid-1;
                }
            }
        }
    }
}