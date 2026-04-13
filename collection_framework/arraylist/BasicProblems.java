import java.util.ArrayList;
import java.util.Collections;
class BasicProblems
{
    //print reverse list
    public static void main1(String[] args) {
         
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (int i =  list.size()-1; i>=0; i--) {
            System.out.println(list.get(i));
        }
    }

    //find maximum no
    public static void main2(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        
        int maxNo = Integer.MIN_VALUE;
        for (int i = 0; i<list.size(); i++) {
            
            // if(maxNo<list.get(i))
            // {
            //    maxNo = list.get(i);
            // }
            //using inbuild Math.max(ele1,ele2).ruturn maximum bet ele1 and ele2.
            maxNo = Math.max(maxNo,list.get(i));
        }
        System.out.println("Maximum No:"+maxNo); 
    }
    
    //swap two element of array list basis of given index
    public static void swap(ArrayList<Integer>list,int a,int b)
    {
        int temp = list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
    public static void main3(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        
        int idx1 = 0;
        int idx2 = 2;
        swap(list,idx1,idx2);
        System.out.println(list);
    }

    //inbuild Collections.sort() method
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(3);
        
        //Ascending order
        Collections.sort(list);
        System.out.println("Ascending order:"+list);

        //Decending order
        System.out.println(list.reversed());//only print in reverse not reverse list
        //to change order of sorting we need comparator ,reverseOrder internally use comparator
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Decending order"+list);

    }
}