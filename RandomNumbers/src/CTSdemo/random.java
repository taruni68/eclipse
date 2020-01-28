package CTSdemo;

import java.util.Random;

public class random {
public static void main(String[] args)
{
	int c;
	Random sc=new Random();
	for(c=1;c<=10;c++)
	{
		System.out.println(sc.nextInt(100));
	}
}
}
