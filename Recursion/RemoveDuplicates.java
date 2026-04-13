class RemoveDuplicates
{
     
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[])
    {
        if(idx == str.length())
        {
           System.out.println( newStr.toString());
           return;
        }
        
        char x = str.charAt(idx);
        if(map[x-'a'] == true)
        {
            removeDuplicates(str, idx+1, newStr, map);
        }
        else
        {
            map[x-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(x), map);
        }

    }

    public static void main(String[] args) {
        
        String str = "appnncollege";
        boolean map[] = new boolean[26];
        StringBuilder newStr = new StringBuilder();

        removeDuplicates(str,0, newStr,map);
        
    }
}