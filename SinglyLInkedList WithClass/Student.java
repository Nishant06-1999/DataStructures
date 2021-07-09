package SinglyLinkedListStudent;

public class Student {
	private int rollno;
	private String name;
	public Student (int rollno, String name) 
	{
		this.name = name;
		this.rollno = rollno;
	}
	public String toString()
	{
		return "Rollno " + this.rollno + " Name " + this.name;
	}
	

	

}