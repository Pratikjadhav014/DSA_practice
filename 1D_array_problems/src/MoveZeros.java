class MoveZeros
{
    public static void main(String[] args) {
        
        int arr[] =new int []{2,0,5,0,3};
        int i = -1;
        for(int j=0;j<arr.length;j++)
        {
             if(arr[j]!=0)
             {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
             }
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}