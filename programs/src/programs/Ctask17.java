package programs;
import java.util.Scanner;

public class Ctask17 {
	public static void main(String args[]) {
		int num,i,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		for (i=1;i<=num;i++)
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
			
		}
	System.out.println(sum);


}
}