import java.util.Scanner;

public class Ctask6 {
	public static void main(String args[]) {
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value");
		ch=scan.next().charAt(0);
		scan.close();
		if (ch>='a' && ch<='z')
		{
			System.out.println("Input is lower case");
			
		}
		else if (ch>='A' && ch<='Z')
		{
			System.out.println( "Input is uppercase");
			
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println("Input is a numeric");
			
		}
		else
		{
			System.out.println("Input is symbol");
		}
		
	}
}