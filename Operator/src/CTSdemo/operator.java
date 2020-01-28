package CTSdemo;

import java.util.Scanner;

public class operator {
public static void main(String[] args)
{
 int n,r=0,q=0,count=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a number:");
 n=sc.nextInt();
 while(n!=0)
 {
	 r=n%2;
	 if(r==1)
	 {
		 count++;
	 }
	 n=n/2;
 }
 System.out.println("number of ones="+count);
 
 }
}
