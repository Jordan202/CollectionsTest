package Q3;


import java.util.ArrayList;
import java.util.Collections;


//import java.util.Comparator;
public class ArrayAesendinDescending {

public static void main(String[]args) {
	ArrayList<Integer> Student=new ArrayList<Integer>();
	Student.add(5);
	Student.add(3);
	Student.add(4);
	Student.add(2);
	Student.add(1);
	System.out.println("Before: "+Student);

	 Collections.sort(Student, Collections.reverseOrder());


	 		System.out.println("After"+Student);

	   }}