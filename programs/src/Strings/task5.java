package Strings;

public class task5 {
	void compare()
	{
		String string1="Yaghghmini";
		String string2="yamini";
		int flag=1;
		if ( string1.length()==string2.length()) {
			for (int i=0;i<string1.length();i++)
			{
				if(string1.charAt(i)!=string2.charAt(i))
				{
					flag=0;
				}
			}
		}
		else {
			flag=0;
		}
			if(flag==1) {
				System.out.println("strings are equal");
			}
			else {
				System.out.println("strings are not equal ");
			}
	
		}
	public static void main(String args[]) {
		task5 ts=new task5();
		ts.compare();
	}
}
