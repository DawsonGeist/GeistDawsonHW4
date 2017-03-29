package hw4;

public class main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Node one = new Node(1,"One");
		Node two = new Node(2,"Two");
		Node three = new Node(3, "Three");
		Stack st = new Stack();
		Queue qu = new Queue();
		
		System.out.println("testing of the queues\n\n");
		qu.enqueue(one);
		qu.enqueue(two);
		qu.enqueue(three);
		qu.dequeue();
		System.out.println(qu.peak());
		System.out.println("\n\ntesting of the stacks\n\n");
		st.push(one);
		st.push(two);
		st.push(three);
		st.pop();
		st.peak();
		
	}

}
