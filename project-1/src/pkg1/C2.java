package pkg1;

public class C2 extends C1
{		
	public void arithmetic(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Result is"+z);
	}
	public static void main(String[] args) 
	{
		C2 obj=new C2();
		obj.arithmetic(10, 4);
	}
}
