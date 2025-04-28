package Challenge50days;

import java.util.Scanner;

public class ReverseNuber {
	
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number");
		int num=sc.nextInt();
		System.out.println("Resut :"+reverse(num));


	}

}
