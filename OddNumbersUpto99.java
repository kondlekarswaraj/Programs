package Homework;

public class OddNumbersUpto99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		
		System.out.println("Odd numbers between 0 To 99 are as follows:");
		
		while(i<100)
		{
			if(i % 2 != 0)
			{
				System.out.println(i+" ");
			}
			++i;
		}
	}

}
