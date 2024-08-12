/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
	    if(root == null || root.next == null)
	       return root;
	       
	    root.next = flatten(root.next);
	    
	    return merge(root, root.next);
    }
    
    Node merge(Node root1, Node root2)
    {
        Node head = null;
        
        if(root1 == null)
           return root2;
           
        if(root2 == null)
           return root1;
           
        if(root1.data < root2.data){
            head = root1;
            head.bottom = merge(root1.bottom, root2);
        }else{
            head = root2;
            head.bottom = merge(root1, root2.bottom);
        }
        
        return head;
    }
}
