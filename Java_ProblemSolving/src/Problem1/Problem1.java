package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {

       Scanner stdin = new Scanner(System.in);
       while(stdin.hasNextLine()) 
       {
          List<Integer> inputList=new ArrayList<Integer>();
          inputList.add(Integer.parseInt(stdin.nextLine()));
          System.out.println(stdin.nextLine());
           
           int pricePerChoc=inputList.get(0);
           int numberOfWrap=inputList.get(1);
           int numOfpeople=inputList.get(2);
           
           int priceOfFirst=inputList.get(3);
           int priceOfSecond=inputList.get(4);
           
           
       }
       stdin.close();
    }
    
    public void calculateNoOfChocs(int price, int wrap, int pricePerPerson){
    	
    	
    }

}

