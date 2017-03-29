package hw4;

import java.util.*;

public class Queue 
{
	ArrayList<String> queue = new ArrayList<String>();
	public Queue()
	{
		
	}
	
	public void enqueue (String st)
	{
		queue.add(st);
		System.out.println("Enqueued "+st);
	}
	
	public void dequeue()
	{
		int last = queue.size() - 1;
		String removed = queue.get(last);
		queue.remove(last);
		System.out.println("Dequeued "+ removed);
	}
	
	public String peak()
	{
		int last = queue.size() - 1;
		return "Peaked " + queue.get(last);
	}
}
