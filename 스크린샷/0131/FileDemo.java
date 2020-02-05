import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		//경로(path)에서 사용하는 구분자(separator)
		System.out.println(File.separator);
		//%PATH% or %CLASSPATH%에서 사용하는 구분자(pathSepator)
		System.out.println(File.pathSeparator);
	}
}
