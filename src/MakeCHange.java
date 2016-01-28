
public class MakeCHange {


	public static void makeChangeDP(int k,int[] change)
	{
		int[] c=new int[k+1];
		c[0]=0;
		c[1]=1;

		for(int i=2;i<=k;i++)  
		{
			c[i]=Integer.MAX_VALUE;  //consider the 

			for(int j:change)
			{
				if(i==j)

					c[i]=1;
				else if(j<i)
				{
					c[i]= (c[i] < c[i-j]+c[j]) ? c[i]:c[i-j]+c[j];
				}

			}
		}


		System.out.println(k+" "+c[k]);
	}

	public static void main(String[] args)
	{
		int[] change={25,1,10};
		makeChangeDP(81,change);
		for(int i=1;i<=25;i++)
		makeChangeDP(i,change);
	}

}
