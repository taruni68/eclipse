package CTSDemo;

import java.util.ArrayList;

public class indexof {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Taruni");
		a1.add("Akhil");
		a1.add("Sarada");
		a1.add("Balaji");
		System.out.println(a1);
		int b1=a1.indexOf("Akhil");
		System.out.println(b1);
		b1=a1.indexOf("Teja");
		System.out.println(b1);
	
}
}
