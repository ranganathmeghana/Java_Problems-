package MeghanaAirwatch;

public class StringClass {
	
    static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {
        Map<String,Float> map=new HashMap<>();
        for(int i=0;i<origItems.length;i++){
            map.put(origItems[i], origPrices[i]);
        }
        int count = 0;
        for(int i = 0; i< items.length; i++){
            if(map.contains(items[i]) && map.get(items[i]) != prices[i]) count++;
        }
        return count;
    }

}
