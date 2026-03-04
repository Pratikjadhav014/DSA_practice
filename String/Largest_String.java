
class Largest_String
{
    public static void main1(String []args)
    {
         String arr [] = {"apple","mango","banana"};

         String largest = arr[0];
         for(int i=1;i<arr.length;i++)
         {
            int a = largest.compareTo(arr[i]);
            System.out.println(a);
            if(a<0)
            {
                largest = arr[i];
            }
         }
         System.out.println(largest);
    }
    //without using compareTo 
    public static void main(String[] args) {
        
        String arr [] = {"apple","mango","banana"};

        String largest = arr[0];
        Boolean isGreater;

        for(int i=1;i<arr.length;i++)
        {
            String current = arr[i];
            int minLength = Math.min(largest.length(),current.length());
            isGreater = false;
            
            for(int j=0;j<minLength;j++)
            {
                 if(largest.charAt(j)<current.charAt(j))
                 {
                       isGreater = true;
                       break;
                 }
                 else if(largest.charAt(j)>current.charAt(j))
                 {
                    isGreater = false;
                    break;
                 }
            }
            if(isGreater)
               {
                  largest = current;
               }
        }
      System.out.println(largest);
    }
}



