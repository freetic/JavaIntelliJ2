import java.util.Scanner;

public class �ǽ�����_0121 {
	public static void main(String[] args) {
		// 1��
		/*
		 * Scanner input = new Scanner(System.in); 
		 * int time, hour, minute, sec;
		 * System.out.print("�ð��� �� ������ �Է��ϼ��� : "); 
		 * time = input.nextInt(); 
		 * sec = time;
		 * hour = sec / 3600; 
		 * sec = sec % 3600; 
		 * minute = sec / 60; 
		 * sec = sec % 60;
		 * System.out.println(time + "�ʴ� " + hour + "�ð� " + minute + "�� " + sec +
		 * "���Դϴ�.");
		 */

		// 2��
		/*
		 * int i; 
		 * for (i = 41; i < 123; i++) { 
		 * 		System.out.print(i + ":" + (char) i + "\t"); 
		 * 		if (i % 8 == 0) { 
		 * 			System.out.println(); 
		 *     } 
		 * }
		 */

		// 3��
		/*
		 * for (int i = 1; i < 6; i++) { 
		 * 		for (int j = i; j < i + 5; j++) {
		 * 			System.out.print(j + " "); 
		 * 		} 
		 * System.out.println(); }
		 */

		// 4��
		Scanner scan = new Scanner(System.in);
		String[] seats = { "���డ��", "���డ��", "���డ��", "���డ��", 
				"���డ��", "���డ��", "���డ��", "���డ��", "���డ��", "���డ��" };
		int result;
		int seatNo;
		while (true) {
			result = 0;
			System.out.print("> �¼��� �����Ͻðڽ��ϱ�? (��-1 �ƴϿ�-0) : ");
			result = scan.nextInt();
			if (result == 1) {
				System.out.println("==���� �¼� ����==");
				for (int i = 0; i < seats.length; i++) {
					System.out.print("[" + (i + 1) + "]" + seats[i] + " ");
				}
				System.out.println();
				System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�? ");
				seatNo = scan.nextInt();
				if (seatNo > seats.length) {
					System.out.println("���� �¼���ȣ�Դϴ�.");
				} else if (seats[seatNo - 1].equals("�����")) {
					System.out.println("�̹� ����� �¼��Դϴ�.");
				} else {
					seats[seatNo - 1] = "�����";
					System.out.println("����Ǿ����ϴ�.");
				}
			} else {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
