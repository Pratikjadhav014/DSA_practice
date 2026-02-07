
import java.util.Scanner;

class First{

    public static boolean search(int arr[][],int key,int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.println("cell of this key elemen:"+"("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[][] = new int [2][3];
        int n = arr.length;//row length
        int m = arr[0].length;//col length
        //give input
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        //print array
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        //search the cell where key element present
         System.out.println(search(arr,5,n,m));

    }
}