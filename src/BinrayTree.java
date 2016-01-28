import java.util.LinkedList;


public class BinrayTree {

	int val;
	BinrayTree left;
	BinrayTree right;
	BinrayTree(int val)
	{
		this.val=val;
		left=null;
		right=null;
	}


	public static BinrayTree call(BinrayTree root,int val)
	{
		if(root==null)
		{
			root=new BinrayTree(val);
			return root;
		}
		else
		{
			if(val<root.val)
			{
				System.out.println("Going Left of: "+root.val);
				root.left=call(root.left,val);
			}
			else {
				System.out.println("Going right "+root.val);
				root.right=call(root.right,val);
			}
		}

		return root;
	}
	public static void printSpace(int x,int val){
		for(int i=0;i<x;i++)
		System.out.print(" ");
		
		System.out.print(val);
		
		for(int i=0;i<x;i++)
			System.out.print(" ");
		
		
		
	}
	
	public static void main(String [] args)
	{
		BinrayTree root=null;
		int [] values= {15,6,7,8,3,4,5,1,2,18,20,34,19,9};

		for(int i=0;i<values.length;i++)
		{
			root=call(root,values[i]);
		}

		LinkedList<BinrayTree> stack=new LinkedList<BinrayTree>();
		BinrayTree temp=null;
		stack.push(root);
		int c=values.length;
		while(!stack.isEmpty())
		{
			
			temp=stack.pop();
			
			if(temp.right!=null)
			stack.push(temp.right);
			if(temp.left!=null)
			stack.push(temp.left);
			
			
			printSpace(c/2,temp.val);
			System.out.println();
			c--;
			
			if(temp.right!=null)
			printSpace(c/2,temp.right.val);
			System.out.println();
			
		}
		
	}
}
