package programs;

import java.util.Scanner;

public class Ctask24 {
	public static void main(String args[]) {
		int num,i,fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		for (i=1;i<=num;i++)
		{
			fact=fact*i;
		}
	System.out.println(fact);
	}
}