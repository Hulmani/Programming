import java.util.Scanner;

//This program calculates the 


public class NoChange {

	public static boolean traverse(int root,int cap,int[] numbers,int coin,int result)
	{
		boolean flag=false;
		
		//coin=coin+1;
		
		if(root==result) 
		{
		
		 System.out.println("---------------Root=Result = True------------ "+root);
		  return true;
		}
				
		if(coin==numbers.length) 
		{
		
		System.out.println("last coin : sum "+root);
		System.out.println("--------------------------");
		return false;
		}
		
		System.out.println("Root: "+root);
		root+=numbers[coin];
		
		
		
		for(int j=1;j<=cap;j++)
		{
			System.out.println("Taking:"+j+" coins val="+numbers[coin]);
			flag=traverse(root,j,numbers,coin+1,result);
			
			if(flag) {
				//System.out.println("---------------Should be done------------");
				return flag;
			}
	
			root=root+numbers[coin];
			
			//System.out.println("rot:"+root);
		}
		
	//68 4 5 6 7 10 4 
		
		return flag;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int test_cases=scan.nextInt();
		for(int i=1;i<=test_cases;i++)
		{

			int result=scan.nextInt();
			int denominations=scan.nextInt();
			int[] numbers=new int[denominations];
			int total=0;
			int sum=0;
			for(int j=0;j<denominations;j++)
			{
				numbers[j]=scan.nextInt();
				sum+=numbers[j];
			
			}
			
			if(traverse(numbers[0],Integer.MAX_VALUE,numbers,0,result))
			{
				System.out.println("YES");
			}
			else System.out.println("NO");
			
			if(i!=test_cases)  System.out.println();
		}
			
	}
}
