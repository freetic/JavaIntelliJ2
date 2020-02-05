
public class Employee /*extends Person*/ implements IPerson {
	private String empno;
	private double salary;
	
	public Employee(/*String name, int age, String address, */
													String empno, double salary) {
		//super(name, age, address);
		this.empno = empno;
		this.salary = salary;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("»ç¹ø = " + empno + ", ºÀ±Þ = " + salary);
	}
//	@Override
//	public String toString() {
//		return String.format("%s, %d, %s, %s, %.1f\n", 
//				getName(), getAge(), getAddress(), empno, salary);
//	}
}
