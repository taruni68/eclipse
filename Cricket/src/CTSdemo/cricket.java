package CTSdemo;
public class cricket {
	int age;
	String name;
	String DOB;
	int centuries;
	int halfcenturies;
		cricket(String n,int a,String d,int c,int h )
		{
			this.age=a;
			this.name=n;
			this.DOB=d;
			this.centuries=c;
			this.halfcenturies=h;
		}
		public static void main(String[] args)
		{
			cricket obj1=new cricket("Dhoni ", 40 , "24/06/1994" , 45 , 55 );
			System.out.println(obj1.name+" "+obj1.age+" "+obj1.DOB+" "+obj1.centuries+" "+obj1.halfcenturies);
	    }
}
