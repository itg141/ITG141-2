package itg141;
import java.util.Scanner;

public class divisible {

	public static void main(String[] args)
	{
		System.out.println("enter the number to check it is div by 5 and 3 or not");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
if((n%5==0)&&(n%3==0))
{
	
	System.out.println("enter the number  is divisibled by 5 and 3");
	}
else
{
	System.out.println("entered the number not is divisibled by 5 and 3");
}
		
	}
}
