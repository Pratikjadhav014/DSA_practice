import java.util.ArrayList;
class PairSum2
{

    public static boolean pairSum(ArrayList<Integer>list,int target)
    {
        //step 1 : find pivot point
        int x = -1;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                x = i;
            }
        }
        int lp = x+1;
        int rp = x;

        // step 2: find target pair
        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }

            if(list.get(lp)+list.get(rp)<target)
            {
                lp = (lp+1)%list.size();
            }
            else
            {
                rp = (list.size()+rp-1)%list.size();
            }
        }
        return false;

    }
    public static void main(String []args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 16;
        list.add(11);
        list.add(25);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(11);

        System.out.println(pairSum(list,target));
    }
}