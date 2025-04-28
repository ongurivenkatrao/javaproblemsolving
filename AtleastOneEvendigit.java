package Challenge50days;

import java.util.Scanner;

public class AtleastOneEvendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int start=sc.nextInt();
		System.out.println("Enter the ending range");
		int end=sc.nextInt();
		for(int i=start;i<end;i++)
		{
			int val=i;
			while(val>0)
			{
				int rem=val%10;
				if(rem%2==0)
				{
					System.out.print(i+" ");
					break;
				}
				val=val/10;
			}
		}
		

	}

}
