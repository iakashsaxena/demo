package javatest;

import java.util.Scanner;

public class InputJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
				System.out.println("Enter the input");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c= a/b;
		System.out.print(c);

	}

}
