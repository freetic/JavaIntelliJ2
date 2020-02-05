public class VariableDemo {
	public static void main(String[] args) {
		System.out.println("age = " + Employee.age);
		Employee emp = new Employee();
		System.out.println("name = " + emp.name);
	}
}
class Employee{
	String name = "วัม๖นฮ";      //member variable / instance variable
	static int age = 24;   //static variable / class variable
}