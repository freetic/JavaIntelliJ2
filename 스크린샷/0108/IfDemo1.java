import java.util.Scanner;

public class IfDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");     String hakbun = scan.nextLine();
		System.out.print("이름 : ");     //scan.next();     
		String name = scan.nextLine();
		System.out.print("국어 : ");     int kor = scan.nextInt();
		System.out.print("영어 : ");     int eng = scan.nextInt();
		System.out.print("수학 : ");     int mat = scan.nextInt();
		int tot = kor + eng + mat;     double avg = tot / 3.;
		char grade;
		switch((int)(avg / 10)) {
			case 10:  
			case 9:    grade = 'A';   break;
			case 8:    grade = 'B';   break;
			case 7:    grade = 'C';   break;
			case 6:    grade = 'D';   break;
			default :  grade  ='F';
		}
		
		
		
		/*
		 * if(avg >= 90) grade = 'A'; else if(avg >= 80) grade = 'B'; else if(avg >= 70)
		 * grade = 'C'; else if(avg >= 60) grade = 'D'; else grade = 'F';
		 */
		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.1f\t%c\n",
				name, hakbun, kor, eng, mat, tot, avg, grade);
	}
}




