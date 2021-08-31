package programs;
import java.util.Scanner;

public class Ctask30 {
	public static void main (String args[]) {
		int num,first=0,second=1,third,i;
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		System.out.printf("fibonacci series %d  %d ",first,second);
		for (i=2;i<num;i++)
		{
		third=first+second;
		System.out.printf("%d ",third);
		first=second;
		second=third;
		}	
	}

}
