package hw4;

public class main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String one = "One";
		String two = "Two";
		String three = "Three";
		Stack st = new Stack();
		Queue qu = new Queue();
		
		qu.enqueue(one);
		qu.enqueue(two);
		qu.enqueue(three);
		qu.dequeue();
		System.out.println(qu.peak());
		
		st.push(one);
		st.push(two);
		System.out.println(st.pop());
		
	}

}
