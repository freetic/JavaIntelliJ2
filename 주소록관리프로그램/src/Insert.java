import java.util.ArrayList;
import java.util.Scanner;

public class Insert {
    Scanner sc;
    ArrayList<Person> list;

    public Insert(Scanner sc, ArrayList<Person> list) {
        this.sc = sc;
        this.list = list;
    }

    public void insert(){
        System.out.print("회원 번호 : ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String tel = sc.next();
        sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();
        list.add(new Person(number, name, tel, address));
    }
}
