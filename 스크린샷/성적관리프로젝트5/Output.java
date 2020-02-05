import java.util.Vector;

public class Output {
	private Vector<Student> vector;
	
	public Output(Vector<Student> vector) {
		this.vector = vector;
	}
	
	public void output() {
		this.printLabel();
		for(Student s : this.vector) {
			System.out.println(s);
		}
	}
	private void printLabel() {
		System.out.println("            <<�ֿ����б� �����������α׷�>>");
		System.out.println("�й�    �̸�    ����    ����    ����   ����   ���    ����");
		System.out.println("------------------------------------------------");
	}
}
