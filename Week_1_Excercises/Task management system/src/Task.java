class Node{
	Task t;
	Node next;
	Node(Task d) 
    {
        t = d; 
        next = null; 
    }
	public void add(Node head ,Task d)
	{
	    //Node head;
	    Node new_node = new Node(d);
	    if (head == null)
	    {
	        head = new Node(d);
	        return;
	    }
	    new_node.next = null;

	    Node curr = head; 
	    while (curr.next != null)
	        curr = curr.next;
	 
	    
	    curr.next = new_node;
	    return;
	}
	static void search(Node head ,int key)
	{  Node curr=head;
	while(curr != null)
	{
//		if(curr.dtaskId==key)
//		{
//			
//		}
	}
	   
	
}}
public class Task {
  int taskId;
  String taskName,status; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
