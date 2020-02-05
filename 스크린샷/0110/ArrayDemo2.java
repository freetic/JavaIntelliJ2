/*
 * 2차원 배열
 * 1)Rectangular Array
 * 2)Ragged(Jagged) Array
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		//1. 첫번째 방법 : 선언 -> 생성 -> 할당
		//int [][] array;   //선언
		//array = new int[3][4];   //생성
		//array[0][0] = 4;   array[0][1] = 5;
		//2. 두번째 방법 : 선언 -> 생성 및 할당
		//int [] array [] ;
		//array = new int[][] {
		//								{1,2,3,4}, 
		//								{5,6,7,8}, 
		//								{9, 10,11,12}
		//							  };
		//3. 세번째 방법 : 초기화
//		int array [][] = {
//									{1,2,3,4}, 
//									{5,6,7,8}, 
//									{9, 10,11,12}
//		                        };
		//가변배열
		//1. 첫번째 방법 : 선언 -> 생성 -> 할당
//		int [][] array;  //선언
//		array = new int[3][];   //전체배열생성
//		array[0] = new int[4];
//		array[1] = new int[5];
//		array[2] = new int[2];  //각 층 배열 생성
//		array[0][0] = 4;   array[0][1] = 5;   //할당
		//2. 두번째 방법 : 선언 -> 생성 및 할당
		/*
		 * int [][] array; //선언 array = new int[3][]; array[0] = new int[] {1,2,3,4};
		 * array[1] = new int[] {5,6,7,8,9}; array[2] = new int[] {10,11};
		 */
		//3. 세번째 방법 : 초기화
//		int [][] array = {
//			{1,2,3,4},
//			{5,6,7,8,9},
//			{10,11}
//		};
		
		int [][] array = new int[][] {
			{1,2,3},
			{4,5,6,5,6,7,8}
		};
//		System.out.println("층수 = " + array.length);
//		System.out.println("열수 = " + array[0].length);
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				System.out.printf("array[%d][%d] = %d\t", i, j, array[i][j]);
			}
			System.out.println();
		}
		
		
	}
}



