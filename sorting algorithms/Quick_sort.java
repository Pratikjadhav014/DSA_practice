class Quick_sort
{
    /*public static void main(String[] args)
    {
        int arr[] = new int []{6,3,9,8,2,5};
        
        int i=-1;
        int pivot = arr[arr.length-1];

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }*/
    
    public static int partition(int arr[],int si,int ei)
    {
        int i=si-1;
        int pivot = arr[ei];
        for(int j=si;j<=ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //this pach of code write to swap the remaining pivot number. 
        // i++;
        // int temp = arr[ei];
        // arr[ei] = arr[i];
        // arr[i] = temp;
        return i;
    }

    public static void quickSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pidx = partition(arr,si,ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }
   public static void main(String[] args) {
       
       int arr[] = new int []{6,3,9,8,2,5};
       quickSort(arr,0,arr.length-1);

       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]+" ");
       }
   }
}