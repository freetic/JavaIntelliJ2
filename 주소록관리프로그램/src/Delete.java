import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    Scanner sc;
    ArrayList<Person> list;

    public Delete(Scanner sc, ArrayList<Person> list) {
        this.sc = sc;
        this.list = list;
    }

    public void delete(){
        System.out.println("[ 회원 삭제 ]");
        System.out.print("삭제할 회원 이름 : ");
        String name = sc.nextLine();
        boolean flag = false;
        for(int i = 0; i < list.size(); i++){
            if(name.equals(list.get(i).getName())){
                list.remove(i);
                flag = true;
            }
        }
        if(!flag) System.out.println("없다.");
    }
}
