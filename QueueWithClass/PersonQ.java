package QueClass;

public class PersonQ {
	
	private Person [] Q;
	private int size;
	private int front;
	private int rear;
	private int total;
	
	public PersonQ()
	{
		size = 50;
		front = 0;
		rear = 0;
		total = 0;
		Q = new Person[size];
	}
	public PersonQ(int size)
	{
		this.size = size;
		front = 0;
		rear = 0;
		total = 0;
		Q = new Person[size];
	}
	
	public boolean isFull()
	{
		return (total == size );
	}
	public void enqueue(Person item)
	{
		if(!isFull())
		{
			
			total++;
			Q[rear] = item;	
			rear = (rear + 1) % size ;
		}
		else 
			System.out.println("Can't Queue is Full");
	}
	
	public Person dequeue()
	{
		Person item = Q[front]; 
		total--;
		front = (front + 1) % size;
		return item;
		
	}
	
	public void showAll()
	{
		int  f = front;
		if(total != 0)
		{
			for(int i=0 ; i < total ; i++)
			{
				System.out.println(" "+Q[f].toString());
				f = (f + 1) % size;
			}
		}
	}


}
