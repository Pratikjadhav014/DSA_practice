import java.util.ArrayList;

class InBuildFun
{
    public static void main(String []args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        //operations

        //add(no) ---0(1)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //add(index,no)---0(n)
        list.add(3,4);
        System.out.println(list);

        //get(index)---0(1)
        int a = list.get(2);
        System.out.println(a);

        //remove(index)---0(n)-because of element shifting
        list.remove(3);
        System.out.println(list);

        //set(index,no)--0(n)[used for update element]
        list.set(0,0);
        System.out.println(list);

        //contains(no)---0(n)[return element in list(true) or not(false)]
        boolean b = list.contains(10);
        System.out.println(b);

        //size();--0(1) //length in normal array also --0(1)

        System.out.println(list.size());
    }
}