package testing;

public class TableDemo
{
	public void table1(int i, int a)
	{
		for(i=1;i<=10;i++)
		{
			System.out.println(i*1);
			
		}
			
	}
	public void table1(int j, int k, int l)
	{
		for(j=1;j<=10;j++)
		{
			System.out.println(j*k);
			System.out.println(j*l);
			
			
		}
	}
	
	public static void main(String args[])
	{
		TableDemo t=new TableDemo();
				t.table1(2,5);
				t.table1(1,2,8);
				
				
	}
}


