
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(findFirstRepeatingCharacter(str));
		s.close();
    }
    
    private static String findFirstRepeatingCharacter(String s) {
		Set<Character> charSet = new HashSet<Character>();
		char[] chars = s.toCharArray();
		List<Character> pair = new ArrayList<Character>();

		for (char c : chars) {
			if (charSet.contains(c)) {
				pair.add(c);
				charSet.remove(c);
			} else {
				charSet.add(c);
			}
		}

		for (char c : chars) {
			if (pair.contains(c)) {
				return String.valueOf(c);
			}
		}

		return null;
	}
}