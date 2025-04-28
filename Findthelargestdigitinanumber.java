package Challenge50days;

import java.util.Scanner;

public class Findthelargestdigitinanumber {
	
	public static int large(int n)
	{
		int max=n%10;
		while(n>0)
		{
			int rem=n%10;
			if(rem>max)
			{
				max=rem;
			}
			n=n/10;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Maximum number is :"+large(n));

	}

}
