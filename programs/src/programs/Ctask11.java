package programs;
	import java.util.Scanner;

	public class Ctask11 {
		public static void main(String args[]) {
			int num;
			char charac;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter number and character");
			num=scan.nextInt();
			charac=scan.next().charAt(0);
			scan.close();
		
			System.out.printf("The digit is %d and the character is %c",num,charac);
		}
	}



