package QueClass;



public class Person {
	private int rollno;
	private String name;
	public Person (int rollno, String name) 
	{
		this.name = name;
		this.rollno = rollno;
	}
	public String toString()
	{
		return "Rollno " + this.rollno + " Name " + this.name;
	}
}
