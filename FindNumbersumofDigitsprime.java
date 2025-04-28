package Challenge50days;

import java.util.Scanner;

public class FindNumbersumofDigitsprime {
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
		System.out.println("Enter the start range");
		int start=sc.nextInt();
		System.out.println("Enter the end range");
		int end=sc.nextInt();
		for(int i=start;i<end;i++)
		{
			int result=0;
			int val=i;
			while(val!=0)
			{
				int rem=val%10;
				result=result+rem;
				val=val/10;
			}
			val=0;
			if(isprime(result))
			{
				System.out.print(i+" ");
			}
		}

	}

}
