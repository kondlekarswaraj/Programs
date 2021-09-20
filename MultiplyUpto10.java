package Homework;

import java.util.Scanner;

public class MultiplyUpto10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int i=1,j;
	    Scanner sc = new Scanner (System.in);
		
        System.out.println("Enter A Number:");
        
        int n=sc.nextInt();
        
        while(i<=10)
        	
        {
        	System.out.println(n + "*" +i+ "=" + n * i);
            ++i; 
        }	
        
	}

}
