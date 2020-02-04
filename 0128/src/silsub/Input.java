package silsub;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Input {
    private Vector<Member> members;

    public Input(Vector<Member> members) {
        this.members = members;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = sc.next();
        System.out.println("주소 : ");
        String address = sc.next();
        System.out.println("생일(yyyy-mm-dd) : ");
        String birthdayStr = sc.next();
        Scanner sc1 = new Scanner(birthdayStr).useDelimiter("-");
        int year = sc1.nextInt();
        int month = sc1.nextInt();
        int day = sc1.nextInt();
        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month, day);
        System.out.println("나이 : ");
        int age = sc.nextInt();
        System.out.println("성별 : ");
        String gender = sc.next();
        Member inputtingMember = new Member(name, address, birthday, age, gender);
        members.add(inputtingMember);
    }
}
