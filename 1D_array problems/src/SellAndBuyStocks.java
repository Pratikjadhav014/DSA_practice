package arrays_problem;

public class SellAndBuyStocks {

	public static void main(String[] args) {
		
		int arr [] = new int[] {7,1,5,3,6,4};
		int n = arr.length;
		int buyPrice = Integer.MAX_VALUE;
		int p = 0,maxProfit = 0;
		
		for(int i=0;i<n;i++)
		{
			int sellPrice = arr[i];
			if(buyPrice<sellPrice)
			{
				p = sellPrice - buyPrice;
				if(maxProfit<p)
				{
					maxProfit = p;
				}
			}
			else
			{
				buyPrice = sellPrice;
			}
		}
		System.out.print(maxProfit);

	}

}
