import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        TreeSet<String> tree = new TreeSet<>();
        String[] array = {"한지민", "김지민", "박지민", "김지민", "한지민"};
        for(String str : array){
            hash.add(str);
            tree.add(str);
        }
        System.out.println(hash);
        System.out.println(tree);
    }
}
