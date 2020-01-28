package CTSDemo;

public class exception {
public static void main(String[] args)
{
	try {
		int num[]=new int[10];
		System.out.println("Accessing the element: "+num[12]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception thrown: "+e);
	}
	System.out.println("Out of the block");
}
}
