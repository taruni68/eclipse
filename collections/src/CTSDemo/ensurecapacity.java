package CTSDemo;

import java.util.ArrayList;

public class ensurecapacity {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>(1);
		a1.add("Taruni");
		a1.add("Akhil");
		a1.add("Sarada");
		a1.add("Balaji");
		System.out.println(a1);
		a1.ensureCapacity(1);
		a1.add("Teja");
		a1.add("Spandana");
		a1.add("Madhavi");
		System.out.println(a1);

}
}
