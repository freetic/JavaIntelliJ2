import java.util.ArrayList;
import java.util.Scanner;

public class Update {
    Scanner sc;
    ArrayList<Person> list;

    public Update(Scanner sc, ArrayList<Person> list) {
        this.sc = sc;
        this.list = list;
    }

    public void update() {
        System.out.println("[ 회원 수정 ]");
        System.out.print("수정할 회원 이름 : ");
        String name = sc.nextLine();
        boolean flag = false;
        for(int i = 0; i < list.size(); i++){
            if(name.equals(list.get(i).getName())){
                System.out.print("변경할 전화번호(이전 - " + list.get(i).getNumber() + ") : ");
                String tel = sc.next();
                list.get(i).setTel(tel);
                sc.nextLine();
                System.out.print("변경할 주소(이전 - " + list.get(i).getAddress() + ") : ");
                String address = sc.nextLine();
                list.get(i).setAddress(address);
                flag = true;
            }
        }
        if(!flag) System.out.println("없다.");
    }
}
