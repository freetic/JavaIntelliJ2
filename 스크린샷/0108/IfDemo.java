import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //keyboard
		System.out.print("�����Ͻô� ���� : ");
		String season = scan.next();
		System.out.println("season = " + season);
		switch(season) {
			case "spring":
				System.out.println("������, ���޷�");  break;
			case "summer":
				System.out.println("���, ��ī�þ�");  break;
			case "fall":
				System.out.println("�ڽ���, ����");  break;
			case "winter":
				System.out.println("����, ��ȭ");  break;
		}
		/*
		 * if(season.equals("spring")) { System.out.println("������, ���޷�"); }else
		 * if(season.equals("summer")) { System.out.println("���, ��ī�þ�"); }else
		 * if(season.equals("fall")) { System.out.println("�ڽ���, ����"); }else
		 * if(season.equals("winter")){ System.out.println("����, ��ȭ"); }
		 */
	}
}
