package BasicJavaPrograms;

import java.util.Scanner;

public class Even_Odd {

	/*
	 * Java Program to Check if a Given Integer is Odd or Even
	 */
	
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int n;
		
		s = new Scanner(System.in);
		System.out.println("Please enter the number\n");
		n = s.nextInt();
		
		if(n%2 == 0)
		{
			System.out.println(n+ " is a even number");
		}
		else
		{
		    System.out.println(n+ " is a odd number");	
		}

	}

}
