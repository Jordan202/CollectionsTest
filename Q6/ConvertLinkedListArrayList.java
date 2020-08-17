package Q6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListArrayList {
 public static void main(String[] args) {
    LinkedList<String> Student = new LinkedList<String>();
    Student.add("Musab");
	Student.add("Jordan");
	Student.add("Ali");
	Student.add("Joal");
	Student.add("Nassar");
	
    System.out.println(Student);
    System.out.println("  ");

    List<String> list = new ArrayList<String>(Student);
    

    for (String x : list){
      System.out.println(x);
    }
 }
}