import java.util.Scanner;

class Operations
{

    public static int getIth_bit(int n,int i)
    {
         if( (n & (1<<i)) == 0)
         {
            return 0;
         }
         else
         {
            return 1;
         }
    }

    public static int setIth_bit(int n,int i)
    {
        return (n | (1<<i)) ;
        
    }

    public static int clearIth_bit(int n,int i)
    {
        return (n & ~(1<<i));
    }

    public static int updateith_bit(int n,int i,int nb)
    {
        n = (n & ~(1<<i));
        return (n | (nb<<i));
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the ith no:");
        int i = sc.nextInt();

        //Get ith bit 
        System.out.println(getIth_bit(15,i));

        //set ith bit
        System.out.println(setIth_bit(15,i));

        //clear ith bit
        System.out.println(clearIth_bit(10,i));

        //update ith bit 
        int newBit = 1;
        System.out.println(updateith_bit(10,i,newBit));

    }
}