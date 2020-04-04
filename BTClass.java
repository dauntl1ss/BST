public class BTClass
{
	BTNode root;
	public BTClass()
	{
		root = null;
	}
	public BTClass(BTNode root)
	{
		this.root = root;
	}
	public boolean isEmpty()
	{
		if(root == null)
			return true;
		else
			return false;
	}
	public void inorder(BTNode root)
	{
		if(root != null)
		{
			inorder(root.llink);
			System.out.print(" " + root.info);
         inorder(root.rlink);

		}
	}


	public void preorder(BTNode root)
	{
		if(root != null)
		{
			System.out.print(" " + root.info);
			preorder(root.llink);
			preorder(root.rlink);
		}	
	}
	public void postorder(BTNode root)
	{
		if(root != null)
		{
			postorder(root.llink);
			postorder(root.rlink);
			System.out.print(" " + root.info);
		}
	}
}