package SinglyLinkedListStudent;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(01,"Nishant");
		Student s2 = new Student(02,"Nikhil");
		Student s3 = new Student(03,"Neha");
		Student s4 = new Student(04,"Aniket");
		
		ListStudent l = new ListStudent();
		l.insertStudent(s1);
		l.insertStudent(s2);
		l.insertStudent(s3);
		l.insertStudent(s4);
		
		l.showList();
		
		l.deleteRecord(s1);
		System.out.println();
		l.showList();

	}

}
