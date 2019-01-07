package javatest;

import java.util.Scanner;

public class InputTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
				System.out.println("Enter the input");
		int a=obj.nextInt();
		int b=obj.nextInt();
		try
		{
			int c= a/b;
			System.out.println(c);	
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae+"=Entered number is not divisible by zero");
		throw ae;
		}
		finally
		{
			System.out.println("Finally block.. print to hoga hi");
		}
	}

}
