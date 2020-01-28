package CTSdemo;

import java.util.Scanner;

public class atm {
	public static void main(String[] args)
	{
	 int n;
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 if(n<1000)
	 System.out.println("enter amount morethan 1000");
	 if(n>=1000)
	 System.out.println("amount is withdrawn");
	}

}
