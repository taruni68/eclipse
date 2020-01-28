package CTSdemo;

import java.util.Scanner;

public class addition {
	public static void main(String[] args)
	{
	  int a,b,c;  
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter first num:");
	  a=sc.nextInt();
	  System.out.print("enter second number:");
	  b=sc.nextInt();
	  sc.close();
	  c=a+b;
	  System.out.println("c="+c);

	}

}
