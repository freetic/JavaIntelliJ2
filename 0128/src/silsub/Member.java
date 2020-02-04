package silsub;

import java.util.Calendar;
import java.util.Date;

public class Member implements Comparable<Member>{
    private String name;
    private String address;
    private Calendar birthday;
    private int age;
    private String gender;

    public Member(String name, String address, Calendar birthday, int age, String gender) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "회원목록[" +
                "이름='" + name + '\'' +
                ", 주소='" + address + '\'' +
                ", 생일='" + birthday + '\'' +
                ", 나이=" + age +
                ", 성별='" + gender + '\'' +
                ']';
    }

    @Override
    public int compareTo(Member o) {
        if(this.getAge() > o.getAge()) return 1;
        else if(this.getAge() < o.getAge()) return -1;
        else return 0;
    }
}
