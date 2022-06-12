package pkg1;

import java.util.Scanner;

public class input 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter value of A");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Value of a "+a);
		System.out.println("please enter value F");
		float f=s.nextFloat();
		System.out.println("Value of f "+f);
	}

}
