package queue;

public class main {

	public static void main(String[] args) {
		Intq Q1 = new Intq();
		Q1.enqueue(10);
		Q1.enqueue(20);
		Q1.enqueue(30);
		Q1.enqueue(40);
		
		Q1.showAll();
		
		System.out.println(Q1.dequeue());
		System.out.println(Q1.dequeue());

	}

}
