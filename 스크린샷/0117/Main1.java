import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main1 {
	public static void main(String[] args) {
		//Calendar�����ϱ� : ù�� ����, ������ ��
//		Calendar now;    //����Ÿ���� �θ�Ÿ��
//		now = new GregorianCalendar(2020, 0, 1);  //2020�� 1�� 1��
//		int yoil = now.get(Calendar.DAY_OF_WEEK);  
//		//1 : SUN, 2:MON, 3:TUE, 4:WED, 5:THU, 6:FRI, 7:SAT
//		//System.out.println(yoil);
//		int lastDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(lastDay);
		
		IPerson person;   //����
		person = new Student("2019-01", 90);
		print(person);
		
		person = new Employee("�ѵ�-2018-05", 280);
		print(person);
	}
	static void print(IPerson p) {
		p.printInfo();   //������
	}
}






