package pkg1;

public class Class2 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
	}	
	public int sub(int x,int y)
{
		int z;
		z=x-y;
		System.out.println("sub result is"+z);
		return z;
}
	public void multi(int p, int q)
	{
	int r;
	r=p*q;
	System.out.println("final result"+r);

}
public static void main(String[] args) {
	Class2 obj=new Class2();
	int sumresult=obj.sum(10,15);
	int subresult=obj.sub(12,2);
	obj.multi(sumresult,subresult);
}
}