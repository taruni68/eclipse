package CTSDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class spliterator {
	 public static void main(String[] args) 
	    {
	        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
	 
	        Spliterator<Integer> sItr = digits.spliterator();
	         
	        sItr.tryAdvance( d -> System.out.println( d ) );
	        sItr.tryAdvance( d -> System.out.println( d ) );
	        sItr.tryAdvance( d -> System.out.println( d ) );
	    }
}
