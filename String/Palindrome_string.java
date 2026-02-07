
class Palindrome_string
{
    public static void main(String []args)
    {
        String s = "raceacar";

        //String x = s.replace(" ", "");
        //System.out.println(s);
        boolean a = false;
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                a = false;
            }
        }
    }
}