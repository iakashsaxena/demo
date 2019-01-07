package javatest;

class Exceptionfinally
{
   public static void main(String args[])
   {
      try
      {  
	 int num=26/0;  
	   
      }  
      catch(Exception e)
      {
    	  System.out.println(e);;
      }  
      
      finally
      {
	 System.out.println("Akash");
      }  
      System.out.println("Saxena");  
   }  
   }