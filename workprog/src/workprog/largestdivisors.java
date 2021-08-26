package workprog;

public class largestdivisors { 
		public static void main (String []args) {
		int count=0;

		int max=0;
		int no=0;
		for(int i=1;i<=10000;i++) {
		count=0;
		for(int j=1;j<=i;j++) {
		if(i%j==0) {
		count++;
		if(count>max) {
		max=count;
		no=i;
		}
		}
		}
		}
		System.out.println("number is "+no+"  divisors  "+(max-1));
		}

}
