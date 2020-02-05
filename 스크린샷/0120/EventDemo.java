import java.awt.*;
import java.awt.event.*;  //1. import 한다.

public class EventDemo {   //2. implements 한다.
	public static void main(String[] args) {
		Frame f = new Frame("나는 윈도우 프로그램.");
		Button clickme = new Button("Click Me!!!");
		clickme.setBackground(Color.RED);
		clickme.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {  //3. Override한다.
				f.setBackground(Color.CYAN);
			}
		});
		f.add(BorderLayout.NORTH, clickme);
		f.setBackground(Color.YELLOW);
		f.setSize(500, 400);
		f.setVisible(true);
	}

	
	
}
