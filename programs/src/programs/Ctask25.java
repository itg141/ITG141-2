package programs;
import java.util.Scanner;
public class Ctask25 {
	public static void main(String args[])
	{
		int num,count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		while(num!=0)
		{
			count=count+1;
			num=num/10;
		}
	System.out.println(count);
		
	}

}
