package CTSdemo;

import java.util.Scanner;

public class Logicaloperator
{
	public static void main(String[] args)
{
	String username,password;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username:");
	username=sc.next();
	System.out.println("enter password:");
	password=sc.next();
	if(username.equals("tejaswini") && password.equals("teju24"))
	{
	System.out.println("welcome to Email");
	}
	else
	{
	System.out.println("INVALID USERNAME OR PASSWORD");
	}
}
}
