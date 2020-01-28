package CTSdemo;

public class PersonDetails {
		int age;
		String name;
		PersonDetails()
		{
			this.age=21;
			this.name="Tejaswini";
		}
			PersonDetails(String n,int a)
			{
				this.age=a;
				this.name=n;
			}
			public static void main(String[] args)
			{
				PersonDetails obj1=new PersonDetails();
				PersonDetails obj2=new PersonDetails("Tejaswini",21);
				System.out.println(obj1.name+""+obj1.age);
				System.out.println(obj2.name+""+obj2.age);
		    }
	    }


