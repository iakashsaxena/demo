package javatest;

import java.util.Scanner;

public class StringUppertoLowerCount {

	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);
System.out.println("Please enter two name");
		String S1=obj.nextLine();
		String S2=obj.nextLine();
		System.out.println(S1);
		System.out.println(S2);
		String S3=S1.concat(S2);
		System.out.println("Concatination of S1 and S2 are="+S3);
		String str = S3; 
        int upper = 0, lower = 0, number = 0, special = 0; 
  
        for(int i = 0; i < str.length(); i++) 
        { 
            char ch = str.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else if (ch >= '0' && ch <= '9') 
                number++; 
            else
                special++; 
        } 
  
        System.out.println("Lower case letters : " + lower); 
        System.out.println("Upper case letters : " + upper); 
        System.out.println("Number : " + number); 
        System.out.println("Special characters : " + special); 
		
		
	}

}
