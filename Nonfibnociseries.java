package Challenge50days;

import java.util.Scanner;

public class Nonfibnociseries {
	static int i=2;
	public static void fib(int num,int n)
	{
		
		for( i=2;i<n;i++)
		{
			if(num==i)
			{
				
			}
			else
			{
				System.out.print(i+" ");
				i++;
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number count");
		int n=sc.nextInt();
		int a[]=new int[n];
		int first=0,second=1;
		int next;
		int j=0;
		
		for(int i=1;i<n;i++)
		{
			next=first+second;
			fib(next,n);
			first=second;
			second=next;
		}

	}

}
