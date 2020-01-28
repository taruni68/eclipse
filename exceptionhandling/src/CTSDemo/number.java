 package CTSDemo;
import java.util.*;
public class number {
	private static Scanner sc;

	public static void main(String[] args)
	{
		int num;	
	try
	{
		sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		num=sc.nextInt();
		System.out.println(num);
		
		}
	catch(Exception e)
	{
		System.out.println("Exception thrown: "+e);
	}
	System.out.println("out of the block");
}}
