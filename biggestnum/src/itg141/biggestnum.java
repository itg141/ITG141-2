package itg141;
import java.util.Scanner;

public class biggestnum {

	public static void main(String[] args) {
		System.out.println("enter two values:");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y) {
			System.out.println("x is biggest");
		}
		else
		{
			System.out.println("y is biggest");
		}
	}

}
