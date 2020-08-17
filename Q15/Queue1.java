package Q15;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue1 {

	public static void main(String[] args) {
		Deque<String> d=new ArrayDeque<String>();
		d.add("1");
		d.add("2");
		d.add("3");
		d.add("4");
		d.add("5");
		System.out.println("Show dq :"+d);
		System.out.println("element : "+d.element());
		System.out.println("peek :"+d.peek());
		System.out.println("Show dq :"+d);
		System.out.println("poll:"+d.poll());
		
		System.out.println("Show dq :"+d);
		System.out.println("poll:"+d.poll());
		
		System.out.println("poll:"+d.pollLast());
		System.out.println("Show dq :"+d);

	}
		
}