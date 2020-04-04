public class BTNode
{
	int info;
	BTNode llink;
	BTNode rlink;
	
	public BTNode()
	{
		info = 0;
		llink = null;
		rlink = null;
	}
	public BTNode(BTNode llink, int info, BTNode rlink)
	{
		this.llink = llink;
		this.info = info;
		this.rlink = rlink;
	}
	}