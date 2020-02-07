import sun.java2d.pipe.SpanShapeRenderer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

// 날짜 받기
public class DateTimeDemo {
    public static void main(String[] args){
        // 방법 1
//        Date now = new Date();
//        System.out.println(now);
//        String pattern = "yyyy-MM-dd";

        // 방법 2
//        Calendar now = Calendar.getInstance();
//        System.out.println(now.get(Calendar.YEAR));

        // 방법 3
//        Calendar now = new GregorianCalendar(2020, 2, 7);

        // 방법 4
//        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.FRANCE);
//        System.out.println(df.format(new Date()));

        // 방법 4
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf.format(new Date()));

        // 방법 5
//        System.out.printf("지금은 %tI시 %tM분 %tS초 입니다.\n%tT", new Date(), new Date(), new Date(), new Date());
    }
}
