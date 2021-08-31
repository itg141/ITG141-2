package programs;

import java.util.Scanner;

public class Ctask23 {
	public static void main(String args[]) {
		int x,n,i,fact=1;
		float sum=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		x=scan.nextInt();
		n=scan.nextInt();
		scan.close();
		for (i=1;i<=n;i++)
		{
			for(int j=1;j>1;j--)
			{
				fact=fact*i;
			}
			sum=sum+(float)Math.pow(x, i)/(float)fact;
		}
  
	System.out.println(sum);
	}
}