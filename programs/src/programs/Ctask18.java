/*package programs;
import java.util.Scanner;

public class Ctask18 {
	public static void main(String args[]) {
		int num,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		for (i=0;i<=num;i=i+2)
		{
			
				System.out.println(i);
			
		}
}
}*/
/*package programs;
import java.util.Scanner;

public class Ctask18 {
	public static void main(String args[]) {
		int num,i=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		
		while(i<=num)
		{
			System.out.println(i);
			i=i+2;
		}
		
		
	}
}*/
package programs;
import java.util.Scanner;

public class Ctask18 {
	public static void main(String args[]) {
		int num,i=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		scan.close();
		do 
		{
			System.out.println(i);
			i=i+2;
			
		}
		while(i<=num);
	}

}