import java.util.Scanner;

public class MainClass {
	private Scanner scan;
	private Friend [] array;
	private int count;
	public MainClass() {
		this.scan = new Scanner(System.in);
		this.array = new Friend[10];
		this.count = 0;
	}
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		outer:
		do {
			int choice = mc.showMenu();
			switch(choice) {
				case 1: mc.add(); break;
				case 2: mc.search(); break;
				case 3 : mc.printList(); break;
				default : break outer;
			}
		}while(true);
	}
	int showMenu() {
		System.out.println("****Menu****");
		System.out.println("1. 추가");
		System.out.println("2. 검색");
		System.out.println("3. 목록보기");
		System.out.print("메뉴를 선택하세요 : ");    return this.scan.nextInt();
	}
	void add() {
		System.out.print("이름 : ");    String name = this.scan.next();
		System.out.print("전화번호 : ");  String tel = this.scan.next();
		System.out.print("관계 : ");     String relation = this.scan.next();
		this.array[count] = new Friend(name, tel, relation);   count++;
	}
	void search() {
		System.out.print("Keyword : ");  String keyword = this.scan.next();
		boolean flag = false;
		for(int i = 0 ; i < this.count ; i++) {
			if(this.array[i].getName().equals(keyword) ||
					this.array[i].getTel().equals(keyword) ||
					this.array[i].getRelation().equals(keyword)) {
				System.out.println(this.array[i]);     flag = true;
			}
		}
		if(!flag)  System.out.println("Not Found");
	}
	void printList() {}
}



