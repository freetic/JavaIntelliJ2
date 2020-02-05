import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ��, �� �� ? : ");
		int year = scan.nextInt();   int month = scan.nextInt();
		Main m = new Main();
		int space = m.getWeekday(year, month);  
		int maxday = m.getMaxDay(year, month);
		m.display(space, maxday);
	}
	void display(int space, int maxday) {
		//ù ��...
		System.out.println("��\t��\t��\t�\t��\t��\t��");
		System.out.println("----------------------------------------------------");
		int count = 0;
		for(int i = 0 ; i < space ; i++) {
			System.out.print("��\t");   count++;
		}
		for(int i = 1 ; i <= maxday ; i++) {
			System.out.print(i + "\t");   count++;
			if(count % 7 == 0) System.out.println();
		}
		
	}
	int getWeekday(int year, int month) {
		//1. �� ���� ����ϱ�
		int sum = 0;
		for(int i = 1 ; i < year ; i++) {
			if(isLeapYear(i)) sum += 366;
			else sum += 365;
		}
		for(int i = 1 ; i < month ; i++) {
			sum += getMaxDay(year, i);
		}
		sum++;
		return sum % 7;
	}
	int getMaxDay(int year, int month) {
		int maxday = 0;
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: maxday = 31; break;
			case 4:
			case 6:
			case 9:
			case 11: maxday = 30; break;
			case 2:
				if(isLeapYear(year)) maxday = 29;
				else maxday = 28; 
				break;
		}
		return maxday;
	}
	boolean isLeapYear(int year){
		//Parameter�� ���� �⵵�� �����̶�� true, �׷��� ������ false�� �����ϱ�
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			return true;
		else return false;
	}
}
