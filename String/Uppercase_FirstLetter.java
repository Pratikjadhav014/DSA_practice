class Uppercase_FirstLetter
{
    public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder("dok top suk");

        s.setCharAt(0,Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                 s.setCharAt(i+1,Character.toUpperCase(s.charAt(i+1)));
            }
        }
         System.out.println(s);

    }
}