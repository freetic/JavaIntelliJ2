/*
 * 2���� �迭
 * 1)Rectangular Array
 * 2)Ragged(Jagged) Array
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		//1. ù��° ��� : ���� -> ���� -> �Ҵ�
		//int [][] array;   //����
		//array = new int[3][4];   //����
		//array[0][0] = 4;   array[0][1] = 5;
		//2. �ι�° ��� : ���� -> ���� �� �Ҵ�
		//int [] array [] ;
		//array = new int[][] {
		//								{1,2,3,4}, 
		//								{5,6,7,8}, 
		//								{9, 10,11,12}
		//							  };
		//3. ����° ��� : �ʱ�ȭ
//		int array [][] = {
//									{1,2,3,4}, 
//									{5,6,7,8}, 
//									{9, 10,11,12}
//		                        };
		//�����迭
		//1. ù��° ��� : ���� -> ���� -> �Ҵ�
//		int [][] array;  //����
//		array = new int[3][];   //��ü�迭����
//		array[0] = new int[4];
//		array[1] = new int[5];
//		array[2] = new int[2];  //�� �� �迭 ����
//		array[0][0] = 4;   array[0][1] = 5;   //�Ҵ�
		//2. �ι�° ��� : ���� -> ���� �� �Ҵ�
		/*
		 * int [][] array; //���� array = new int[3][]; array[0] = new int[] {1,2,3,4};
		 * array[1] = new int[] {5,6,7,8,9}; array[2] = new int[] {10,11};
		 */
		//3. ����° ��� : �ʱ�ȭ
//		int [][] array = {
//			{1,2,3,4},
//			{5,6,7,8,9},
//			{10,11}
//		};
		
		int [][] array = new int[][] {
			{1,2,3},
			{4,5,6,5,6,7,8}
		};
//		System.out.println("���� = " + array.length);
//		System.out.println("���� = " + array[0].length);
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				System.out.printf("array[%d][%d] = %d\t", i, j, array[i][j]);
			}
			System.out.println();
		}
		
		
	}
}



