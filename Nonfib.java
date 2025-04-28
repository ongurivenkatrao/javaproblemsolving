package Challenge50days;

import java.util.Scanner;

public class Nonfib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int first=0,second=1;
		int next=0;
		for(int i=1;i<n;i++)
		{
			next=first+second;
			first=second;
			for(int j=first+1;j<next;j++)
			{
				System.out.print(j+" ");
			}
			second=next;
		}

	}

}
