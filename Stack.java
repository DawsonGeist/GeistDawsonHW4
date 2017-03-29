package hw4;

public class Stack 
{
	NodeList stack;
	int size = 0;
	public Stack()
	{
		stack = new NodeList();
	}
	
	public void push(Node st)
	{
		stack.add(st);
		System.out.println(st.getName()+ " has been pushed");
		size++;
	}
	
	public Node pop()
	{
		Node returner = stack.getNodeFromID((stack.getSize()-1));
		System.out.println(stack.getNodeFromID((stack.getSize()-1)).getName() +" has been popped");
		stack.deleteNode(stack.getNodeFromID((stack.getSize()-1)));
		size--;
		
		return returner;
	}
	
	public void peak()
	{
		System.out.println(stack.getNodeFromID((stack.getSize()-1)).getName() + " has been peaked");
	}
}
