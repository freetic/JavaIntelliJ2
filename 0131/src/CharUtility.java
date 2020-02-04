import java.io.UnsupportedEncodingException;

public class CharUtility {
    public static String entoko(String en){
        String ko = null;
        try {
            ko = new String(en.getBytes("ISO-8859-1"), "EUC-KR");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ko;
    }
    public static String kotoen(String ko){
        String en = null;
        try {
            en = new String(ko.getBytes("EUC-KR"), "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return en;

    }
    public static String utf8toko(String utf8){
        String ko = null;
        try {
            ko = new String(utf8.getBytes("UTF-8"), "EUC-KR");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ko;
    }
    public static String kotoutf8(String ko){
        String utf8 = null;
        try {
            ko = new String(utf8.getBytes("EUC-KR"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return utf8;
    }
    public static String entoutf8(String en){
        String utf8 = null;
        try {
            utf8 = new String(utf8.getBytes("ISO8859_1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return utf8;
    }
}
