package Account;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int usr;
		boolean quit=false;
		do
		{
			System.out.println("Your choice, 0 to quit:");
			usr=s.nextInt();
			
				if(usr==0)
					quit=true;
		}
		while(!quit);
          
		    System.out.println("Thank You for your Transaction!");
	}
}
