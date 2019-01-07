package javatest;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add("akash");
		obj.add(1);
		obj.add(2.4);
		obj.add("saxena");
		obj.addAll(obj);
		System.out.println("added data="+ obj);
		obj.removeAll(obj);
		System.out.println(obj);
		
		
		

	}

}
