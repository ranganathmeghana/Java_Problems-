package Chapter2;

import java.util.Scanner;
import java.lang.Math;

public class PowerOf {
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(powOf(a, b));
		
	}
	
	public static long powOf(long a,long b){
	
		if(b==0) {
			return 1;
		}
		if(b==1){
			return a;
		}
		
		else{
			if(b%2==1){
				return a* powOf(a*a, b/2);
			}
			else{
				return powOf(a*a, b/2);
			}
		}
	}

}
