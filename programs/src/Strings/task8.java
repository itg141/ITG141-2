package Strings;

import java.util.Scanner;

public class task8 {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string");
		String string=scan.nextLine();
		scan.close();
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)<'A'||string.charAt(i)>'Z' && string.charAt(i)<'a' || string.charAt(i)>'z') {
				string=string.substring(0,i) + string.substring(i+1);
		
				i--;
			}
			
		}
		System.out.println(string);
	}

}
