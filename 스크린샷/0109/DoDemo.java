import java.util.Scanner;

public class DoDemo {
	public static void main(String[] args) {
		//for(int i = 1 ; i<= 5; i++) System.out.printf("%d\t", i);
//		int i = 10 ;
//		do{
//			System.out.printf("%d\t", i);
//			i++;
//		} while(i <= 5);
		//1부터 10까지 서로 다른 3 개의 수 뽑아내기
//		int rand, rand1, rand2;
//		do {
//			rand = (int)(Math.random() * 6 + 1);
//			rand1 = (int)(Math.random() * 6 + 1);
//			rand2 = (int)(Math.random() * 6 + 1);
//		}while((rand == rand1) || (rand == rand2) || (rand1 == rand2));
//		System.out.printf("%d, %d, %d\n", rand, rand1, rand2);
		
		//do~while을 이용한 구구단
//		int i = 1;
//		do {
//			int j = 2;
//			do {
//				System.out.printf("%d x %d = %d\t", j, i, j * i);
//				j++;
//			}while(j < 10);
//			System.out.println();
//			i++;
//		}while(i < 10);
		
		Scanner scan = new Scanner(System.in);
		/*
		 * String firstStr, secondStr; int first, second; firstStr = scan.next(); first
		 * = Integer.parseInt(firstStr); secondStr = scan.next(); second =
		 * Integer.parseInt(secondStr); int sum = 0; int i = ++first; //초기식 while(i <
		 * second) { sum += i; i++; } System.out.println(first + " ~ " + --second +
		 * " = " + sum);
		 */
		int num, max = 0, min = 0;
		while((num = scan.nextInt()) != 0){
			if(max < num) max = num;
			if(min > num)  min = num;
		}
		System.out.println("가장 큰 값 = " + max);
		System.out.println("가장 작은 값 = " + min);
		
		
		
	}
}
