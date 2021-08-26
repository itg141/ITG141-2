package itg141;

import java.util.Scanner;

public class evennumber {
 void even()
{
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter a number to check even or not");
	int n=sc.nextInt();
	
	if(n%2==0)
	{
	    System.out.println("it is an even number");
	}
	else {
		System.out.println("number is is not a even number");
	}
	
	
}
public static void main(String args[])
{
	evennumber em= new evennumber();
	em.even();
}
}