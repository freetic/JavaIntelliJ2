import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		//length
//		int [] array = {5,6,7,8,1,2,3,4,5,6};
//		for(int i = 0 ; i < array.length ; i++) {
//			System.out.printf("array[%d] = %d\n", i, array[i]);
//		}
//		int [] array = new int[4];   //0 0 0 0 
//		array[0] = 100;   //국어
//		array[1] = 90;    //영어
//		array[2] = 75;    //수학
//		for(int i = 0 ; i < array.length - 1 ;  i++) {
//			array[3] += array[i];
//		}
		
		/*
		 * int [] original = {1,2,3,4,5,6,7,8,9}; int [] target = new int[2]; // 0 0
		 * original = target; //배열의 주소복사 System.out.println(original[0]); target[0] =
		 * 100; System.out.println(original[0]);
		 */
		
		/*
		 * int [] original = {1,2,3,4,5,6,7,8,9}; int [] target = {10,11};
		 * //System.arraycopy(target, 0, original, 5, 2); System.arraycopy(original, 3,
		 * target, 0, 4);
		 */
		
		/*
		 * Scanner scan = new Scanner(System.in); int [] array = new int[10]; for(int i
		 * = 0 ; i < array.length ; i++) { array[i] = scan.nextInt(); } //입력끝 int i = 1;
		 * //초기식 int max = array[0], min = array[0]; while(i < array.length) { //조건
		 * if(max < array[i]) max = array[i]; if(min > array[i]) min = array[i]; i++;
		 * //증감식 } System.out.println("max = " + max + ", min = " + min);
		 */
		
		/*
		 * int [] array = {6,9,2,5,1,7,2,3,5,9,3}; System.out.println("Before Sorting");
		 * for(int i = 0 ; i < array.length; i++) System.out.printf("%d\t", array[i]);
		 * System.out.println();
		 * 
		 * for(int i = 0; i < array.length - 1 ; i++) { for(int j = 0 ; j < array.length
		 * - 1 ; j++) { if(array[j] > array[j+1]) { int temp = array[j]; array[j] =
		 * array[j+1]; array[j+1] = temp; } } } System.out.println("After Sorting");
		 * for(int i = 0 ; i < array.length; i++) System.out.printf("%d\t", array[i]);
		 */
		
		//boolean array [] = {true, false ,false ,true};
		//float [] array = {3.14f, 89.5f, 78.2f};
		//int [] array = {0b101010, 0xABCD, 0123};
		/*
		 * char [] array = {'H', 'e', 'l', 'l', 'o'}; array[0] = 'C';
		 */
		//String [] array = {"Hello", "Java", "안녕하세요", "Python"};
		Scanner scan = new Scanner(System.in);
		String [] array = new String[4];   //null null null null
		System.out.print("Name : ");   array[0] = scan.nextLine();
		System.out.print("Tel : ");       array[1] = scan.nextLine();
		System.out.print("Email : ");   array[2] = scan.nextLine();
		System.out.print("Address : ");   array[3] = scan.nextLine();
		for(int i = 0 ; i < array.length ; i++) {
			System.out.printf("array[%d] = %s\n", i, array[i]);
		}
	}
}




