import java.util.Scanner;

public class Input {
	public Student input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�й� : ");  String hakbun = scan.next();
		System.out.print("�̸� : ");  String name = scan.next();
		System.out.print("���� : ");  int kor = scan.nextInt();
		System.out.print("���� : ");  int eng = scan.nextInt();
		System.out.print("���� : ");  int mat = scan.nextInt();
		Student student = new Student(hakbun, name, kor, eng ,mat);
		return student;
	}
}
