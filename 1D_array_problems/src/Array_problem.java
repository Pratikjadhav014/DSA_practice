// count frequency of element in an array 

import java.util.*;
public class Array_problem {

	public static void main(String[] args) {
		
		int [] nums = {1,2,3,2,4,1};
		HashMap<Integer,Integer> freq = new HashMap<>();
		
		for(int a :nums)
		{
			//getOtDefault -> store{key,value} means {no,frequency}
			//all no check previous count and add +1 in this count (a),
			freq.put(a,freq.getOrDefault(a, 0) + 1);
			System.out.println(freq);
		}

	}

}
