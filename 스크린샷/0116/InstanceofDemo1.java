
public class InstanceofDemo1 {
	public static void main(String[] args) {
		//Sonata sonata = new Sonata("���� �ҳ�Ÿ");   remake(sonata);
		//Carnival carnival = new Carnival("��� ī�Ϲ�");  remake(carnival);
		Matiz matiz = new Matiz("������ ��Ƽ��");    remake(matiz);
	}
	static void remake(Car car) {    //Polymorphic Parameter
		if(car instanceof Sonata) {
			System.out.println("�ҳ�Ÿ�� �����ƽ��ϴ�.");
		}else if(car instanceof Carnival) {
			System.out.println("ī�Ϲ��� �����ƽ��ϴ�.");
		}else if(car instanceof Matiz) {
			System.out.println("��Ƽ� �����ƽ��ϴ�.");
		}	
	}  
}
