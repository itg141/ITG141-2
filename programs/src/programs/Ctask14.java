package programs;


	import java.util.Scanner;

	public class Ctask14 {
		public static void main(String args[]) {
			int num,i,mul;	
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number");
			num=scan.nextInt();
			scan.close();
			if(num>0)
			{
				for (i=1;i<=10;i++)
				{
					mul=num*i;
					System.out.println(num+"*"+i+"="+(num*i));
				}
			}
		
		}
	}

