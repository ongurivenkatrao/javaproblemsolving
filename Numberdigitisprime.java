package Challenge50days;

import java.util.Scanner;

public class Numberdigitisprime {
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
       int num=sc.nextInt();
       int result=0;
       while(num>0)
       {
    	   int remainder=num%10;
    	   if(isprime(remainder))
    	   {
    		   result=result*10+remainder;
    	   }
    	   num=num/10;
    	   
       }
       while(result>0)//7
       {
    	   int r=result%10;
    	   result=result/10;
    	   if((result==0))
        	   System.out.print(r);
    	   else
    		   System.out.print(r+",");
    	   
       }
	}

}
