package Strings;
import java.util.Scanner;
public class task1 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String string1=scan.nextLine();
		System.out.println("Enter a word which should be replace ");
		String string2=scan.nextLine();
		System.out.println("Enter a word");
		String string3=scan.nextLine();
		scan.close();
		String finalstring=string1.replace(string2,string3);
		System.out.println(finalstring);
			}
			}
		
	
