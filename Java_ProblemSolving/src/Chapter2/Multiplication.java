package Chapter2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Multiplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(N + "X" + i + "=" + (N*i) );
      }
    }
}

