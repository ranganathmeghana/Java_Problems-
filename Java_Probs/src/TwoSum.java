import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	  public int[] twoSum(int[] nums, int target) { // O(n^2)
	        
		  int arr[]= new int[2];
		  
	      for(int i=0; i<nums.length ; i++){
	    	  for (int j=i+1 ; j<nums.length; j++){
	    		  if(nums[i] + nums[j] == target){
	    			  arr[0]= i;
	    			  arr[1]= j;
	    		  }
	    	  }
	      }
	      
	      return arr;
	    }
	  
	  public int[] twoSum1(int[] nums, int target){
		  
		  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		  int arr[]= new int[2];
			 
		  
		  for(int i=0; i<nums.length ; i++){
			  
			  map.put(nums[i],i);
		  }
		  
		  for(int i=0; i<nums.length ; i++){
			  int complement = target - nums[i];
			  if(map.containsKey(complement)&& map.get(complement)!=i){
				  arr[0]= i;
				  arr[1]= map.get(complement);
				  break;
			  }
		  }
		  
		  return arr;
	  }
	  
	  
	  public static void main(String[] args) {
		
		  TwoSum obj = new TwoSum();
		  int nums[]= {3,2,4};
		  int target = 6;
		 System.out.println(Arrays.toString((obj.twoSum1(nums, target))) );
	}
}
