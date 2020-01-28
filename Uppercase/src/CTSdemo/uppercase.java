package CTSdemo;

import java.util.Scanner;

public class uppercase {
	public static void main(String[] args)
	{
		String name,convert;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		name=sc.nextLine();
		convert=name.toUpperCase();
		System.out.println(convert);
		convert=name.toLowerCase();
		System.out.println(convert);
	}

}
