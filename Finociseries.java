package Challenge50days;

public class Finociseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int c=2;
		System.out.print(a+" "+b+" ");
		while(true)
		{
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			c++;
			if(c==10)
			{
				break;
			}
		}

	}

}
