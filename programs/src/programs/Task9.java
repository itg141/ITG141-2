package programs;

import java.util.Scanner;

public class Task9 {
	public static void main(String args[]) {
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		scan.close();
		int big=num1>num2?num1:num2;
		System.out.println(big);
		
	}
}
		