import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    Scanner sc;
    ArrayList<Person> list;

    public Search(Scanner sc, ArrayList<Person> list) {
        this.sc = sc;
        this.list = list;
    }

    public void search(){
        System.out.println("[ 회원 검색 ]");
        System.out.print("검색할 회원 이름 : ");
        String name = sc.nextLine();
        boolean flag = false;
        for(int i = 0; i < list.size(); i++){
            if(name.equals(list.get(i).getName())){
                System.out.println(list.get(i).toString());
                flag = true;
            }
        }
        if(!flag) System.out.println("없다.");
    }
}
