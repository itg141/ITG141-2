package task;
import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		num=scan.nextInt();
		scan.close();
		if (num%4==0)
		{
			if (num%100==0)
			{
				if (num%400==0)
				{
					System.out.println("entered number is a leap year");
				
				}
				else
				{
					System.out.println("entered number is not a leap year");
		
				}
			}
			else
			{
				System.out.println("Entered number is a leap year ");
			}
		}
		else
		{
			System.out.println("Entered number is not a leap year");
		}
		
	}

}
