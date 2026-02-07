class CoordinatesDist
{
    public static void main(String[] args)
    {
         String s = "WNEENESENNN";
         int n = s.length();
         int x = 0,y = 0;
         /*for(int i=0;i<n;i++)
         {
            if(s.charAt(i)=='N')
            {
                y++;
            }
            else if(s.charAt(i)=='S')
            {
                y--;
            }
            else if(s.charAt(i)=='W')
            {
                x--;
            }
            else
            {
                x++;
            }
         }*/
        //switch case
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                default:
                    throw new AssertionError();
            }
        }
         int dist = (0+x)*(0+x)+(0+y)*(0+y);
         System.out.println(Math.sqrt(dist));
    }
}