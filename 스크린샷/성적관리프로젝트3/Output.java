
public class Output {
	public void output(Student s) {
		this.printLabel();
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\n",
				s.getHakbun(), s.getName(), s.getKor(), s.getEng()
				, s.getMat(), s.getTot(), s.getAvg(), s.getGrade());
	}
	private void printLabel() {
		System.out.println("            <<�ֿ����б� �����������α׷�>>");
		System.out.println("�й�    �̸�    ����    ����    ����   ����   ���    ����");
		System.out.println("------------------------------------------------");
	}
}
