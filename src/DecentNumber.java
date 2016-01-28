import java.util.Scanner;
import java.util.ArrayList;

public class DecentNumber {


	public static void print(int prod,int rem)
	{
		System.out.println("5s:"+prod +" 3s:"+rem);
		for(int j=0;j<prod;j++)
			System.out.print("5");

		for(int k=0;k<rem;k++)
			System.out.print("3");
		//		return;
	}


	public static void deduce(int n)
	{

		ArrayList maps=new ArrayList();
		System.out.println("n is "+n);
		int	num=3; 
		int prod=0;
		boolean existflag=false;
		for(int i=0;;i++)
		{
			prod=num*i;

			int rem=n-prod;
			
			
			if(rem%5==0)
			{
				
				System.out.println("5s "+prod +" 3s "+rem+ "i="+i);
				existflag=true;
				maps.add(prod);
				
//Adding numbers of 3s to be printed to the list
			}
			if(rem<0)
			{
				//flag=true;
				break;
			}
			
			
		}
		
		if(!existflag)
			System.out.println("-1");

		else
		{
			int newv=0;
			int max5=(int) maps.get(0);
			int index=0;
			System.out.println("Max "+max5);
			for(int i=1;i<maps.size();i++)
			{
				newv=(int) maps.get(i);
				if(max5<newv)
				{
					index=i;
					max5=newv;
				}
			}

			System.out.println("Max "+max5 +"Index is "+index);
			int rem=n-max5;
			System.out.println("rem ="+rem);
			print(max5,rem);
		}
	}
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int test_cases=Integer.parseInt(scan.next());
		for(int i=0;i<test_cases;i++)
		{
			int n=Integer.parseInt(scan.next());

			if(n==1)
			{
				System.out.println("-1");
			}
			else{
				deduce(n);
				System.out.println();
			}
		}
	}
}
