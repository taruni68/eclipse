package CTSdemo;

public class parent {
	void methodofparentclass()
	{
		System.out.println("parent's method()");
	}
}
class child extends parent
{
	void methodofparentclass()
	{
		System.out.println("child's method()");
	}
}
class Methodoverriding
{
	public static void main(String[] args)
	{
		parent obj1=new parent();
		obj1.methodofparentclass();
		parent obj2=new child();
		obj2.methodofparentclass();
	}
}