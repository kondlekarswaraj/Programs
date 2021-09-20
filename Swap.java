package Test;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=2,y=4;
		
		System.out.println("Before Swapping:");
		System.out.println("x =" +x);
		System.out.println("y =" +y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		

		System.out.println("After Swapping:");
		System.out.println("x = "+x);
		System.out.println("y = "+y);

	}
}
