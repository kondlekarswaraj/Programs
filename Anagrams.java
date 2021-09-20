package Test;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter The First Word:");
		String s1=s.nextLine();
		
		System.out.println("Enter The Second Word:");
		String s2=s.nextLine();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagrams!");
		}
		else
			
		{
			System.out.println("Anagrams!");
		}
	}
}
