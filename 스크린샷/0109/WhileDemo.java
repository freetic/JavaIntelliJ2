import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		/*
		 * int i = 1; //�ʱ�� while(i <= 5) { //���� System.out.print(i + "\t"); i++; //������
		 * }
		 */
		/*
		 * int start = 1, sum = 0; //for( ; ; ) { while(true) { sum += start; if(sum >
		 * 4000) break; start++; } System.out.println("start = " + start);
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("<<��뿡�� ���� �޽����� �Է��� �ּ���.>>");
		 * System.out.println("<<���� �׸� �����÷��� �׳� ����ġ����.>>"); while(true) {
		 * System.out.print("���� �޽��� : "); String msg = scan.nextLine(); if(msg.length()
		 * == 0) break; System.out.println("������ �޽��� : " + msg); }
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
