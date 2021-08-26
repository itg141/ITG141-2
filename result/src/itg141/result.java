package itg141;

import java.util.Scanner;

public class result
{
	public static void main(String[] args)
{
		System.out.println("enter ur marks");
	
 Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
if(n<50)
{

System.out.println("failed");
}
else if((n>=50)&&(n<60))
{
	
	System.out.println("aggregated with D grade");
	}
else if((n>=61)&&(n<=70))
{
	
	System.out.println("aggregated with c grade");
	}
else if((n>=71)&&(n<=80))
{
	
	System.out.println("aggregated with B grade");
	}
else if((n>=81)&&(n<=90))
{
	
	System.out.println("aggregated with A grade");
	}
else if((n>=91)&&(n<=100))
{
	
	System.out.println("aggregated with O grade");
	}

else {
System.out.println("entered the number is invalid");
}
	
}
}



