/*
 * static ���� : ��������
 * class ����
 */
public class StaticVariableDemo {
	static int age = 24;   //static variable
	public static void main(String[] args) {
		System.out.println("age = " + Car.age);
	}
}
class Car{
	static int age = 44;
}
class Student{
	static int age = 64;
}