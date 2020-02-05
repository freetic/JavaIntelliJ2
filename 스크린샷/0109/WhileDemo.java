import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		/*
		 * int i = 1; //초기식 while(i <= 5) { //조건 System.out.print(i + "\t"); i++; //증감식
		 * }
		 */
		/*
		 * int start = 1, sum = 0; //for( ; ; ) { while(true) { sum += start; if(sum >
		 * 4000) break; start++; } System.out.println("start = " + start);
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("<<상대에게 보낼 메시지를 입력해 주세요.>>");
		 * System.out.println("<<만일 그만 보내시려면 그냥 엔터치세요.>>"); while(true) {
		 * System.out.print("보낼 메시지 : "); String msg = scan.nextLine(); if(msg.length()
		 * == 0) break; System.out.println("전송한 메시지 : " + msg); }
		 */
		
		int i = 1;
		while(i < 10) {
			int j = 2;
			while(j < 10) {
				System.out.printf("%d x %d = %d\t", j, i, j * i);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
	}
}
