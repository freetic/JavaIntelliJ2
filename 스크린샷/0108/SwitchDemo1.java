import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comp_rand = (int)(Math.random() * 6 + 1);
		System.out.print("Insert a value(1 ~ 6) : ");
		int user_rand = scan.nextInt();
		if(user_rand < 1 || user_rand > 6) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.exit(-1);
		}
		System.out.printf("��ǻ���� �� = %d, ������ �� = %d\n", comp_rand, user_rand);
		if(comp_rand > user_rand) {
			System.out.println("Computer WIN.");
		}else if(comp_rand < user_rand) {
			System.out.println("You WIN.");
		}else {
			System.out.println("Again...");
		}
	}
}
