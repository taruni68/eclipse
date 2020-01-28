package CTSdemo;

import java.util.Scanner;

public class Countnumberones {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		System.out.print("the number of one's in:"+num+""+Integer.toBinaryString(num)+")");
		int result=Countones(num);
		System.out.println("is : "+result);
		sc.close();
	}
	static int Countones(int n)
	{
		int Count=0;
		while(n>0)
		{
			n=n&(n-1);
			Count++;
		}
		return Count;
	}

}
