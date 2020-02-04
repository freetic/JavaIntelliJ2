import java.util.Date;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class MapDemo {
    public static void main(String[] args) {
        Date now = new Date();  // 현재 날짜 시간.
        String str = now.toString();    //Thu Jan 23 16:09:28 KST 2020
        // Tokenizing
        StringTokenizer strs = new StringTokenizer(str, " ");
        System.out.println(strs.countTokens());
        String[] array = new String[strs.countTokens()];
        int count = 0;
        while(strs.hasMoreTokens()){
            array[count++] = strs.nextToken();
        }
        int month = getMonth(array[1]);
        System.out.println("오늘은 " + array[5] + "년 "+
                month + "월 " + array[2] + "일 입니다.");
    }
    static int getMonth(String month){
        String m = month.toUpperCase();
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        ht.put("JAN", 1);
        ht.put("FEB", 2);
        ht.put("MAR", 3);
        ht.put("APR", 4);
        ht.put("MAY", 5);
        ht.put("JUN", 6);
        ht.put("JUL", 7);
        ht.put("AUG", 8);
        ht.put("SEP", 9);
        ht.put("OCT", 10);
        ht.put("NOV", 11);
        ht.put("DEC", 12);
        return ht.get(m);
    }
}
