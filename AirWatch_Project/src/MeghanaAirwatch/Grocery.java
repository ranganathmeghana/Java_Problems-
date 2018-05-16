package MeghanaAirwatch;

import java.util.HashMap;
import java.util.Map;

public class Grocery 
{
	public static void main(String[] args) {
		String[] ori = {"rice","wheat","cheese","sugar"};
		float[] oriprices = {1.1f, 2.2f, 3.3f, 4.5f}; 
		String[] items = {"rice","sdf"};
		float[] pric = {1.2f, 2.1f};
		System.out.println(GroceryDiiference(ori, oriprices, items, pric));
		
	}

	public static int GroceryDiiference(String[] origItems,float[] origPrices,String[] items, float[] prices)
	
	{
		Map<String,Float> map=new HashMap<String,Float>();
		int count=0;
		
		for(int i=0;i<origItems.length; i++){
			map.put(origItems[i], origPrices[i]);	
		}
		
		for(int i=0; i<items.length;i++)
		{
			if(map.containsKey(items[i]) && map.get(items[i])!=prices[i]){
				count=count+1;
			}
		}
		
		return count;
	}
}
