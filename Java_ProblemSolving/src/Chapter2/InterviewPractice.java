package Chapter2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewPractice {

	public ArrayList<Integer> returnIndices(int arr1[], int target){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++){
			
			for(int j=i+1;j<arr1.length;j++)
			{
				if((arr1[i]+arr1[j])==target){
					arr.add(i);
					arr.add(j);
				}
			}
		}
		return arr;
	}
	
	public int[] returnIndicesMap(int[] arr3,int target1){
		
		int[] result=new int[2];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr3.length;i++){
		
			if(map.containsKey(target1-arr3[i])){
				result[0]=i;
				result[1]=map.get(target1-arr3[i]);
				return result;
			}
			map.put(arr3[i], i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] inputArr={2,7,11,15};
		int target=9;
		
		InterviewPractice obj=new InterviewPractice();
		System.out.println(obj.returnIndicesMap(inputArr, target));
		
	}
}
