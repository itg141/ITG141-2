
import java.util.Scanner;

public class Ctask4 {
	public static void main(String args[]) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		if (num%3==0 && num%5==0)
		{
			System.out.println("Entered number is divisible by 3 and 5");
		}
		else
		{
			System.out.println("entered numbere is not divisible by 3 and 5");
			
		}
	}

}
