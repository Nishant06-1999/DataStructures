package QueClass;

public class main {

	public static void main(String[] args) {
		Person p1 = new Person( 01 , "Nishant");
		Person p2 = new Person( 02 , "Nikhil");
		
		PersonQ pq1 = new PersonQ();
		pq1.enqueue(p1);
		pq1.enqueue(p2);
		pq1.showAll();
		
		System.out.println(pq1.dequeue().toString());

	}

}
