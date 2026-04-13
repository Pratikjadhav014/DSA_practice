class ClearRangeOf_bit
{
    public static void main(String[] args) {
        
        int n = 2515;
        int i = 2,j = 7;

        int a = (1<<i)-1;
        int b = ((-1)<<(j+1));

        int bitMask = a|b;

        System.out.println(n & bitMask);
    }
}