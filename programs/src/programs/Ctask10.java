package programs;

import java.util.Scanner;

public class Ctask10 {
	public static void main(String args[]) {
		int num1,num2,num3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		scan.close();
		int big=num1>num2?num1>num3?num1:num2:num2>num3?num2:num3;
		System.out.println(big);
	}
}
