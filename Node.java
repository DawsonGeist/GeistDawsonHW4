package hw4;

public class Node 
{
	private int id;
	public String name;
	private Node next;
	private Node previous;

	public Node(int id, String content) 
	{
		this.id = id;
		name = content;
		this.next = null;
		this.previous = null;
	}

	public Node getNext() 
	{
		return next;
	}

	public void setNext(Node node)
	{
		this.next = node;
	}

	public Node getPrevious() 
	{
		return previous;
	}

	public void setPrevious(Node node) 
	{
		this.previous = node;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String toString() 
	{
		return "Letter: " + this.name + " ID: " + this.id;
	}
 

}
