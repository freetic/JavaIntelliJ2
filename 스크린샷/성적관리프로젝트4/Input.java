import java.util.Scanner;

public class Input {
	private Scanner scan;
	private Student [] array;
	
	public Input(Student [] array) {   //Constructor
		this.scan = new Scanner(System.in);
		this.array = array;
	}
	
	public void input() {
		for(int i = 0 ; i < this.array.length ;i++) {
			System.out.print("�й� : ");  String hakbun = scan.next();
			System.out.print("�̸� : ");  String name = scan.next();
			System.out.print("���� : ");  int kor = scan.nextInt();
			System.out.print("���� : ");  int eng = scan.nextInt();
			System.out.print("���� : ");  int mat = scan.nextInt();
			array[i] = new Student(hakbun, name, kor, eng ,mat);
		}
	}
}
