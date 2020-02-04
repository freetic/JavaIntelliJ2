import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo1 {
    public static void main(String[] args) {
//        String path = "0131/src/FileDemo.java";
//        File file = new File(path);
//        System.out.println(file.lastModified());
//
//        String pattern = "yyyy-MM-dd hh:mm aa";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//
//        Date lastModifiedDate = new Date(file.lastModified());
//        System.out.println(simpleDateFormat.format(lastModifiedDate));

//        String pattern = "지금은 yyyy년 MM월 dd일 aa hh시 mm분 ss초 입니다.";
//        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//        System.out.println(sdf.format(new Date()));

        String path = "C:/";
        File fileObj = new File(path);
        File[] array = fileObj.listFiles();
        for(File f : array){
            long last = f.lastModified();
            String pattern = "yyyy-MM-dd\taa hh:mm\t";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            System.out.print(sdf.format(new Date(last)));
            if(f.isDirectory()) System.out.print("<DIR>\t\t");
            else if(f.isFile()) System.out.printf("%,d\t", f.length());
            System.out.println(f.getName());
        }
    }
}
