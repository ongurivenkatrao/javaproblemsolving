package Challenge50days;

import java.util.Scanner;

public class primenumberwithparametrs {
	
	public static boolean isprime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("("+2+","+3+")");
		for(int i=3;i<=n;i++)
		{
			if(isprime(i)&&isprime(i+2))
			{
				System.out.println("( "+i+","+(i+2)+")");
			}
		}
		

	}

}
