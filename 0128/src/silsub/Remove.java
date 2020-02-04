package silsub;

import java.util.Scanner;
import java.util.Vector;

public class Remove {
    private Vector<Member> members;

    public Remove(Vector<Member> members) {
        this.members = members;
    }

    public void remove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색 할 이름 : ");
        String name = sc.next();
        boolean flag = false;
        for(int i = 0; i < members.size(); i++){
            if((members.get(i).getName()).equals(name)){
                flag = true;
                members.remove(i);
                break;
            }
        }
        if(!flag) System.out.println("그런 이름 없담마.");
    }
}
