package workprog;
import java.util.Scanner;
public class primeornot {
	public static void main(String args[]) { 
		System.out.println("enter the number to check weather prime or not "); 
		Scanner scan = new Scanner(System.in); 
		int i=scan.nextInt();   
		int n;int count=0;
		for(n=1;n<=i;n++) { 
			if(i%n==0) 
			count=count+1;
		}
	if(count==2) 
		System.out.println("its a prime"); 
	else 
		System.out.println("not a prime");
		
	}

}
