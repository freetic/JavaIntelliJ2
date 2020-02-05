import java.util.Enumeration;
import java.util.Properties;

public class MapDemo1 {
	public static void main(String[] args) {
		Properties info = System.getProperties();
		Enumeration<Object> enums = info.keys();
		while(enums.hasMoreElements()) {
			String key = (String)enums.nextElement();
			System.out.println(key + " --> " + System.getProperty(key));
		}
	}
}
