import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//to find the first repeated the character in a string 
// input: abcba
//output: a

public class FirstRepeatedChar {

	public String getFirstRepeatString(String str)
		{
			char[] charArr=str.toCharArray();
			List<Character> list1=new ArrayList<Character>();
			List<Character> list2=new ArrayList<Character>();
			
			for(int i=0;i<charArr.length;i++){
				
				if(list1.contains(charArr[i])){
					list2.add(charArr[i]);
				}
				else{
					list1.add(charArr[i]);
				}
			}
			
/*			List<Integer> list3=new ArrayList<Integer>();
			for(Character c:list2){
				list3.add(str.indexOf(c));
			}
		
			Collections.sort(list3);
			int index=list3.get(0);
			return String.valueOf(str.charAt(index));*/
			
			for(int i=0;i<charArr.length;i++){
				if(list2.contains(charArr[i])){
					return String.valueOf(charArr[i]);
					
				}
				break;
			}
			return null;
		}
	
	public static void main(String[] args) {
		
		FirstRepeatedChar obj=new FirstRepeatedChar();   
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(obj.getFirstRepeatString(str));
		s.close();
	}
	
	
}
