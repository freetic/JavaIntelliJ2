//Array¿Í Method
public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		int [] array = md.makeArray();
		md.display(array);
		md.bubbleSort(array);
		md.display(array);
	}
	int [] makeArray(){
		int [] array = {4,8,1,2,6,3,9,0};
		return array;
	}
	void bubbleSort(int [] array) {
		for(int i = 0 ; i < array.length - 1 ; i++) {
			for(int j = 0 ; j < array.length - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];    array[j] = array[j+1];   array[j+1] = temp;
				}
			}
		}
	}
	void display(int [] array) {
		for(int su : array)   System.out.printf("%d\t", su);
		System.out.println();
	}
}
