//7. interface�� ���߻���� �����ϸ�, �� interface�� comma�� �����Ѵ�.
//8. interface�� ���������� �ش� interface�� �޼ҵ忡�� ������ �� �ִ�.
//9. interface�� ����� static�̱� ������ interface�̸����� �����ؼ� �̸� �浹�� �߻����� �ʴ´�.
//10. interface������ �迭�� ���� �� �ִµ�, �̴� interface���� �ڽİ�ü�� �����ϱ� ���� �迭�̴�.
public class InterfaceDemo1 implements Father, Mother{
	public void father() {  System.out.println("called by father()");}
	public void mother() {  System.out.println("called by mother()");}
	public void grandFather() {  System.out.println("called by grandFather()");}
	public void grandMother() {  System.out.println("called by grandMother()");}
	public static void main(String[] args) {
		GrandFather grandFather = new InterfaceDemo1();
		grandFather.grandFather();
		GrandMother grandMother = new InterfaceDemo1();   
		grandMother.grandMother();
		Father father = new InterfaceDemo1();  
		father.father();   //father.grandFather();   father.grandMother();
		System.out.println("�ƹ����� �� = " + Father.MONEY);
		System.out.println("��Ӵ��� �� = " + Mother.MONEY);
		
		Mother [] array = new Mother[3];
		array[0] = new InterfaceDemo1();   array[0].mother();
	}
}
