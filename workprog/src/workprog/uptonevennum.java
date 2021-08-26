package workprog;
import java.util.Scanner;
public class uptonevennum { 
	public static void main(String args[]) { 
		 
		System.out.println("enter the range"); 
		Scanner scan=new Scanner(System.in); 
		int no=scan.nextInt();  
		int sum = 0;
		for(int i=0;i<=no;i=i+2) {
			sum=sum+i;
			}
			System.out.println("Sum of even "+no+" is : "+sum);
		
	}
	

}
