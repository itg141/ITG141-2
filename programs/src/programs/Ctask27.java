package programs;
import java.util.Scanner;
public class Ctask27 {
	public static void main(String args[]) {
		int num,i,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		num=scan.nextInt();
		scan.close();
		for (i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
	if (sum==num)
	{
		System.out.println("number is a perfect number");
	}
	else
		System.out.println("number is not a perfect number");
		
	}

}
