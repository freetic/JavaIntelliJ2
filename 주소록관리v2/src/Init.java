import java.io.*;
import java.util.ArrayList;

public class Init {
    private ObjectInputStream ois;

    public Init(String path){
        File file = new File(path);
        try {
            if(file.exists()){  // 파일이 있다면 역직렬화 수행, 이미 한번 이상 사용했다면
                this.ois = new ObjectInputStream(new FileInputStream(file));
            } else {            // 파일이 없다면, 프로그램을 처음 사용함.
                file.createNewFile();
                this.ois = null;
            }
        }catch(EOFException e){ // 역직렬화 시, 데이터가 없다면 null / -1이 아니라, EOF 발생
            this.ois = null;
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
    public ArrayList<Person> init(){
        ArrayList<Person> list = null;
        try {
            if(this.ois != null) {
                list = (ArrayList<Person>) this.ois.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(list == null) list = new ArrayList<Person>();
        return list;
    }
}
