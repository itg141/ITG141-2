package programs;
	import java.util.Scanner;
	public class Ctask13 {
		public static void main(String args[]) {
			int input;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number of a month: 1.jan 2.feb 3.mar 4.apr 5.may  6.jun 7.jul 8.aug 9.sep 10.oct 11.nov 12.dec");
			input=scan.nextInt();
			scan.close();
			if (input==1||input==3||input==5||input==7||input==8||input==10||input==12)
			{
				System.out.println("31 days in this month");
				
			}
			else if (input==4||input==6||input==9||input==11)
			{
				System.out.println("30 days in a month");
				
			}
			else if (input==2)
			{
				System.out.println("Either 29 or 28 days in this month");
				
			}
			else
			{
				System.out.println("Please enter valid input from 1 to 12");
			}
			
			
		}
	}
	
