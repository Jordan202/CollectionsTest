package Q1;



	import java.util.HashSet;
	import java.util.Iterator;

	public class HashEx {

		public static void main(String[] args) {
			HashSet<Integer> h=new HashSet<Integer>();
			h.add(5);
			h.add(3);
			h.add(4);
			h.add(2);
			h.add(1);
			//h.clear();
			System.out.println(h);
			Iterator<Integer> it=h.iterator();
			while(it.hasNext()) {
				
				System.out.println(it.next());
			}
			
			}

	}






