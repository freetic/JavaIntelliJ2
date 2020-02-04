import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.Vector;

public class Input {
//    private Scanner scan;
    private Vector<Student> vector;
//    private FileInputStream fis;
    private Scanner scan;
    public Input(Vector<Student> vector) {   //Constructor
//        this.scan = new Scanner(System.in);
        this.vector = vector;
//        try {
//            this.fis = new FileInputStream("C:/temp/sungjuk.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        this.scan = new Scanner(System.in);

    }

    public void input() {
        String y_n = null;
        do {
            System.out.println("<<" + (this.vector.size()+1) + "번째 학생 입력>>");
            System.out.print("학번 : ");  String hakbun = scan.next();
            System.out.print("이름 : ");  String name = scan.next();
            System.out.print("국어 : ");  int kor = scan.nextInt();
            System.out.print("영어 : ");  int eng = scan.nextInt();
            System.out.print("수학 : ");  int mat = scan.nextInt();
            Student s = new Student(hakbun, name, kor, eng, mat);
            this.vector.add(s);
            System.out.print("Again(y/n) ? : ");
            y_n = this.scan.next();
        }while(y_n.toUpperCase().equals("Y"));


//        try {
//            byte[] buffer = new byte[this.fis.available()];
//            int number = fis.read(buffer);
////            String data = new String(buffer, 0, number);
//            String data = new String(buffer, 0, number);
////            Scanner sc = new Scanner(data).useDelimiter("\n");
//            StringTokenizer st = new StringTokenizer(data, "\n");
//            while(st.hasMoreTokens()){
//                Scanner sc2 = new Scanner(st.nextToken()).useDelimiter("\\s+");
//                vector.addElement(new Student(sc2.next(), sc2.next(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt()));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String path = "C:/temp/sungjuk_utf8.csv";
//        try {
//            RandomAccessFile raf =new RandomAccessFile(path, "rw");
//            String str = null;
//            while((str = raf.readLine()) != null) {
//                Scanner sc = new Scanner(str).useDelimiter(",");
//                vector.addElement(new Student(sc.next().trim(), CharUtility2.entoutf8(sc.next().trim()), Integer.parseInt(sc.next().trim()), Integer.parseInt(sc.next().trim()), Integer.parseInt(sc.next().trim())));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}