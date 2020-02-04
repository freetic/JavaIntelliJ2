import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Scanner sc;
    ArrayList<Person> list;
    private static final String PATH;   // static 상수 선언

    static{
        PATH = "C:/temp/addresslist.ser";   // static 상수 초기화
    }
    public Main(){
        this.sc = new Scanner(System.in);
        this.list = new ArrayList<>();
    }

    public static void main(String[] args) {
        
        Main main = new Main(); // 여기서 스캐너 초기화
        Init init = new Init(PATH);
        main.list = init.init();

        System.out.println("Program loading Success");

        while(true){
            int choice = main.showMenu();
            main.process(choice);
        }
    }
    private int showMenu(){
        boolean flag;
        int choice = 0;
        do {
            flag = false;
            System.out.println("[ 회원 주소록 ]");
            System.out.println("1. 전체 회원 보기");
            System.out.println("2. 회원 정보 등록");
            System.out.println("3. 회원 정보 검색");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 회원 정보 수정");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 번호 선택 >> ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            if(choice < 0 || choice > 5){
                System.out.println("잘못된 입력이니 다시 입력하시오.");
                flag = true;
            }
        } while (flag);
        return choice;
    }

    private void process(int choice){
        switch(choice){
            case 0:
                Save save = new Save(this.list, PATH);
                save.save();
                System.out.println("Data Save Success");
                System.exit(0); break;
            case 1:
                List myList = new List(this.list);
                myList.printList();
                break;
            case 2:
                Insert insert = new Insert(sc, list);
                insert.insert();
                break;
            case 3:
                Search search = new Search(sc, list);
                search.search();
                break;
            case 4:
                Delete delete = new Delete(sc, list);
                delete.delete();
                break;
            case 5:
                Update update = new Update(sc, list);
                update.update();
                break;
        }
    }
}
