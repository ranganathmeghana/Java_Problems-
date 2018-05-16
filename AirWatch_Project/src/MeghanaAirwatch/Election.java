package MeghanaAirwatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Election {
		
	public static void main(String[] args) {
		
//		List<String> input=new ArrayList<String>();
//	
//		Scanner scanner=new Scanner(System.in);
//		while(scanner.hasNextLine()){
//			input.add(scanner.next());
//		}	
//		
		String[] input1 = {"helo", "hi", "helo", "hi", "x"};
		System.out.println(winner(input1));
		
	}
	
	public static String winner(String[] arr){
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		int max=0;
		
		for(String candidate:arr){
			
			if(!map.containsKey(candidate)) map.put(candidate, 0);
			map.put(candidate, map.get(candidate)+1);
		}
		for(String candidate: map.keySet()){
			int count = map.get(candidate);
			if(count > max){
				max = count;
			}
		}
		String out = ""; //hello
		for(String candidate: map.keySet()){
			int count = map.get(candidate);
			if(count == max && candidate.compareTo(out)>0){
				out = candidate;
			}
		}
		
		return out;
	}

}
