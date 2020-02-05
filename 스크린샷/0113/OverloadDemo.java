//Method's signature
//1. 이름    2. Method의 파라미터의 타입
public class OverloadDemo {
	public static void main(String[] args) {
		print();
		print(5);
		print(5, 9);
		print('A');
	}
	static void print(){  System.out.println("Hello, World");}
	static void print(int  a){ System.out.println("a = " + a);}
	static void print(int a, int b){  System.out.println("a = " + a + ", b = " + b);}
	static void print(char a){ System.out.println("a = " + a); }
}
