package programs;
import java.util.Scanner;

public class Ctask28 {
	public static void main(String args[]) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		if(num>=1 && num<=10)
		{
			System.out.println("number is valid");
		}
		else
		{
			System.out.println("number is in-valid");
		}
		
		
	}

}
