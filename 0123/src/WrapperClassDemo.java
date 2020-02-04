import java.util.Stack;

public class WrapperClassDemo {
    public static void main(String[] args) {
//        Test<Integer> t = new Test<Integer>(5);
//        int age = 24;       // 나는 현재 stack에 있음.
//        Test<String> t1 = new Test<String>("Hello");
//        System.out.println(t1.getValue());
        Stack<String> stack = new Stack<String>();
        Stack<Object> obj = new Stack<Object>();
        Stack<Integer> in = new Stack<Integer>();
        Stack<? extends Number> wild = in;
//        Object o = new String();
//        obj = stack;
    }
}
