class Last_occur
{
    public static int lastOccurence(int arr[],int key,int i,int index)
    {

        if(i == arr.length-1)
        {
           return index;
        }

        if(arr[i] == key)
        {
            index = i;
        }

        return lastOccurence(arr, key, i+1, index);
    }
    public static void main(String[] args) {
        
        int arr [] = {3,5,2,6,7,8,2,3};
        int key = 2;

        System.out.println(lastOccurence(arr,key,0,-1));
    }
}