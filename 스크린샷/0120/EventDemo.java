import java.awt.*;
import java.awt.event.*;  //1. import �Ѵ�.

public class EventDemo {   //2. implements �Ѵ�.
	public static void main(String[] args) {
		Frame f = new Frame("���� ������ ���α׷�.");
		Button clickme = new Button("Click Me!!!");
		clickme.setBackground(Color.RED);
		clickme.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {  //3. Override�Ѵ�.
				f.setBackground(Color.CYAN);
			}
		});
		f.add(BorderLayout.NORTH, clickme);
		f.setBackground(Color.YELLOW);
		f.setSize(500, 400);
		f.setVisible(true);
	}

	
	
}
