import java.util.Scanner;


public class Wedding {

	static int maxPossible=0;

	static int pickItem(int i,int[][] items,int sum,int capAmount)
	{

		int prev_sum=sum;
		int flag=0;
		if(i==items.length-1) //This is th last item that can be picked
		{
			for(int j=0;j<items[i].length;j++)
			{
				sum+=items[i][j];
				System.out.println("Sum="+sum);

			
				if(sum==capAmount) 
				{
					maxPossible=capAmount;
					return 1;
				}
				
				if(sum<capAmount){
					if(maxPossible<sum)
						maxPossible=sum;
				}
				sum=prev_sum;
			}
			

			System.out.println("----------------------------------");
		}

		else
		{
			
			for(;i<items.length;i++)
			{
				
				//System.out.println("Picked from "+(i+1));
				for(int j=0;j<items[i].length;j++)
				{
					
					sum+=items[i][j];   
					if((flag=pickItem(i+1,items,sum,capAmount))==1)
					{
						
						return flag;
						
					}//break;
					sum=prev_sum;
				}
			}
		}
		return 0;	
	}
	public static void main(String[] args)
	{
		int capAmount=74,choices;
//		int [][]items={ { 8, 6, 4},
//				{ 5, 10,},
//				{1, 3, 3, 7},
//				{ 50 ,14, 23, 8},
//				{4,5,6,8}
//		};


		Scanner scan=new Scanner(System.in);
		int test_cases=scan.nextInt();
		for(int i=0;i<test_cases;i++)
		{
			maxPossible=0;
		//System.out.println(capAmount);
			capAmount=scan.nextInt();
			choices=scan.nextInt();
			int[][] items=new int[choices][];
			for(int j=0;j<choices;j++)
			{
				int brands=scan.nextInt();
				items[j]=new int[brands];
				for(int k=0;k<brands;k++)
					items[j][k]=scan.nextInt();
			}
			pickItem(0,items,0,capAmount); //itemNo  Sum cap
			if(maxPossible==0) 
			System.out.println("no solution");

			else
				System.out.println(maxPossible);
			
			
		}
	}
}
