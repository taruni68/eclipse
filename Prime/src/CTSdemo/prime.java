package CTSdemo;

import java.util.Scanner;

public class prime {
	public static void main(String[] args)
	{
	  int num,p=0,i;
	  Scanner sc=new Scanner(System.in);
	  num=sc.nextInt();
	  for(i=1;i<=num;i++)
	  {
	   p++;
	  }
	  if(p==2)
	  {
	  System.out.println("num is prime");
	  }
	  else
	  { 
	  System.out.println("num is not prime");
	  }
	  }
	}

