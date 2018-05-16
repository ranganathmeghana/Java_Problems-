package Chapter2;

import java.util.Scanner;

public class Stdout {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                String s2 = null;
                int x = sc.nextInt();
                //Complete this line
                if(x<10){
                    s2=("00"+String.valueOf(x));
                }
                else if(x<100){
                s2=("0"+String.valueOf(x));
                //x=Integer.parseInt(s2);
                }else{
                    s2 = String.valueOf(x);
                }
                
                System.out.println(s1 +addSpaces(s1)+s2);
            }
            System.out.println("================================");

    }
    public static String addSpaces(String s){
        int spaces = 15 - s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<spaces; i++){
            sb.append(" ");
        }
        return sb.toString();
    }
}