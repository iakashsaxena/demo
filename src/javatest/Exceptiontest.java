package javatest;

public class Exceptiontest{
	  public static void main(String args[])
	  {
	   try
	   {
	      int data=100/0;
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(e);
	   }
	  
	  }
	}