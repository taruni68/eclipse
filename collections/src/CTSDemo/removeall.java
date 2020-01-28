package CTSDemo;

import java.util.ArrayList;
import java.util.Collections;

public class removeall {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Taruni");
		a1.add("Akhil");
		a1.add("Sarada");
		a1.add("Taruni");
		a1.add("Balaji");
		System.out.println(a1);
		a1.removeAll(Collections.singleton("Taruni"));
		System.out.println(a1);
}
}
