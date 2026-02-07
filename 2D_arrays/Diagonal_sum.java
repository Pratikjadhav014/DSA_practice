class Diagonal_sum
{
    public static void main(String[] args) {
        int arr[][] ={
             {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        //primary diagonal
        int n = 3;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            
            sum+=arr[i][i];
        }
         System.out.println(sum);
        //secondary diagonal
        int i=0,j=n-1;
        for(i=0;i<n;i++)
        {
            if(n%2!=0&&i==j)
            {
                sum+=0;
                j--;
            }
            else{
                sum+=arr[i][j];
                j--;
            }
        }
        System.out.println(sum);
    }
}