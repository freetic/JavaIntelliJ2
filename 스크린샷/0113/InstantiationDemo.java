
public class InstantiationDemo {
	public static void main(String[] args) {
		int age = 0;  //����
		Car sonata = null;  //����
		age = 24;   //�Ҵ�
		sonata = new Car();
		sonata.name = "�ҳ�Ÿ";
		sonata.price = 25_000_000;
		sonata.maker = "Hyndai";
		sonata.go(80);
		sonata.stop();
	}
}
