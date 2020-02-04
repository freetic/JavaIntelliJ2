import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        // 경로에서 사용하는 구분자(separator)
//        System.out.println(File.separator);
        //%PATH% or %CLASSPATH%에서 사용하는 구분자(pathSeparator)
//        System.out.println(File.pathSeparator);
        System.out.println("읽고싶은 파일의 경로: ");;
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        if(file.exists()){
            System.out.println("getPath() = " + file.getPath());
            System.out.println("getAbsolutePath() = " + file.getAbsolutePath());
            System.out.println("getCanonicalPath() = " + file.getCanonicalPath());
            System.out.println("getName() = " + file.getName());
            System.out.println(file.lastModified()/1000/60/60/24);

        } else{
            System.out.println("아무것도 없잖아 이놈아~!!!");
        }

    }
}
