import java.util.Scanner;

public class Student {
	String hakbun, name;
	int kor, eng, mat, tot;
	double avg;
	char grade;
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�й� : ");    hakbun = scan.next();
		System.out.print("�̸� : ");    name = scan.next();
		System.out.print("���� : ");    kor = scan.nextInt();
		System.out.print("���� : ");    eng = scan.nextInt();
		System.out.print("���� : ");    mat = scan.nextInt();
	}
	void calc() {
		tot = kor + eng + mat;
		avg = tot / 3.;
		grade = (avg >= 90) ? 'A' :
						(avg >= 80) ? 'B' :
							(avg >= 70) ? 'C' :
								(avg >= 60) ? 'D' : 'F';
	}
	void output() {
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\n", 
				hakbun, name, kor, eng, mat, tot, avg, grade);
	}
}
