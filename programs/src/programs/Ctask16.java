package programs;
import java.util.Scanner;

public class Ctask16 {
	public static void main(String args[]) {
		int num,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		for (i=0;i<=num;i=i+2)
		{
			
				System.out.println(i);
			
		}


}
}
