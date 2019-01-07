package testing;
	
	class Father
	{
		public void main()
		{
			System.out.println("Arun");
			
		}
	}
class Son extends Father
{
	public void name()
	{
		System.out.println("Akash");
	}
}
class Grandson extends Son
{
	public void name()
	{
		System.out.println("Munna");
	}
}
 class Final2 {
	 
	public static void main(String[] args) 
	{
	Father.obj= new Son();
	s1.name();
	Father obj= new Grandson();
	obj.name();
	Father.obj=new Father();
	}
 }
 

	}

}
