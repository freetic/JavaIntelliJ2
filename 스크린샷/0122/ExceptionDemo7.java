import java.util.Scanner;

/*
 * ����� ���� ����ó���� ����� ���
 * 1. Exception�� ������ �ڽ��ΰ�?
 * 2. ������
 */
public class ExceptionDemo7 {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		do {
			try {
				System.out.print("���� ���� : ");   int kor = scan.nextInt();
				if(scoreCheck(kor))  break;
				else throw new RuntimeException("������ �� �� �Է��ϼ̽��ϴ�. ");
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
