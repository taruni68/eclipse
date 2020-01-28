package CTSdemo;
	public class animal {
		void method1()
		{
			System.out.println("animal()");
		}
		}
	class child extends animal
	{
		void method1()
		{
			System.out.println("child animal()");
		}
	public void newmethod()
	{
		System.out.println("new method of child animal");
		
	}
 class Methodoverriding
	{
		public void main(String[] args)
		{
			animal obj1=new animal();
			obj1.method1();
			animal obj2=new child();
			obj2.method1();
		    child obj3=new child();
		    obj3.newmethod();
		}
	}
	}



