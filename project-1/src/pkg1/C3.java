package pkg1;

public class C3 
{
	public static void main(String[] args)
	{
		int a=8;
		float b;
		b=a;//implicit conversion
		System.out.println("Value of b"+b);
		
		float f=8.85F;
		int f1;
		f1=(int)f;// we have to handle explicitly
		System.out.println("value of f1"+f1);
	}
}
