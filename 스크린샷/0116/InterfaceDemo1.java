//7. interface는 다중상속이 가능하며, 각 interface는 comma로 구별한다.
//8. interface형 참조변수는 해당 interface의 메소드에만 접근할 수 있다.
//9. interface의 상수는 static이기 때문에 interface이름으로 접근해서 이름 충돌이 발생하지 않는다.
//10. interface형으로 배열을 만들 수 있는데, 이는 interface형의 자식객체를 저장하기 위한 배열이다.
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
		System.out.println("아버지의 돈 = " + Father.MONEY);
		System.out.println("어머니의 돈 = " + Mother.MONEY);
		
		Mother [] array = new Mother[3];
		array[0] = new InterfaceDemo1();   array[0].mother();
	}
}
