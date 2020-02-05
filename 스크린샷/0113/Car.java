
public class Car {
	String name;
	int price;
	String maker;
	void go(int speed){
		if(speed > 0) 
			System.out.println(speed + "속도로 전진합니다.");
		else if(speed == 0)  stop(); 
		else if(speed < 0) 
			System.out.println(speed + "속도로  후진합니다.");
	}
	void stop(){
		System.out.println("현재 정지하고 있습니다.");
	}
}
