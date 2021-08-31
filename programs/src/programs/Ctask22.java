package programs;

import java.util.Scanner;

public class Ctask22 {
	public static void main(String args[]) {
		int num,i;
		double sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		for (i=1;i<=num;i++)
		{
			sum=sum+((float)1/(float)(i*i));
		}
	System.out.println(sum);
	}
}