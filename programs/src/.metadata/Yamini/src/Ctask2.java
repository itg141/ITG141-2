
import java.util.Scanner;

public class Ctask2 {
	public static void main(String args[]) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		if(num%2==0)
		{
			System.out.println("Entered number is even");
			
		}
		else
		{
			System.out.println("Entered number is odd");
		
		}
		
		
		
	}

}