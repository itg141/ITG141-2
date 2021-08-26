package itg141;
import java.util.Scanner;
public class orgin {

	public static void main(String[] args) {
		System.out.println("enter x and y values:");
		Scanner sc= new Scanner(System.in);
		//int i=sc.nextInt();
	//	int j=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int o;
		if((x==0)&&(y==0))
		{
			System.out.println("lies on origin");
		}
		else if((x==0)&&(y!=0))
		{
			System.out.println("lies on x-axis");
		}
		else if((x!=0)&&(y==0))
		{
			System.out.println("lies on y-axis");
		}
		else if((x!=0)&&(y!=0))
		{
			System.out.println("lies in between the x-axis and  y-axis");
		}
		
		

	}

}
