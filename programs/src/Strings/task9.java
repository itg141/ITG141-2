package Strings;
import java.util.Scanner;
public class task9 {
	public static void main(String args[]) {
		int i,vol=0,cons=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String string=scan.nextLine();
		scan.close();
		string=string.toLowerCase();
		char ch[]=string.toCharArray();

		for(char c : ch) {
		if (c!=' ') {
		
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vol++;
			}
			else {
				cons++;
				}
		}
		
	}
		System.out.println("no of vowels ="+vol);
		System.out.println("no of conosonanats ="+cons);
		
			
		}
	}
