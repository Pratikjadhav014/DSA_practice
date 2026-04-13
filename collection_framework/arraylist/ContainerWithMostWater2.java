
import java.util.ArrayList;

class ContainerWithMostWater2{


    public static int storeWater(ArrayList<Integer> height,int width)
    {
        int i = 0;
        int j = height.size()-1;
        int w = 0;
        int h = 0;
        int area = 0;
        int maxArea = 0;
        while(i<j)
        {
            h = Math.min(height.get(i),height.get(j));
            w = j-i;
            area = w*h*width;
            maxArea = Math.max(maxArea,area);
            if(height.get(i)<height.get(j))
            {
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> height = new ArrayList<>();
        int width = 1;
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height,width));
    }
}