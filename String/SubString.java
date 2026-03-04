class SubString
{
    public static String subString(String s,int start,int end)
    {
        String x = "";
        for(int i=start;i<end;i++)
        {
            x+=s.charAt(i);
        }
        return x;
    }
    public static void main(String []args)
    {
        String s = "Hello World";
        System.out.println(subString(s,0,5));
        //inbuilt function
        System.out.println(s.substring(0,4));
    }
}