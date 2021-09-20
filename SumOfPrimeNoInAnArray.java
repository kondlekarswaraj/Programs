package Programs;

import java.util.Scanner;

public class SumOfPrimeNoInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring Variables
		int i,s,j,k,sum=0;
				
		//Declaring Array Size
		int arr[]=new int[5];
				
		//Using Scanner Class We Will Take Input From User
		Scanner sc=new Scanner(System.in);
				
		//Entering Array Size
		System.out.println("Enter Size Of An Array:");
		s=sc.nextInt();
				
		//Entering Input
		System.out.println("Enter Array Elements");
				
		//Loop For Entering 5 Elements
		for(i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
				
		//Loop For Checking Which Numbers Are Prime
		for(i=0;i<s;i++){
			j=2;
			k=1;
					
	    //While Loop For Non Prime Numbers(k=0)
		while(j<arr[i]){
       		if(arr[i]%j==0){
				k=0;
				break;
	     		}
				j++;
			}
					
		//Set (k=1) Condition
			if(k==1){
				sum = sum+arr[i];
			    }
			}
				
		//Printing Sum Of Prime Numbers
		System.out.println("Sum Of All Prime Numbers:" +sum);
	}
}
		