package itg14;

public class Static {
	int employeeid;
	int mobileno;
	String name;
	static String office="miracle";
	void Student()
	{
		int num=mobileno;
		int r=employeeid;
		String s=name;
		}
	void display(int employeeid,int mobileno,String name)
	{
		System.out.println(employeeid+" "+mobileno+" "+name+" "+office);
	}

	public static void main(String args[])
	{
	Static s1= new Static();
	Static s2= new Static();
	s1.display(2521,2255,"ravi");
	s2.display(2521,2255,"ravi");
}
}