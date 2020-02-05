import java.util.Scanner;

public class 실습과제_0121 {
	public static void main(String[] args) {
		// 1번
		/*
		 * Scanner input = new Scanner(System.in); 
		 * int time, hour, minute, sec;
		 * System.out.print("시간을 초 단위로 입력하세요 : "); 
		 * time = input.nextInt(); 
		 * sec = time;
		 * hour = sec / 3600; 
		 * sec = sec % 3600; 
		 * minute = sec / 60; 
		 * sec = sec % 60;
		 * System.out.println(time + "초는 " + hour + "시간 " + minute + "분 " + sec +
		 * "초입니다.");
		 */

		// 2번
		/*
		 * int i; 
		 * for (i = 41; i < 123; i++) { 
		 * 		System.out.print(i + ":" + (char) i + "\t"); 
		 * 		if (i % 8 == 0) { 
		 * 			System.out.println(); 
		 *     } 
		 * }
		 */

		// 3번
		/*
		 * for (int i = 1; i < 6; i++) { 
		 * 		for (int j = i; j < i + 5; j++) {
		 * 			System.out.print(j + " "); 
		 * 		} 
		 * System.out.println(); }
		 */

		// 4번
		Scanner scan = new Scanner(System.in);
		String[] seats = { "예약가능", "예약가능", "예약가능", "예약가능", 
				"예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능" };
		int result;
		int seatNo;
		while (true) {
			result = 0;
			System.out.print("> 좌석을 예약하시겠습니까? (예-1 아니오-0) : ");
			result = scan.nextInt();
			if (result == 1) {
				System.out.println("==현재 좌석 상태==");
				for (int i = 0; i < seats.length; i++) {
					System.out.print("[" + (i + 1) + "]" + seats[i] + " ");
				}
				System.out.println();
				System.out.print("몇 번째 좌석을 예약하시겠습니까? ");
				seatNo = scan.nextInt();
				if (seatNo > seats.length) {
					System.out.println("없는 좌석번호입니다.");
				} else if (seats[seatNo - 1].equals("예약됨")) {
					System.out.println("이미 예약된 좌석입니다.");
				} else {
					seats[seatNo - 1] = "예약됨";
					System.out.println("예약되었습니다.");
				}
			} else {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
