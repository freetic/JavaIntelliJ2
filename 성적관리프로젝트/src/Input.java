import java.util.Scanner;
import java.util.Vector;

public class Input {
    private Scanner sc;
    private Vector<Student> vector;

    public Input(Vector<Student> vector){
        sc = new Scanner(System.in);
        this.vector = vector;
    }
    public void input(){
        boolean flag = false;
        outer:
        while(true) {
            String hakbun, name;
            int kor, eng, mat;
            System.out.print("학번 : ");
            hakbun = sc.next();
            System.out.print("이름 : ");
            name = sc.next();
            System.out.print("국어 : ");
            kor = sc.nextInt();
            System.out.print("영어 : ");
            eng = sc.nextInt();
            System.out.print("수학 : ");
            mat = sc.nextInt();
            vector.add(new Student(hakbun, name, kor, eng, mat));
            System.out.println("더 넣을래? Y / N : ");
            String choice = sc.next();
            do{
                flag = false;
                if(choice.toUpperCase().equals("N")) break outer;
                else if(choice.toUpperCase().equals("Y")){
                    flag = false;
                    continue;
                }
                else flag = true;
            } while(flag);
        }
    }

}
