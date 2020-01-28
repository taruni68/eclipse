package CTSDemo;

import java.util.ArrayList;

public class lastindexof {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Taruni");
		a1.add("Akhil");
		a1.add("Sarada");
		a1.add("Taruni");
		a1.add("Balaji");
		a1.add("Taruni");
		System.out.println(a1);
		int b1=a1.lastIndexOf("Taruni");
		System.out.println(b1);
		b1=a1.lastIndexOf("Teja");
		System.out.println(b1);
	
}
}
