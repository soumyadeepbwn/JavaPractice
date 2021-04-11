package BasicJavaPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class PatternProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//    System.out.println("List of Pattern programs");
		//  patternprogram1();
		//  patternprogram2();
		//  patternprogram3();
		inputdata();


	}

	public static void patternprogram1()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void patternprogram2()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void patternprogram3()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}


	public static void inputdata() throws IOException
	{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter Your Name");
		String name = reader.readLine();
		System.out.println("Enter Your Age");
		int age = Integer.parseInt(reader.readLine());
		System.out.println("Enter Your Id");	
		int id = Integer.parseInt(reader.readLine());
		Employee std = new Employee(name, age, id);
		std.displayDetails();

	}

}

class Employee{

	String name;
	int id;
	int age;
	Employee(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public void displayDetails(){
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Id: "+this.id);
	}

}


