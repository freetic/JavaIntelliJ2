import javax.swing.JOptionPane;

public class ConditionDemo {
	public static void main(String[] args) {
		String firstStr = JOptionPane.showInputDialog("ù��° ���� �Է� : ");
		int first = Integer.parseInt(firstStr);  //"7" --> 7
		String secondStr = JOptionPane.showInputDialog("�ι�° ���� �Է� : ");
		int second = Integer.parseInt(secondStr);    //"5" --> 5
		String op = JOptionPane.showInputDialog("������(+,-,x,/,%) : ");
		switch(op) {
			case "+":
			case "-":    
				JOptionPane.showMessageDialog(null, 
						first + " - " + second + " = " + (first - second));
				break;
			case "x":
			case "/":
			case "%":
			default :    JOptionPane.showMessageDialog(null, "�߸��� �������Դϴ�.");
		}
	}
}
