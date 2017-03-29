package hw4;

public class Stack 
{
	NodeList stack;
	public Stack()
	{
		stack = new NodeList();
	}
	
	public void push(Node st)
	{
		stack.add(st);
		System.out.println(st.getName()+ " has been pushed");
	}
	
	public void pop()
	{
		System.out.println(stack.getNodeFromID((stack.getSize()-1)).getName() +" has been popped");
		stack.deleteNode(stack.getNodeFromID((stack.getSize()-1)));
	}
	
	public void peak()
	{
		System.out.println(stack.getNodeFromID((stack.getSize()-1)).getName() + " has been peaked");
	}
}
