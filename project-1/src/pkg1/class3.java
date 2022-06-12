package pkg1;

public class class3 {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
	}
	public int sub(int d,int e)
	{
		int f;
		f=d-e;
		System.out.println("sum result is"+f);
		return f;
	}
	public int multi(int g,int h)
	{
		int i;
		i=g*h;
		System.out.println("sum result is"+i);
		return i;
	}
	public void div(int j,int k)
	{
		int l;
		l=j/k;
		System.out.println("sum result is"+l);
	}
	public static void main(String[] args) 
	{
		class3 obj=new class3();
		int multiresult=obj.multi(10,2);
		int subresult=obj.sub(multiresult,2);
		int multiresult1=obj.multi(subresult,2);
		int sumresult=obj.sum(multiresult1,2);
		obj.div(sumresult,2);
	}
		
		
	}

