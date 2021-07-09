package SinglyLinkedListInt;

public class Main {

	public static void main(String[] args) {
		IntList l1 = new IntList();
		l1.InsertEnd(05);
		l1.InsertEnd(60);
		l1.InsertEnd(50);
		l1.InsertEnd(04);
		l1.InsertEnd(30);
		l1.ShowList();
		
		l1.sortList();
		System.out.println();
		l1.ShowList();

	}

}
