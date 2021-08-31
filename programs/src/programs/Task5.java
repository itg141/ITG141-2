package programs;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[]) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		if (num>24)
		{
			if (num>80)
			{
				System.out.println("Rank:A");
				
			}
			else if(num>60)
			{
				System.out.println("Rank:B");
				
			}
			else if(num>40)
			{
				System.out.println("Rank:C");
			}
			else
			{
				System.out.println("Rank:D");
			}
		}
		else
		{
			System.out.println("Failed");
		}
	}
	

}
