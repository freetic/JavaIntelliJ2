import java.util.Comparator;
import java.util.Scanner;

public class Student{

    private String hakbun, name;
    private int kor, eng, mat, tot;
    private double avg;
    private char grade;

    public Student(String hakbun, String name, int kor, int eng, int mat) {
        this.hakbun = hakbun;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hakbun='" + hakbun + '\'' +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", mat=" + mat +
                ", tot=" + tot +
                ", avg=" + avg +
                ", grade=" + grade +
                '}';
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학번 : "); hakbun = sc.next();
        System.out.print("이름 : "); name = sc.next();
        System.out.print("국어 : "); kor = sc.nextInt();
        System.out.print("영어 : "); eng = sc.nextInt();
        System.out.print("수학 : "); mat = sc.nextInt();
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return tot;
    }

    public double getAvg() {
        return avg;
    }

    public char getGrade() {
        return grade;
    }

//    @Override
//    public int compare(Student o1, Student o2) {
////        if(this.tot > ((Student)o).getTot()) return -1;
////        if(this.tot < ((Student)o).getTot()) return 1;
////        else return 0;
//        if(o1.getTot() > o2.getTot()) return 1;
//        else if(o1.getTot() < o2.getTot()) return -1;
//        else return 0;
//    }
}
