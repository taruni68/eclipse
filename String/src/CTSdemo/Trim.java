package CTSdemo;

import java.util.Scanner;

public class Trim {
	public static void main(String[] args)
	{
		String a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		System.out.println(a.trim());
		String b;
		b=sc.nextLine();
		String replaceString=b.replace('a', 'e');
		System.out.println(replaceString);
	}

}
