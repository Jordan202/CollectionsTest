package Q8;

import java.util.ArrayList;
import java.util.Collections;
 
public class ReverseArrayList{
	
    public static void main(String[] args) 
    {
        //Constructing an ArrayList
         
        ArrayList<Integer> x = new ArrayList<Integer>();
                 
        x.add(4);
         
        x.add(5);
         
        x.add(3);
         
        x.add(2);
         
        x.add(1);     
         
        System.out.println("Before :");
         
        System.out.println(x);
         
        Collections.reverse(x);
         
      System.out.println(" After Reverse :");
         
        System.out.println(x);
    }
}