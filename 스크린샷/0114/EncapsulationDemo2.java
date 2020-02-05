
public class EncapsulationDemo2 {
	public static void main(String[] args) {
		Employee chulsu = new Employee();
		System.out.println(chulsu.name);
		System.out.println(chulsu.salary);
	}
}
class Employee{
	String name;     int salary;
	public void display() {
		//this(1000);
	}
	//this() : 나의 생성자가 나의 또 다른 생성자를 호출할 때
	public Employee() {
		//new Employee("unknown", 1000);
		this(1000);
		System.out.println( "Hello ,World");
		
	}
	public Employee(String name) {}
	public Employee(int salary) {}
	public Employee(String name, int salary) {
		this.name = name;    this.salary = salary;
	}
}