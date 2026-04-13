class Basic
{
    public static void printDec(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        printDec(n-1);
    }

    public static void println(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        println(n-1);
        System.out.println(n);
    }

    public static int factorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        return n*factorial(n-1);
    }

    public static int sum(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        return n + sum(n-1);
    }

    public static void main(String []args)
    {
        //print n to 1
        System.out.println("Decreasing order no:");
        printDec(5);

        //print 1 to n
        System.out.println("Increasing order no:");
        println(5);

        //factorial 
        System.out.println("Factorial:"+ factorial(5));

        // sum of natural no 
        System.out.println("sum of natural no :"+ sum(5));
       

    }
}