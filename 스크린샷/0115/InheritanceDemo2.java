
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Student chulsu = 
				new Student("2019-01", "ÇÑÁö¹Î", 29);
		Employee jimin = 
				new Employee("Handok-2017", "±èÁö¹Î", 30);
		System.out.println("³ªÀÌ = " + chulsu.getAge() );
		System.out.println("³ªÀÌ = " + jimin.getAge());
	}
}
