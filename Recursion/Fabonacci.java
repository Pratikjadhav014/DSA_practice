class Fabonacci
{
    public static int fabonacci_no(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        int f1 = fabonacci_no(n-1);
        int f2 = fabonacci_no(n-2);

        return f1 + f2;
    }
    public static void main(String[] args) {
        
        int a = fabonacci_no(5);
         System.out.println(a);

    }
}