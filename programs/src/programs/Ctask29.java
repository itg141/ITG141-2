package programs;
import java.util.Scanner;
public class Ctask29 {
	public static void main (String args[])
	{
		int num,rev=0,dig;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		int temp=num;
		while(num!=0)
		{
			dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
	if(temp==rev)
	{
		System.out.println("given number is palindrome");
	}
	else
	{
		System.out.println("given number is not a palindrome");
	}
	}

}
