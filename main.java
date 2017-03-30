package hw4;

public class main {
	
	public static void transferStackToQueue(Stack st, Queue qu)
	{
		while(st.size>0)
		{
			qu.enqueue(st.pop());
		}
	}
	
	public static void transferQueueToStack(Stack st, Queue qu)
	{
		int size = qu.size;
		//Q-fills->S-fills->Q-Final fill->S
		//3 total exchanges
		for(int i = 0;i<3;i++)
		{
			if(i%2==0)//unloading qu into st
			{
				for(int k=0;k<size;k++)
				{
					st.push(qu.dequeue());
				}
			}
			else//unloading st into qu
			{
				for(int k=0;k<size;k++)
				{
					qu.enqueue(st.pop());
				}
			}
		}
	}
	
	public static void transferStackToStack(Stack st1, Stack st2)
	{
		int size = st1.size;
		Queue temp = new Queue();
		//s2-fills->q-fills->s2-fill->Q-final fill->s2
		//4 total exchanges
		for(int i = 0;i<4;i++)
		{
			//there are four cases because you cant have st1 = st2,
			//by using the que as a middle man st2 can recieve
			//the contents of st1
			
			if(i==0)//unloading s1 into q
			{
				for(int k=0;k<size;k++)
				{
					temp.enqueue(st1.pop());
				}
			}
			if(i==1)//unloading q into s2
			{
				for(int k=0;k<size;k++)
				{
					st2.push(temp.dequeue());
				}
			}
			if(i==2)//unloading s2 into q
			{
				for(int k=0;k<size;k++)
				{
					temp.enqueue(st2.pop());
				}
			}
			if(i==3)//unloading q into s2
			{
				for(int k=0;k<size;k++)
				{
					st2.push(temp.dequeue());
				}
			}
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Node one = new Node(1,"One");
		Node two = new Node(2,"Two");
		Node three = new Node(3, "Three");
		Stack st = new Stack();
		Queue qu = new Queue();
		
		System.out.println("\n\nstack\n\n");
		st.push(one);
		st.push(two);
		st.push(three);
		System.out.println("\nempty\n");
		st.pop();
		st.pop();
		st.pop();
		System.out.println("\n\nstack\n\n");
		st.push(one);
		st.push(two);
		st.push(three);
		System.out.println("\nIf method is correct above output from empty\nwill match the dequeue output below\n");
		System.out.println("\n\ntransfer Stack to Queue\n\n");
		transferStackToQueue(st,qu);
		System.out.println("\nempty the queue\n");
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();
		System.out.println("\n**********************2.3.1 Complete**********************\n\n");
		st.push(one);
		st.push(two);
		st.push(three);
		transferStackToQueue(st,qu);
		System.out.println("\nQueue is filled, tranfering to stack\n");
		transferQueueToStack(st, qu);
		System.out.println("\n\nIf output  is = 321(Descending) then method is correct\n\n");
		st.pop();
		st.pop();
		st.pop();
		System.out.println("\n**********************2.3.2 Complete**********************\n\n");
		st.push(one);
		st.push(two);
		st.push(three);
		System.out.println("\nStack is filled, tranfering to new Stack\n");
		Stack different = new Stack();
		transferStackToStack(st, different);
		System.out.println("\n\nIf correct the output below: 321(descending)\n\n");
		different.pop();
		different.pop();
		different.pop();
		System.out.println("\n**********************2.3.3 Complete**********************\n\n");
	}

}
