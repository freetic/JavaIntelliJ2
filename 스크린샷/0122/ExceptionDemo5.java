
public class ExceptionDemo5 {
	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
		}catch(Exception ex) {
			System.out.println(ex);
		}finally {
			System.out.println("¿©±â");
		}
	}
}
