

import java.util.Scanner;

public class Ctask7 {
	public static void main(String args[]) {
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		scan.close();
		if (num1==0 && num2==0)
			{
			System.out.println("The Coordinates lies in the origin");
			
			}
		else
		{
			System.out.println("The coordinates doesnt lies in the origin");
			
		}
			}
}