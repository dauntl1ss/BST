import java.util.*;
public class testBinaryTree
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      
      int choice = 0;
      boolean bool = true;
      //BTNode root;
      
      BSTClass x = new BSTClass();
      do{
      System.out.print("\n----------------MENU----------------\n");
      System.out.print("1 - INSERT\n");
      System.out.print("2 - IN-ORDER\n");
      System.out.print("3 - PRE-ORDER\n");
      System.out.print("4 - POST-ORDER\n");
      System.out.print("5 - SEARCH\n");
      System.out.print("6 - COUNT NODES\n");
      System.out.print("7 - COUNT LEAF NODES\n");
      System.out.print("8 - COUNT PARENT NODES\n");
      System.out.print("9 - EXIT\n");
      
      
      System.out.print("Enter choice: ");
      choice = console.nextInt(); 
      
      switch(choice)
      {
         case 1:
            System.out.print("INSERT\n");
            System.out.print("Enter item: ");
            x.insert(console.nextInt());
            break;
         case 2:
            System.out.print("IN-ORDER\n");
            x.inorder(x.root);
            break;
         case 3:
            System.out.print("PRE-ORDER\n");
            x.preorder(x.root);
            break;
         case 4:
            System.out.print("POST-ORDER\n");
            x.postorder(x.root);
            break;
         case 5:
            System.out.print("SEARCH\n");
            x.searchNode(x.root, console.nextInt());
            break;
         case 6:
            System.out.print("COUNT NODES\n");
            x.countNodes();
            break;
         case 7:
            System.out.print("COUNT LEAF NODE\n");
            x.countLeafNode();
            break;
          case 8:
            System.out.print("COUNT PARENT NODE\n");
            x.countParentNode();
            break; 
          case 9:
            System.out.print("COUNT HEIGHT\n");
            System.out.print(x.height(x.root));
            break;
      }
      
      
     }while(choice<10 && choice > 0);
   }
}