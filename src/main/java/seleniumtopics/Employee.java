package seleniumtopics;

public class Employee {

	String name;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.name = "Peter";
		e1.age= 56;

		System.out.println(e1.name);
		System.out.println(e1.age);
		
		
		e1=null;
		
		System.out.println(e1.name);
	}
}
