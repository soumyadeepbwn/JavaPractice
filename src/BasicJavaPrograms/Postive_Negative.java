package BasicJavaPrograms;

import java.util.Scanner;

public class Postive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Java Program to Check if a Given Integer is Positive or Negative
		 */
		
		int n;
		System.out.println("Please enter the number ");
		
		try (Scanner s = new Scanner(System.in)) {
			n = s.nextInt();
		}
		if(n > 0)
	        {
	            System.out.println("The given number "+n+" is Positive");
	        }
	        else if(n < 0)
	        {
	            System.out.println("The given number "+n+" is Negative");
	        }
	        else
	        {
	            System.out.println("The given number "+n+" is neither Positive nor Negative ");
	        }
		

	}

}
