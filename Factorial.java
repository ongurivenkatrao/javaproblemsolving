package Challenge50days;

import java.util.Scanner;

public class Factorial {

	
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the factorial number");
		int num=sc.nextInt();
		System.out.println("Resut :"+factorial(num));

	}
}
