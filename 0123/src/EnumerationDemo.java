import java.util.*;

public class EnumerationDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] array = {"한지민", "김지민", "박지민", "김지민", "한지민", "김신조"};
        for(String str : array) stack.push(str);
        Enumeration<String> enums = stack.elements();
        while(enums.hasMoreElements()) System.out.println(enums.nextElement());
        System.out.println();

        Queue<String> queue = new LinkedList<>();
        for(String str : array) queue.offer(str);
        Iterator<String> iters = queue.iterator();
        while(iters.hasNext()) System.out.println(iters.next());
   }
}
