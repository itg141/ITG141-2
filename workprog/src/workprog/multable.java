package workprog;
import java.util.Scanner;
public class multable { 
	public static void main(String args[]) { 
		int n;  
		System.out.println("enter the table number"); 
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int x; 
		for(n=1;n<12;n++) {
			System.out.println(i+"*"+n+":"+(i*n));
		}
	}

}
