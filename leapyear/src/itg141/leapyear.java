package itg141;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
	System.out.println("enter the year	 to check leap year or not");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n%4==0) {
			System.out.println("the year is leap year");
	}
		else {
			System.out.println("enter the yearis not leap year");
		}
		


	}

}
