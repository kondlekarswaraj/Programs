package Programs;

import java.util.Scanner;

public class PositionOfNoInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		
		int arr[]=new int[1000];
		
		int num=1;
		for(int i=0; i<=100; i++)
		{
			num=1+((i*(i+1))/2);
			arr[i]=num;
		}
		System.out.println(arr[index-1]);
	}
}
