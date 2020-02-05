
public class MethodDemo1 {
	public static void main(String[] args) {
		MethodDemo1  md = new MethodDemo1();
		double result = md.print(72.6);   //Call by Value
		System.out.println(result);
	}
//	//Method의 필수 구성요소
//	void print(double weight) {  //Method's Header
//		System.out.println("귀하의 몸무게는 " + weight + "이군요.");   //Method's body
//	};
	double print(double weight) {
		return (int)(weight * weight);
	}
	
	
	
}
