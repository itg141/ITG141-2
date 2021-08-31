package Strings;
	import java.util.Scanner;
	public class task11 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.printf("enter string:");
	String s = scan.nextLine();
	char s1=Character.toUpperCase(s.charAt(0));
	System.out.printf("%c", s1);
	for(int i=0;i<s.length()-1;i++) {
	if(Character.isWhitespace(s.charAt(i))) {
	System.out.printf(" %c", Character.toUpperCase(s.charAt(i+1)));
	}else {
	System.out.printf("%c", s.charAt(i+1));
	}
	}
	}
}

