
public class MethodDemo1 {
	public static void main(String[] args) {
		MethodDemo1  md = new MethodDemo1();
		double result = md.print(72.6);   //Call by Value
		System.out.println(result);
	}
//	//Method�� �ʼ� �������
//	void print(double weight) {  //Method's Header
//		System.out.println("������ �����Դ� " + weight + "�̱���.");   //Method's body
//	};
	double print(double weight) {
		return (int)(weight * weight);
	}
	
	
	
}
