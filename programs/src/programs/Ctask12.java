package programs;
	import java.util.Scanner;

	public class Ctask12 {
		public static void main(String args[]) {
			int a,b,input;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter 2 numbers");
			a=scan.nextInt();
			b=scan.nextInt();
			System.out.println("Enter your choice: 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Module");
			input=scan.nextInt();
			scan.close();
			switch(input) 
			{
			case 1: System.out.println("Addition:"+(a+b));
			break;
			case 2: System.out.println("sub: "+(a-b));
			break;
			case 3: System.out.println("Mul: "+(a*b));
			break;
			case 4: System.out.println("div: "+(a/b));
			break;
			case 5: System.out.println("Mod: "+(a%b));
			break;
			default:
				System.out.println("Entered input is invalid");
		}
	}
	}
