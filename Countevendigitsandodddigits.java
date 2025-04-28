package Challenge50days;

import java.util.Scanner;

public class Countevendigitsandodddigits {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int even=0,odd=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			n=n/10;
		}
		System.out.println("Even count"+even);
		System.out.println("Odd count "+odd);
	

	}

}
