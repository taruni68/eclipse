package CTSDemo;

import java.util.ArrayList;

public class get {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Taruni");
		a1.add("Akhil");
		a1.add("Sarada");
		a1.add("Balaji");
		System.out.println(a1);
		String b1=a1.get(0);
		String b2=a1.get(1);
		System.out.println(b1);
		System.out.println(b2);
}
}
