package Q5;

import java.util.ArrayList;

public class ArrayLest {

	public static void main(String[] args) {
		ArrayList<String> Student=new ArrayList<String>();
		Student.add("Musab");
		Student.add("Jordan");
		Student.add("Ali");
		Student.add("Joal");
		Student.add("Nassar");
		System.out.println("Before:"+Student);

	
	
	Student.remove("Musab");
	
	//Student.remove(3);
		System.out.println("Aftet:"+Student);
		
	}

}


