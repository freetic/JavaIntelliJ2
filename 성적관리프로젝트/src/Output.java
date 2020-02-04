import java.util.Iterator;
import java.util.Vector;

public class Output {
    private Vector<Student> vector;
    public Output(Vector<Student> vector){
        this.vector = vector;
    }
    public void output(){
        this.printLabel();
        Iterator<Student> iter = vector.iterator();
        while(iter.hasNext()){
            Student s = iter.next();
            System.out.println(s);
        }
    }
    private void printLabel(){
        System.out.println("  <<싸용고등학교 성적관리 프로그램>>");
        System.out.println("학번 이름 국어 영어 수학 총점 평균 평점");
        System.out.println("---------------------------------------");
    }
}
