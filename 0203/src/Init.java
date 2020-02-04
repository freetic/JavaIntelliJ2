/**
 * 프로그램이 처음 실행되면 C:/temp/sungjuklist.ser 파일이 없기 때문에 새 파일 생성.
 * 만일 있다면 EOFException이 발생
 */
/**
 * 직렬화에서 EOFException이 발생하는 이유는 객체가 없을 때 null이나 -1을 return하지 않고
 * 직렬화에서는 EOFexception을 발생한다.
 * 처리 방법 : 1) writeOjbect()를 먼저 하거나
 *              2) writeObject()의 제일 마지막에 null을 하거나
 *              3) EOFException을 발생시킨다.
 */

import java.io.*;
import java.util.Vector;

public class Init {
    private ObjectInputStream ois;

    public Init(String path) {
        File file = new File(path);
        try {
            if(file.exists()){  // 해당 파일이 있다면 -> 한번이라도 이전에 프로그램을 실행했다면
                this.ois = new ObjectInputStream(new FileInputStream(file));
            } else{             // 파일이 없다면 -> 처음으로 프로그램을 실행했다면
                file.createNewFile();
            }
        } catch(EOFException e){ // 파일은 있지만 비어있다면
            this.ois = null;
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public Vector<Student> init(){
        Object obj = null;
        try {
            if(this.ois != null)
                obj = this.ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(ois != null && obj != null){
            return (Vector<Student>)obj;
        }else{
            return null;
        }
    }
}
