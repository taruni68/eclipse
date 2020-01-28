package CTSDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class spliterator {
	 public static void main(String[] args) 
	    {
	        ArrayList<Integer> a1 = new ArrayList<>();
	        a1.add(12);
	   		a1.add(23);
	     	a1.add(24);
	     	a1.add(34);
			a1.add(45);
	        Spliterator<Integer> s = a1.spliterator();
	        s.tryAdvance( d -> System.out.println( d ) );
	        s.tryAdvance( d -> System.out.println( d ) );
	        s.tryAdvance( d -> System.out.println( d ) );
	    }
}
