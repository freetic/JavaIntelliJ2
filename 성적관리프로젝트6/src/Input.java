import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Input {
//    private Scanner scan;
    private Vector<Student> vector;
    private FileInputStream fis;
    public Input(Vector<Student> vector) {   //Constructor
//        this.scan = new Scanner(System.in);
        this.vector = vector;
        try {
            this.fis = new FileInputStream("C:/temp/sungjuk.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void input() {
//        String y_n = null;
//        do {
//            System.out.print("학번 : ");  String hakbun = scan.next();
//            System.out.print("이름 : ");  String name = scan.next();
//            System.out.print("국어 : ");  int kor = scan.nextInt();
//            System.out.print("영어 : ");  int eng = scan.nextInt();
//            System.out.print("수학 : ");  int mat = scan.nextInt();
//            Student s = new Student(hakbun, name, kor, eng, mat);
//            this.vector.add(s);
//            System.out.print("Again(y/n) ? : ");
//            y_n = this.scan.next();
//        }while(y_n.toUpperCase().equals("Y"));
        try {
            byte[] buffer = new byte[this.fis.available()];
            int number = fis.read(buffer);
//            String data = new String(buffer, 0, number);
            String data = new String(buffer, 0, number);
//            Scanner sc = new Scanner(data).useDelimiter("\n");
            StringTokenizer st = new StringTokenizer(data, "\n");
            while(st.hasMoreTokens()){
                Scanner sc2 = new Scanner(st.nextToken()).useDelimiter("\\s+");
                vector.addElement(new Student(sc2.next(), sc2.next(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}