
public class Main2 {
	public static void main(String[] args) {
		Comparable sonata = new Car("�ҳ�Ÿ", 25_000_000);
		Comparable carnival = new Car("ī�Ϲ�", 35_000_000);
		Comparable matiz = new Car("��Ƽ��", 15_000_000);
		Comparable [] array = {sonata, carnival, matiz};
		for(int i = 0 ; i < array.length - 1 ; i++) {
			for(int j = 0 ; j < array.length - 1 ; j++) {
				if(array[j].compareTo(array[j+1]) > 0) {
					Car temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(Car car:array) System.out.println(car);
	}
}
