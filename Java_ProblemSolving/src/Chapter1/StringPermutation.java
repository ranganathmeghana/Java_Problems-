package Chapter1;

import java.util.Arrays;

public class StringPermutation {

		public String sort(String str)
		{
			char[] charString=str.toCharArray();
			Arrays.sort(charString);
			return new String(charString);
		}

		public boolean compareStrings(String str1,String str2)
		{
			if(str1.length()!=str2.length()){
				return false;
			}
			
			return sort(str1).equals(sort(str2));
		}
	
}
