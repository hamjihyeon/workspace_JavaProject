import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_TextField {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(800, 300);
		frame.setPreferredSize(new Dimension(300, 200));//선호하는 사이즈

		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID");
		label.setText("ID");

		
		JTextField tf  = new JTextField("아이디를 입력하세요");
		tf.setSize(100, 20);
		tf.setText("");
		
		panel.add(label);
		panel.add(tf);	
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
