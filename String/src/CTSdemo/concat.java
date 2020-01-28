package CTSdemo;

import java.util.Scanner;

public class concat {
	public static void main(String[] args)
	{
		String name1,name2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name1:");
		System.out.println("enter name2: ");
		name1=sc.next();
		name2=sc.next();
		name1=name1.concat(name2);
		System.out.println("After concatenating the string is:"+name1);
	}

}
