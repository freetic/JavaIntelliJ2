import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

public class Output {
    private Vector<Student> vector;
    private FileOutputStream fos;

    public Output(Vector<Student> vector) {
        this.vector = vector;
        try {
            this.fos = new FileOutputStream("C:/temp/result.txt", true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void output() {
        this.printLabel();
        try {
            for(Student s : this.vector) {
                fos.write(s.toString().getBytes("UTF-8"));
                fos.write(10);
                fos.flush();
                System.out.println("File Save Successed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void printLabel() {
        try {
            fos.write("            <<쌍용고등학교 성적관리프로그램>>".getBytes("UTF-8"));
            fos.write(10);
            fos.write("학번    이름    국어    영어    수학   총점   평균    평점".getBytes("UTF-8"));
            fos.write(10);
            fos.write("----------------------------------------------------------".getBytes("UTF-8"));
            fos.write(10);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
