

import java.util.Scanner;

public class Ctask1 {
	public static void main (String args[])
	{
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		scan.close();
		if (num>0)
		{
			System.out.println("Entered number is positive");
		}
		else if(num<0)
		{
			System.out.println("Entered number is negative");
			
		}
		else
		{
			System.out.println("invalid input");
		}
	
	}

}
