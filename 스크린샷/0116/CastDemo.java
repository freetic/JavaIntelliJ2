/*
 * ��ü�� ����ȯ
 * 1. �ڽ� --> �θ�  : �ڵ�/���� ����ȯ ��� ����, �׻� ����
 * 2. �θ� --> �ڽ� : ��������ȯ�� �����ϸ�, �׻� �������� �ʴ´�.
 */
public class CastDemo {
	public static void main(String[] args) {
		//Test t = new Test(); 
		//Demo d = new Demo();
		//t = d;
		Test t;   //����
		t = new Demo();
		
		/*
		 * Test t = new Test(); Demo d = new Demo(); //t = (Test)d; if(t instanceof
		 * Demo) { d = (Demo)t; }else { System.out.println("����ȯ �Ұ�"); }
		 */
		
	}
}
class Test{}
class Demo extends Test{}