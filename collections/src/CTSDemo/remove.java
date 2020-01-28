package CTSDemo;

import java.util.ArrayList;

public class remove {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Taruni");
		a1.add("Akhil");
		a1.add("Sarada");
		a1.add("Balaji");
		ArrayList<String> a2=new ArrayList<>();
		a1.remove("Akhil");
		a2.add("Latha");
		a1.addAll(a2);
		System.out.println(a1);
	}
}
