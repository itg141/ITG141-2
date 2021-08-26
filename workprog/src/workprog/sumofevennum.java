package workprog;
import java.util.Scanner;
public class sumofevennum { 
	public static void main(String args[]) { 
		int i=0; 
		System.out.println("enter a number"); 
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt(); 
		int sum=0;	
		while(i<=n) { 
			if(i%2==0) { 
				sum=sum+n;
				System.out.println(sum); 
				//i++;
			}
			i++;
		}
	}
}
