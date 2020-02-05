import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		TreeSet<String> tree = new TreeSet<String>();
		String [] array = {"������", "������", "������", "������", "������"};
		for(String str : array) {
			hash.add(str);     tree.add(str);
		}
		System.out.println(hash.toString());
		System.out.println(tree.toString());
		//System.out.println(hash.size());
		//System.out.println(tree.size());
	}
}
