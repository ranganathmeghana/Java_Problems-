import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < t; i++) {
			String str = sc.nextLine();
			String[] numbers = str.split(" ");
			int a = Integer.parseInt(numbers[0]);
			int b = Integer.parseInt(numbers[1]);
			int c = Integer.parseInt(numbers[2]);

			int x = 0;

			if ((a + b < c) || (a + c < b) || (b + c < a)) {
				System.out.println("None of these");
				continue;
			}

			if (a == b) {
				x++;
			}
			if (b == c) {
				x++;
			}
            if(c==a){
                x++;
            }

			if (x >= 2) {
				System.out.println("Equilateral");
			} else if (x == 1) {
				System.out.println("Isosceles");
			} else {
				System.out.println("None of these");
			}

		}
		sc.close();
    }
}