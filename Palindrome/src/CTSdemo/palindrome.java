package CTSdemo;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
	  
	  int num,rev=0,rem,i;
	  Scanner sc=new Scanner(System.in);
	  num=sc.nextInt();
	  i=num;
	  while(num!=0)
	  {
	  rem=num%10;
	  rev=rev*10+rem;
	  num=num/10;
	 }
	if(i==rev)
	 System.out.println(rev+"is a palindrome");
	else
	 System.out.println(rev+"is not a palindrome");
	}

}
