package Q2;

import java.util.HashSet;

import java.util.TreeSet;

public class HashEx1 {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		//h.clear();
		
		TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
		myTreeSet.addAll(h);
		System.out.println(h); 
		}
		
		}

