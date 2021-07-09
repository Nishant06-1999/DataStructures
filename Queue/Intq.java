package queue;

import java.util.Iterator;

public class Intq {
	

			private int [] Q;
			private int size;
			private int front;
			private int rear;
			private int total;
			
			public Intq()
			{
				size = 50;
				front = 0;
				rear = 0;
				total = 0;
				Q = new int[size];
			}
			public Intq(int size)
			{
				this.size = size;
				front = 0;
				rear = 0;
				total = 0;
				Q = new int[size];
			}
			
			public boolean isFull()
			{
				return (total == size );
			}
			public void enqueue(int item)
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
			
			public int dequeue()
			{
				int item = Q[front]; 
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
						System.out.println(" "+Q[f]);
						f = (f + 1) % size;
					}
				}
			}

	

}
