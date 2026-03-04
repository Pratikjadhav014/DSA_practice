/*class Odd_No_In_String {
    public String largestOddNumber(String num) {
        int count = 0;
        for(int i=0;i<num.length();i++)
        {
            int n= num.charAt(i)-'0';
            if(n%2!=0&&count == 0)
            {
                int odd = n;
                count++;
                break;
            }
            if(n%2!=0)
            {
                if(odd<n)
                {
                    odd = n;
                }
            }
        }
        return String.valueOf(odd);
    }
}*/