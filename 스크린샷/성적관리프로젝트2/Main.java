
public class Main {
	public static void main(String[] args) {
//		Student chulsu = new Student();
//		chulsu.input();
//		chulsu.calc();
//		chulsu.output();
//		Student younghee = new Student();
//		younghee.input();
//		younghee.calc();
//		younghee.output();
		Student [] array = new Student[3];
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = new Student();
			array[i].input();
			array[i].calc();
			array[i].output();
		}
	}
}





