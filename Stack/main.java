package Stack;

public class main {

	public static void main(String[] args) {
//		
//		IntStack no1 = new IntStack();
//		no1.push(10);
//		no1.push(20);
//		no1.push(30);
//		no1.push(40);
//		no1.push(50);
//		
//		System.out.println(no1.pop());
//		System.out.println(no1.pop());
//		System.out.println(no1.pop());
//		
//		*Output*
//		50
//		40
//		30



		Person p1 = new Person("1", "Nishant");
		Person p2 = new Person("2", "Nikhil");
		
		PersonStack ps = new PersonStack();
		
		ps.push(p1);
		ps.push(p2);
		
		System.out.println(ps.pop().toString());
		System.out.println(ps.pop().toString());
		

	}

}
