import java.util.Scanner;

/*
 * 사용자 정의 예외처리를 만드는 방법
 * 1. Exception이 누구의 자식인가?
 * 2. 생성자
 */
public class ExceptionDemo7 {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		do {
			try {
				System.out.print("국어 점수 : ");   int kor = scan.nextInt();
				if(scoreCheck(kor))  break;
				else throw new RuntimeException("점수를 잘 못 입력하셨습니다. ");
			}catch(RuntimeException ex) {
				System.out.println(ex.getMessage());
			}
		}while(true);
		
	}
	static boolean scoreCheck(int jumsu) {
		if(jumsu >= 0 && jumsu <= 100) return true;
		else return false;
	}
//		Student chulsu = new Student();
//		chulsu.setEng(101);
//		try {
//			chulsu.setKor(120);
//		} catch (KoreanException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	//}
}
