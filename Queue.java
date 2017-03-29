package hw4;

public class Queue 
{
	NodeList queue;
	int size=0;
	public Queue()
	{
		queue = new NodeList();
	}
	
	public void enqueue (Node st)
	{
		queue.add(st);
		System.out.println(st.getName() + " has been enqueued");
		size++;
	}
	
	public Node dequeue()
	{
		Node returner = queue.root;
		System.out.println(queue.root.getName() + " has been dequeued");
		queue.deleteNode(queue.root);
		size--;
		return returner;
		
	}
	
	public String peak()
	{
		return queue.root.getName() + " has been peaked";
	}
}
