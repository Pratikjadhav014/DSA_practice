class Merge_sort
{

    public static void merge(int arr[],int si,int mid,int ei)
    {
        int len = ei-si+1;
        int temp[] = new int[len];
        
        int i = si;
        int j = mid+1;
        int x = 0;
        while(i<=mid&&j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[x]=arr[i];
                i++;
            }
            else
            {
                temp[x]=arr[j];
                j++;
            }
            x++;
        }

        while(i<=mid)
        {
            temp[x++] = arr[i++];
        }

        while(j<=ei)
        {
            temp[x++] = arr[j++];
        }

         
        for(x=0,i = si;x<temp.length;x++,i++)
        {
            arr[i] = temp[x];
        }
    }


    public static void mergeSort(int arr[],int si,int ei)
    {
         if(si>=ei)
         {
            return;
         }
         int mid = si+(ei-si)/2;
         mergeSort(arr,si,mid);
         mergeSort(arr,mid+1,ei);
         merge(arr,si,mid,ei);
    }
    public static void main(String []args)
    {
        int arr[] = {2,4,6,7,3,9};
        mergeSort(arr,0,arr.length-1);
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}