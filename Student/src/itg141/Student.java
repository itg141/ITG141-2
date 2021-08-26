package itg141;

public class Student {
	int roll;
	String name;
	static String college="mss";
	Student(int r,String n)
	{
		roll=r;
		name=n;
	}
 void  display()
	{
		System.out.println(name+" "+roll+" "+college);
	}
   
	public static void main(String[] args) {
		Student s1 = new Student(111,"raju");
		 Student s2 = new Student(222,"ravi");
		 s1.display();
		 s2.display();
		
	}

}
