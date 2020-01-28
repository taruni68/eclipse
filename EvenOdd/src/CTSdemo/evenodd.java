package CTSdemo;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args)
	{
	  int n;
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  if(n%2==0)
	  System.out.println("n is even");
	  else
	  System.out.println("n is odd");
	}
}
