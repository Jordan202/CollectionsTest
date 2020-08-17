package Q7;

import java.util.HashSet;
 public class ConvertHashSettoArray{ 
  public static void main(String[] args) {
     // Create a HashSet
     HashSet<String> x = new HashSet<String>();
 
     //add elements to HashSet
     x.add("Musab");
		x.add("Jordan");
		x.add("Ali");
		x.add("Joal");
		x.add("Nassar");
 
   
     System.out.println("HashSet contains: "+ x);
 
   
     String[] array = new String[x.size()];
     x.toArray(array);
 
     // Displaying Array elements
     System.out.println("Array elements: ");
     for(String temp : array){
        System.out.println(temp);
     }
  }
}