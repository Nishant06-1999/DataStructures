package SinglyLinkedListStudent;

public class ListStudent {
	private Node head;
	
	public ListStudent()              //Constructor
	{
		head = new Node();
		head.student = null;
		head.Next = null;
	}
	
	class Node                          // Creates New Node
	{
		private Student student;
		private Node Next;
	}
	
	public boolean insertStudent(Student s)
	{
		Node m = new Node();
		Node n = head;
		if(head.student == null)
		{
			n.student = s;
			n.Next = null;
			head = n;
			return true;
		}
		else
		{
			while (n.Next != null)
			{
				n = n.Next;
			}
			n.Next = m;
			m.Next = null;
			m.student = s;
			return true;
		}
	}
	
	public void showList()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.student.toString());
			n = n.Next;
		}
	}
	
	public boolean deleteRecord(Student s)
	{
		Node n = new Node();
		Node m = new Node();
		m = head;
		n.student = s;
		if(m.student == n.student)
		{
			head = head.Next;
			return true;
		}
		else
		{
			while(true)
			{
				while(m.Next.student != n.student)
				{
					m = m.Next;
					break;
				}
				if(m.Next.student == n.student)
				{
					m.Next = m.Next.Next;
					System.out.println("Element Deleted");
					return true;
				}
				
			}	
		}
	}
}
