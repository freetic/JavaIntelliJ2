import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
        String[] array = {"한지민", "김지민", "박지민", "김지민", "한지민", "AAA"};
//        for(String str : array) queue.offer(str);
//        int size = queue.size();
//        for(int i = 0; i < size; i++){
//            System.out.println(queue.poll());
//        }
//        ArrayList<String> list = new ArrayList<>();
//        for(String str : array) list.add(str);
//        int size = list.size();
//        for(int i = 0; i < size; i++){
//            System.out.println(list.get(i));
//        }

        Vector<String> vector = new Vector<>(5, 3);
        for(String str : array){
            vector.add(str);
            System.out.print(vector.size() + "\t");
            System.out.println(vector.capacity());
        }

    }
}
