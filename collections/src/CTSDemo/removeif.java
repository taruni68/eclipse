package CTSDemo;

import java.util.ArrayList;

public class removeif {
	 public static void main(String[] args)
	    {
	        ArrayList<Integer> a1 = new ArrayList<>();
	        a1.add(12);
			a1.add(23);
			a1.add(24);
			a1.add(34);
			a1.add(45);
	        a1.removeIf( a2 -> a2%2 == 0 );
	         
	        System.out.println(a1);
	    }
}
