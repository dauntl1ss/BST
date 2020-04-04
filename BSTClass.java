public class BSTClass extends BTClass
{
	BTNode root;
   int totalNode = 0;
   int leafNode = 0;
   String temp;
   int parent;
   
   boolean check;

	
	public BSTClass()
	{
		super();
	}	
	public BSTClass(BTNode root)
	{
		super(root);
	}
	public void insert(int insertItem)
	{
		BTNode newNode = new BTNode();
		newNode.llink = null;
		newNode.info = insertItem;
		newNode.rlink = null;
		
		BTNode current;
		BTNode trailcurrent = null;
		if(root == null)
      {
			root = newNode;
         totalNode++; // count node
      }
         
		else
		{
			current = root;
			while(current != null)
			{
				trailcurrent = current;
				
				if(insertItem == current.info)
				{
					System.out.println("Item already exists.");
               current = null; //added
				}
				else
				{
					if(insertItem < current.info)
						current = current.llink;
					else
						current = current.rlink;
				}
				
			}
         
         if(insertItem != trailcurrent.info)//added
         {
                 
   			if(insertItem < trailcurrent.info )
   				trailcurrent.llink = newNode;
   			else
            {
   				trailcurrent.rlink = newNode;
            }
               totalNode++; // count Node
         }
		}	
	}

   public void searchNode(BTNode root, int searchItem)
   {
      check = false;
      
      BTNode current = root;
      
      while(current != null && !check)
      {
         if(searchItem == current.info)
         {
            check = true;
         }
         else
         {
            if(searchItem < current.info)
            {
               current = current.llink;
            }
            else
            {
               current = current.rlink;
            }
         }
      }
         if(check)
            System.out.println("FOUND");
         else
            System.out.println("NOT FOUND");
   }
   public void countNodes()
   {
      System.out.println("Total Node: " + totalNode);
   }
   
   //Traverse to count leaf
   public void countLeaf(BTNode root)
   {
      if(root != null)
		{
         if(root.llink == null && root.rlink == null)
         {
            leafNode++;
         }

			countLeaf(root.llink);
         countLeaf(root.rlink);
		}         
   }
   //call the method for traversing then display
   public void countLeafNode()
   {
      leafNode = 0;
      countLeaf(root);
      
      System.out.println("Total leaf node: " + leafNode);
   }
    
   public void countParent(BTNode root)
   {
      if(root != null)
      {
         if(root.rlink != null || root.llink != null)
         {
            parent++;
         }
            countParent(root.llink);
            countParent(root.rlink);            
      }
   }
   public void countParentNode()
   {
      parent = 0;
      countParent(root);

      System.out.print("Total parent node: " + parent);
   }
   
   public void secret(int item)
	{
		BTNode current;
		BTNode parent;
		
		boolean found=false;
		
		if(root==null)
			System.out.println("Tree is empty");
		else
		{
			current = root;
			parent = root;
			while(current!=null&&!found)
			{
				if(current.info == item)
					found = true;
				else
				{
					parent = current;
					if(current.info>item)
						current = current.llink;
					else
						current = current.rlink;
				}
			}
			
			if(current==null)
				System.out.print("\nDelete item is not in the list");
			else
			{
				if(found)
				{
					if(current == root)
						root = secretFromBST(root);
					else
						if(parent.info>item)
							parent.llink=secretFromBST(parent.llink);
						else
							parent.rlink=secretFromBST(parent.rlink);
				}
			}
		}
	
	}
	
	public BTNode secretFromBST(BTNode p)
	{
		BTNode current;
		BTNode parent;
		
		if(p==null)
			System.out.println("Error: the node to be secreted is null");
			
		else if(p.llink == null && p.rlink == null)
			p = null;
		else if(p.llink == null)
			p = p.rlink;	
		else if(p.rlink == null)
			p = p.llink;
		
		else
		{
			current = p.llink;
			parent = null;
			while(current.rlink!=null)
			{
				parent = current;
				current = current.rlink;
			}
			p.info = current.info;
			if(parent == null)
				p.llink = current.llink;
			else
				parent.rlink=current.llink;
		}
		return p;
	}   
   
   
   public int height(BTNode root)
   {
      if(root == null || (root.llink == null && root.rlink == null))
         return 0;
      else
      {
         int lheight  = height(root.llink);
         int rheight = height(root.rlink);
         
         if(lheight > rheight)
            return (lheight + 1);
         else
            return (rheight + 1);
      }
   }
   
}