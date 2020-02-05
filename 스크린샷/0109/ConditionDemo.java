import javax.swing.JOptionPane;

public class ConditionDemo {
	public static void main(String[] args) {
		String firstStr = JOptionPane.showInputDialog("첫번째 숫자 입력 : ");
		int first = Integer.parseInt(firstStr);  //"7" --> 7
		String secondStr = JOptionPane.showInputDialog("두번째 숫자 입력 : ");
		int second = Integer.parseInt(secondStr);    //"5" --> 5
		String op = JOptionPane.showInputDialog("연산자(+,-,x,/,%) : ");
		switch(op) {
			case "+":
			case "-":    
				JOptionPane.showMessageDialog(null, 
						first + " - " + second + " = " + (first - second));
				break;
			case "x":
			case "/":
			case "%":
			default :    JOptionPane.showMessageDialog(null, "잘못된 연산자입니다.");
		}
	}
}
