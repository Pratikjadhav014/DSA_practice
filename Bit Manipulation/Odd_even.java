
import java.util.Scanner;

class Odd_even
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int n = sc.nextInt();

        if((n & 1) == 0)
        {
            System.out.println("even no.");
        }
        else
        {
            System.out.println("odd no.");
        }
    }
}