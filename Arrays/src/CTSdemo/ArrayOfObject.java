package CTSdemo;
 class Employee {
	public int emp_id;
	public String emp_name;
	Employee(int emp_id,String emp_name)
	{
		this. emp_id= emp_id;
		this.emp_name= emp_name;
	}
	}
	public class ArrayOfObject
	{
		public static void main(String[] args)
	{
		Employee[]employeeArray;
		 employeeArray= new Employee[5];
		employeeArray[0]=new Employee(1,"Tejaswini");
		employeeArray[1]=new Employee(2,"Taruni");
		employeeArray[2]=new Employee(3,"Kalyan");
		employeeArray[3]=new Employee(4,"Mahesh");
		employeeArray[4]=new Employee(5,"Subashini");
		for(int i=0;i<=employeeArray.length;i++)
		{
			System.out.println(employeeArray[i].emp_id+"   "+employeeArray[i].emp_name);
		}
	}


}
