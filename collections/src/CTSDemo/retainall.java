package CTSDemo;

import java.util.ArrayList;
import java.util.Collections;

public class retainall {
	public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Taruni");
		a1.add("Akhil");
		a1.add("Sarada");
		a1.add("Taruni");
		a1.add("Balaji"); 
       
        System.out.println(a1);
         
        a1.retainAll(Collections.singleton("Taruni"));
         
        System.out.println(a1);
    }
}
