package Test;
import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tax=0,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Income:");
		i=s.nextDouble();
		
			if(i<=50000)
			{
				tax=0;
				System.out.println("Income Tax Of Given Employee Is Nil");
			}
			else if(i<=60000)
			{
				tax=0.1*(i-50000);
			}
			else if(i<=150000)
			{
				tax=(0.2*(i-60000))+(0.1*50000);
			}
			else
			
			{	
			tax=(0.3*(i-150000))+(0.2*60000)+(0.1*50000);
			
			System.out.println("Income  Tax Amount Is:"+tax);
			}	
	}
}
