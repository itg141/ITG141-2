package programs;

import java.util.Scanner;

public class Task8 {
	public static void main(String args[]) {
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		scan.close();
		if (num1>num2)
		{
			System.out.println("num1 is greater than num2");
			
		}
		else
		{
			System.out.println("num2 is greater than num1");
		}
	}
}