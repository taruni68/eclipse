package CTSDemo;

import java.util.ArrayList;

public class clone {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Taruni");
		a1.add("Akhil");
		a1.add("Sarada");
		a1.add("Balaji");
		System.out.println(a1);
		@SuppressWarnings("unchecked")
		ArrayList<String> a2= (ArrayList<String>)a1.clone();
		System.out.println(a2);
			}
}
