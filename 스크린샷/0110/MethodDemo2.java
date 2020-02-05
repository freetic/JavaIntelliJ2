
public class MethodDemo2 {
	public static void main(String[] args) {
		int kor = 90, eng = 100, mat = 79;
		MethodDemo2 md = new MethodDemo2();
		md.calc(kor, eng, mat);
	}
	void calc(int kor, int eng, int mat) {
		int total = kor + eng + mat;
		double avg = total / 3.;
		char grade = mygrade(avg);
		System.out.println("total = " + total + ", avg = " + avg + ", grade = " + grade);
	}
	char mygrade(double avg) {
		char grade = (avg >= 90) ? 'A' : 
								(avg >= 80) ? 'B' :
									(avg >= 70) ? 'C' :
										(avg >= 60) ? 'D' : 'F';
		return grade;
	}
	
}
