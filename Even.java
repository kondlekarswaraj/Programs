package Test;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number:");
		n=s.nextInt();
		
		if(n % 2==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}
}
