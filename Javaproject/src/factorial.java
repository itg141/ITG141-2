import java.util.Scanner;
public class factorial {
public static void main(String...args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int no=sc.nextInt();
int fact=1;
for(int a=no;a>1;a--) {
fact=fact*a;
}
System.out.println("Result :"+fact);
}
}