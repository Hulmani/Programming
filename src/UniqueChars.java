import java.util.Scanner;


public class UniqueChars {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String in=scan.next();
		boolean[] chars=new boolean[256];
		for(int i=0;i<in.length();i++)
		{
			int val=in.charAt(i);
			System.out.println(val);
			if(chars[val])
			{
				System.out.println("Not unique");
				return;
			}
			chars[val]=true;
		}
	}
}
