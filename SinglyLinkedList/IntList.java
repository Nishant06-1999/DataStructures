package SinglyLinkedListInt;

public class IntList {
	private Node head;
	
	public IntList()              //Constructor
	{
		head = new Node();
		head.Value = -1;
		head.Next = null;
	}
	
	class Node                          // Creates New Node
	{
		private int Value;
		private Node Next;
	}
	
	public boolean InserAtFirst(int item)      // Insert At Beginning
	{
		Node n = new Node();
		n.Value = item;
		n.Next = head;
		head = n;
		return true;
	}
	
	public boolean InsertEnd(int item)         // Insert Node At The End Of List
	{
		Node n = new Node();
		Node m = head;
		if(isEmpty())                  //if List Is Empty
		{
			n.Value = item;
			n.Next = null;
			head = n;
			System.out.println("First Node Added");
			return true;
		}
		else
		{
			while(m.Next != null)
			{
				m = m.Next;
			}
			m.Next = n;
			n.Value = item;
			n.Next = null;
			System.out.println("Element Added At Last");
			return true;
		}
	}
	
	public void ShowList()                    // Prints Whole List
	{
		if (!isEmpty()) 
		{
			Node n = head;
			while(n != null)
			{
				System.out.println(n.Value);
				n = n.Next;
			}
		}
		else
			System.out.println("List is Empty");
		
	}
	
	public boolean isEmpty()               // Checks the List Is Empty Or Not
	{
		if(head.Value == -1)
		{
			System.out.println("List Is Empty");
			return true;
		}
		else 
			return false;
	}
	
	public boolean DeleteNode(int item)         // Delete Node From Value
	{
		if(!isEmpty())                         // Check list is Empty or Not
		{
			Node n = head;
			Node m = head.Next;
			if(head.Value == item)     //Node At First
			{
				System.out.println("Deleted "+item +"Sucsessfully");
				head = head.Next;
				return true;
			}
			else
			{
				while(n.Value == item)
					n = n.Next;
			}
			while(true)
			{
				if (m.Value == item || m.Next == null)
				{
					break;
				}
				else
				{
					n = m ;
					m = m.Next ;
				}
			}
			if(m.Next != null || m.Value == item)
			{
				System.out.println("Element Deleted Succsessfully");
				n.Next = m.Next;
				return true;
			}
			else
			{
				System.out.println("Element Not found");
				return true;
			}
		}
		else
			return false;	
	}
	
	public void sortList()
	{
		if(!isEmpty())
		{
			int temp=0;
			Node a = head;
			while(a.Next != null)
			{
				Node b = head;
				while (b.Next != null)
				{
					if(b.Next.Value > b.Value)
					{
						temp = b.Value;
						b.Value = b.Next.Value;
						b.Next.Value = temp;
					}
					b = b.Next;
				}
				a = a.Next;
			}
		}
	}

}
