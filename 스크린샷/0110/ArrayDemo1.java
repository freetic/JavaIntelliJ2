//java ArrayDemo1    45 + 78 = 
public class ArrayDemo1 {
	public static void main(String[] array) {
//		for(int i = 0 ; i < array.length ; i++) {
//			System.out.println("array[" + i + "] = " + array[i]);
//		}
		if(array.length != 4) {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(-1);
		}
		String firstStr = array[0];   //"45"
		int first = Integer.parseInt(firstStr);   //"45" --> 45
		String op = array[1];         //"+"
		String secondStr = array[2];  //"78"
		int second = Integer.parseInt(secondStr);   //"78" --> 78
		switch(op) {
			case "+":  
				System.out.printf("%d + %d = %d\n", first, second, (first + second));
				break;
			case "-":
				System.out.printf("%d - %d = %d\n", first, second, (first - second));
				break;
			case "x" :
				System.out.printf("%d x %d = %d\n", first, second, (first * second));
				break;
			case "/" :
				System.out.printf("%d / %d = %d\n", first, second, (first / second));
				break;
			case "%" :
				System.out.printf("%d %% %d = %d\n", first, second, (first % second));
				break;
			default : 
		}
		
	}
}
