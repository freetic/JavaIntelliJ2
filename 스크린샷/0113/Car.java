
public class Car {
	String name;
	int price;
	String maker;
	void go(int speed){
		if(speed > 0) 
			System.out.println(speed + "�ӵ��� �����մϴ�.");
		else if(speed == 0)  stop(); 
		else if(speed < 0) 
			System.out.println(speed + "�ӵ���  �����մϴ�.");
	}
	void stop(){
		System.out.println("���� �����ϰ� �ֽ��ϴ�.");
	}
}
