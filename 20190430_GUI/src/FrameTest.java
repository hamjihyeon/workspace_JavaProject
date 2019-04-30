import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창");
		JLabel label = new JLabel("레이블");
		frame.add(label);	
		frame.setPreferredSize(new Dimension(400, 100));
		frame.setLocation(200, 500);	
		frame.pack();	//window의 크기를 짜부뜨려라
		frame.setVisible(true);	//보이냐
		
		JFrame frame2 = new JFrame("창투");
		frame2.pack();
		frame2.setVisible(true);
	}
}
