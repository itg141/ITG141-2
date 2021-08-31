package programs;
import java.util.Scanner;
public class Ctask31 {
	public static void main(String args[]) {
		int num,i=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		do {
			System.out.println(num+"*"+i+"="+(num*i));
			i++;
		}while(i<=10);
		
	}

}
