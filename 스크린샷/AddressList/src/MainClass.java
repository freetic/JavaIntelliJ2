import java.util.Scanner;
import java.util.Vector;

public class MainClass {
	private Vector<Member> vector;
	private Scanner scan;
	
	public MainClass() {
		this.vector = new Vector<Member>(1,1);
		this.scan = new Scanner(System.in);
	}
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		
		while(true) {
			int choice = mc.showMenu();
			if(choice >= 1 && choice <= 4 ) mc.process(choice);
			else break;
		}
		System.out.println("Program is over...");
	}
	void process(int choice) {
		
		switch(choice) {
			case 1: input();  break;
			case 2: output();  break;
			case 3: search();  break;
		}
	}
	void search() {
		System.out.print("검색할 이름 : ");
		String name = this.scan.next();
		boolean flag = false;
		for(int i = 0 ; i < this.vector.size(); i++) {
			Member member = this.vector.get(i);
			if(member.getName().equals(name)) {
				flag = true;
				System.out.println(member.toString());
			}
		}
		if(!flag)  System.out.println("Not Found");
	}
	void input() {
		Input input = new Input(this.vector);    input.input();
	}
	void output() {
		Sort sort = new Sort(this.vector);     sort.sort();
		Output output = new Output(this.vector);  output.output();
	}
	int showMenu() {
		System.out.println("***********Menu**********");
		System.out.println("1. 입력     2. 출력         3. 검색(이름으로)        4. 삭제         5. 종료");
		System.out.print("선택 >> : ");  
		return this.scan.nextInt();
	}
}
