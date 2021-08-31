package Strings;
import java.util.Scanner;

public class task2 {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.print("enter a string");
		String string=scan.nextLine();
		scan.close();
		int count=0,count1=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
		for (int i=0;i<string.length()-1;i++) {
			if ((i>0) && string.charAt(i)!=' ' && string.charAt(i-1)==' ' || ((string.charAt(i)!=' ')&&(i==0)))
			{
				count1++;
			}
		}
		System.out.println(count1);	
		
	}

} 
      
        