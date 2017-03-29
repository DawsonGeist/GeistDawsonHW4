package hw4;
import java.util.*;
public class Stack 
{
	ArrayList<String> queue = new ArrayList<String>();
	public Stack()
	{
		
	}
	
	public void push(String st)
	{
		queue.add(st);
		System.out.println(st+ " has been pushed");
	}
	
	public String pop()
	{
		return queue.remove(queue.size() - 1) + " has been popped";
	}
	
	public String peak()
	{
		return queue.get(queue.size() - 1) + " has been peaked";
	}
}
