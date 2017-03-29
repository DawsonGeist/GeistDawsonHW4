package hw4;

public class NodeList
{
	private int size = 0;
	public Node root = null;
	
	public int getSize()
	{
		return size;
	}

	public void add(Node node) 
	{
		if (node == null)
			return;
		if (root == null)
		{
			Node newNode = new Node(0, node.getName());
			root = newNode;
		} 
		else 
		{
			Node currentNode = root;
			while (currentNode.getNext() != null)
			{
				currentNode = currentNode.getNext();
			}
			int id = currentNode.getId();
			id++;
			Node newNode = new Node(id, node.getName());
			currentNode.setNext(newNode);
			newNode.setPrevious(currentNode);
		}
		size++;
	}
	
/*
 * since we are looking for a string instead of a node i have 
 * adapted the findNode method from lab 6 and used to to comb
 * through nodes to see if any nodes held a string that matched
 * the one that was entered.
 * if the node is found  true is the output; else it is false
 
 */
	public boolean searchNodeString(String search) 
	{
		Node currentNode = root;
		while (currentNode.getName() != search) 
		{
			currentNode = currentNode.getNext();
			if (currentNode == null)
				return false;
		}
		return true;
	}
	
	public Node getNodeFromID(int searchId) 
	{
		Node currentNode = root;
		while (currentNode.getId() != searchId) 
		{
			currentNode = currentNode.getNext();
			if (currentNode == null)
				return null;
		}
		return currentNode;
	}
	
	public void ascendList()
	{
		Node temp = null;
		for(int i=0;i<size;i++)
		{
			if(root==null)
				break;
			if(i==0)
			{
				System.out.println(root.toString());
				temp=root.getNext();
			}
			else
			{
				System.out.println(temp.toString());
				temp=temp.getNext();
			}
		}
	}
	
	public void descendList()
	{
		for(int i=0;i<size;i++)
		{
			if(root==null)
				break;
			else
			{
				System.out.println(getNodeFromID((size-1)-i));
			}
		}
	}
	
	public void addAlphabetically(Node userEntry)
	{
		Node tempComparison = root;
		Node previousComparison = root;
		String userEntryString=userEntry.getName().toLowerCase();
		String listString;
		Character listChar;
		Character userChar;
		int comparisonResult = 0;
		
		
		//loops through the list
		for(int i = 0;i<=size;i++)
		{
			//if the list is empty
			if(root==null)
			{
				root = userEntry;
				size++;
				break;
			}
			else //extracts the string in the new node
			{
				listString = tempComparison.getName().toLowerCase();
			}
			
			//loops through the node name
			for(int k = 0; k<userEntryString.length();k++)
			{
				userChar = userEntryString.charAt(k);
				listChar = listString.charAt(k);
			
				comparisonResult = userChar.compareTo(listChar);
				//if userEntry comes after the listNode in the alphabet
				if(comparisonResult>0)
				{
					break;
				}
				else if(comparisonResult<0)//comes before
				{
					break;
				}
				else//they equal
				{
					//do nothing so that the loops changes the characters
				}
			}
			
			
			
			if(comparisonResult>0)//userEntry goes ahead of listNode
			{
				previousComparison=tempComparison;
				tempComparison = tempComparison.getNext();//updates the comparing Node
			}
			else if(comparisonResult<0)//comes before
			{
				if(tempComparison==root)//if the user entry needs to be the new root
				{
					root = userEntry;
					userEntry.setNext(tempComparison);
					size++;
				}
				else
				{
				userEntry.setNext(tempComparison);//put user before comparedNode
				previousComparison.setNext(userEntry);//connects previousNode to the userNode
				size++;
				}
				break;
			}
		}//end of the loop that runs through the list
		
		
	}
	
	public void deleteNode(Node eraseThis)
	{
		Node temp = root;
		Node previous = root;
		for(int i =0;i<size;i++)
		{
			if(eraseThis.getId()==temp.getId()&&i==0)//only node contained in list is root
			{
				root = root.getNext();
				size--;
				break;
			}
			else if(eraseThis.getId()==temp.getId())
			{
				previous.setNext(temp.getNext());//skips the Node that matched the eraseNode
				size--;
				break;
			}
			else
			{
				if(i==size-1)//fail safe if the node passed don't exist in the nodeList
				{
					System.out.println("Node doesnt exist in list");
					break;
				}
				previous=temp;
				temp=temp.getNext();
			}
		}
	}
	
	public void deleteList()
	{
		root = null;
		size = 0;
	}

}
