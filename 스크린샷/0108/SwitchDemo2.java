import java.util.Scanner;
import java.util.Calendar;

public class SwitchDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		int current_year = now.get(Calendar.YEAR);
		System.out.print("�̸� : ");    String name = scan.next();
		System.out.print("����⵵ : ");  int born_year = scan.nextInt();
		System.out.printf("%s(%d��)��! ", name, (current_year - born_year + 1));
		switch(born_year % 12) {
			case 0: System.out.println("�����̶��Դϴ�.");  break;  //��
			case 1: System.out.println("�߶��Դϴ�.");  break;       //��
			case 2: System.out.println("�����Դϴ�.");  break;       //��
			case 3: System.out.println("�������Դϴ�.");  break;       //��
			case 4: System.out.println("����Դϴ�.");  break;       //��
			case 5: System.out.println("�Ҷ��Դϴ�.");  break;       //��
			case 6: System.out.println("ȣ���̶��Դϴ�.");  break;       //��
			case 7: System.out.println("�䳢���Դϴ�.");  break;       //��
			case 8: System.out.println("����Դϴ�.");  break;       //��
			case 9: System.out.println("����Դϴ�.");  break;       //��
			case 10: System.out.println("�����Դϴ�.");  break;     //��
			default: System.out.println("����Դϴ�.");  break;     //��
		}
	}
}
