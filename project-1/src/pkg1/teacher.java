package pkg1;

public class teacher 
{
	public teacher() 
	{
		System.out.println("this is default contructor");
	}
	public teacher(int a) 
	{
		this();
		System.out.println("this is one parameterised contructor");
	}
	public teacher(int a,int b) 
	{
		this(52);
		System.out.println("this is two parametrised contructor");
	}
	public teacher(int a,int b,int c) 
	{
		System.out.println("this is three parameterised contructor");
	}
	public teacher(int a,int b,int c,int d)
	{
		this(21,25);
		System.out.println("this is four parameterised contructor");
	}
	public teacher(int a,int b,int c,int d,int e)
	{
		this(66,22,23,24);
		System.out.println("this is five parameterised contructor");
	}
	public static void main(String[] args) 
	{
	teacher obj=new teacher(1,2,3,4,5);
	}
}
