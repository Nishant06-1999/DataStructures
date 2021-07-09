package Stack;

public class Person {
	private String rollno;
	private String name;
	
	public Person(String rollno , String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	
	public String toString()
	{
		return "Rollno: " + this.rollno + " Name: " + this.name ; 
	}
}
