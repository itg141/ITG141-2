package Strings;
import java.util.*;
public class task7 {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string");
		String string=scan.nextLine();
		scan.close();
		char ch[]=string.toCharArray();
		Arrays.sort(ch);
		String cs=new String(ch);
		System.out.println(cs);
		for (int i=cs.length();i>0;i--) {
			System.out.print(cs.charAt(i-1));
			
		}
		
	}

}
