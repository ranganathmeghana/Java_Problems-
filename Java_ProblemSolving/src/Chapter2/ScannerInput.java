package Chapter2;

import java.util.*;

public class ScannerInput {
	
	
	/*scan.nextInt gives all itegers.*/
	/*array.length and arraylist.size();*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int a = scan.nextInt();
        scan.nextLine();
        int b=scan.nextInt();
        scan.nextLine();
        int c=scan.nextInt();*/
        int[] arr=new int[3];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=scan.nextInt();
      System.out.println(arr[i]);
    }
        
        // Complete this line
        // Complete this line

       // System.out.println(a);
       //   System.out.println(b);
        //  System.out.println(c);
        // Complete this line
        // Complete this line
    }
}



/*the scan.next() gives one word. scan.nextLine gives one line. scan.hasDouble() gives the double in the stdin*/

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        String s=null;
        while(scan.hasNext()){
        s=scan.nextLine();
        }
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
