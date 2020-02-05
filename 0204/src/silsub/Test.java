package silsub;

import java.util.StringTokenizer;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        String a = "abc.d.ef.efg.hij";
        StringTokenizer st = new StringTokenizer(a, ".");
        Vector<String> vector = new Vector<>();
        while(st.hasMoreTokens()){
            vector.add(st.nextToken());
//            System.out.println(st.nextToken());
        }
        for(int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(vector.size()-1));
        }
    }
}
