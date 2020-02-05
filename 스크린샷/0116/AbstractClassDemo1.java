import java.util.Calendar;
import java.util.GregorianCalendar;

public class AbstractClassDemo1 {
	public static void main(String[] args) {
//		Calendar cal;   //선언형은 부모타입
//		cal = new GregorianCalendar();  //실제형은 자식타입
		//Mammal m = new Mammal();
		Mammal [] array = new Mammal[3];
		array[0] = new Dog();
	}
}
