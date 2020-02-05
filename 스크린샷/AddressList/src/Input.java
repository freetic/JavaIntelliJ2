import java.util.Scanner;
import java.util.Vector;

public class Input {
	private Vector<Member> vector;
	private Scanner scan;
	
	public Input(Vector<Member> vector) {
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}
	
	public void input() { 
		System.out.print("Name : ");    String name = this.scan.nextLine();
		System.out.print("Address : ");    String address = this.scan.nextLine();
		System.out.print("Birthday(yyyy-mm-dd) : ");      String birthday = this.scan.nextLine();
		System.out.print("Age : ");    int age = this.scan.nextInt();
		System.out.print("Gender (³²/¿©) : ");       String gender = this.scan.next();
		Member member = new Member(name, address, birthday, age, gender);
		this.vector.add(member);
	}
}
