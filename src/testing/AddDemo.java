package testing;

public class AddDemo {

	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);

	}
	public static void main(String args[])
	{
		AddDemo obj=new AddDemo();
		obj.add(20, 30, 40);
		obj.add(10, 20);
	}
}
