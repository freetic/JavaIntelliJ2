import java.util.Date;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class MapDemo {
	public static void main(String[] args) {
		Date now = new Date();  //���� ��¥ �ð�.
		String str = now.toString();    //Thu Jan 23 16:09:28 KST 2020
		//Tokenizing
		StringTokenizer st = new StringTokenizer(str);
		//System.out.println(st.countTokens());
		String [] array = new String[st.countTokens()];
		int i = 0;
		while(st.hasMoreTokens()) {
			array[i] = st.nextToken();
			i++;
		}
		System.out.println("������ " + array[5] + "�� " + getMonth(array[1]) + "�� " + array[2] + "���Դϴ�.");
	}
	static int getMonth(String month) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Jan", 1);   ht.put("Feb", 2);    ht.put("Mar", 3);  ht.put("Apr", 4);
		ht.put("May", 5);   ht.put("Jun", 6);    ht.put("Jul", 7);  ht.put("Aug", 8);
		ht.put("Sep", 9);   ht.put("Oct", 10);    ht.put("Nov", 11);  ht.put("Dec", 12);
		return ht.get(month);
	}
}
