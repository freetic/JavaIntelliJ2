//Reference Variable
public class ArrayDemo3 {
	public static void main(String[] args) {
//		Car sonata = new Car();  
//		sonata.name = "Sonata";   sonata.price = 25_000_000;
//		Car carnival = new Car();
//		carnival.name = "Carnival";   carnival.price = 30_000_000;
		
		/*
		 * Car [] array; //���� array = new Car[2]; //���� array[0] = new Car();
		 * array[0].name = "Sonata"; array[0].price = 25_000_000; array[1] = new Car();
		 * array[1].name = "Carnival"; array[1].price = 30_000_000; for(int i = 0 ; i <
		 * array.length ; i++) { System.out.printf("�̸� = %s, ���� = %d\n", array[i].name,
		 * array[i].price); }
		 */
		Student [] array;   //����
		//array = new int[] {4,5};
		array = new Student[] {  new Student(), new Student()}; 
		array[0].name = "������";     array[1].name = "������";
		array[0].address = "����� ������ ���ﵿ"; 
		array[1].address = "�λ�� �ؿ�뱸 �ؿ�뵿";
		for(Student s : array ) {
			System.out.println(s.name);
			System.out.println(s.address);
			System.out.println("---------------------");
		}
	}
}
class Student{
	String name, address;
}
/*
 * class Car{ String name; int price; }
 */