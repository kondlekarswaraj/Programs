package Account;
import java.util.Scanner;

public class FinalAccount {

	private int ano;
	private String aname;
	private long abal;
	
	Scanner KB = new Scanner(System.in);
	
	void openaccount()
	{
		System.out.println("Enter Account Number:");
		ano=KB.nextInt();
		System.out.println("Enter Account Holder Name:");
		aname=KB.nextLine();
		System.out.println("Enter Balance:");
		abal=KB.nextLong();
	}
	 
	void showaccount()
	{
		System.out.println(ano + "," +aname+ "," +abal);
	}
	
	void withdraw()
	{
		long amt;
		System.out.println("Enter Amount You Want To Withdraw:");
		amt= KB.nextLong();
		if (abal>=amt)
		{
			abal=abal-amt;
		}
		else
		{
			System.out.println("Ohhh! You Have Insufficient Balance!");
		}
	}

	void deposite()
	{
		long amt;
		System.out.println("Enter Amount You Want To Deposite:");
		amt= KB.nextLong();
		abal=abal+amt;
		{
	         System.out.println("1. Open Account\n 2. Show account\n 3. Withdraw \n 4. Deposite\n 5. Exit");
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		openaccount o = new openaccount();
		o.openaccount();
		
		showaccount s = new showaccount();
		s.showaccount();

		withdraw w = new withdraw();
		w.withdraw();
		
		deposite d = new deposite();
		d.deposite();
	}
}
