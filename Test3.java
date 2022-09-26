import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int n1=0;
		int n2=1;
		int n10;
		System.out.println(n1+" "+n2+" ");
		for(int i=3;i<=num;i++)
		{
			n10=n1+n2;
			n1=n2;
			n2=n10;
			System.out.println(n10+" ");
		}


	}

}
