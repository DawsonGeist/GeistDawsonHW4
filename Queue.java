package hw4;

public class Queue 
{
	NodeList queue;
	public Queue()
	{
		queue = new NodeList();
	}
	
	public void enqueue (Node st)
	{
		queue.add(st);
		System.out.println(st.getName() + " has been enqueued");
	}
	
	public void dequeue()
	{
		System.out.println(queue.root.getName() + " has been dequeued");
		queue.deleteNode(queue.root);
		
	}
	
	public String peak()
	{
		return queue.root.getName() + " has been peaked";
	}
}
