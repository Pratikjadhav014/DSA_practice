class First_occur
{
    public static int first_occurence(int arr[],int key,int i)
    {
         if(i == arr.length - 1)
         {
            return -1;
         }

         if(arr[i] == key)
         {
            return  i;
         }

         return first_occurence(arr, key, i+1);
    }
    public static void main(String []args)
    {
        int arr [] = {1,4,7,3,9,2};
        int key = 9;
        System.out.println(first_occurence(arr,key,0));
    }
}