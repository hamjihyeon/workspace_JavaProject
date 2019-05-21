import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUITest5_ImageIcon {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
	
		//ImageIcon, JLabel
		ImageIcon kirby = new ImageIcon("src/images/kirby.jpg");
		JLabel imageLabel = new JLabel(kirby);
		
		//ImageIcon, JButton
		ImageIcon pika = new ImageIcon("src/images/pika.jpg");
		//ImageIcon 크기 수정
		ImageIcon smallPika = new ImageIcon(pika.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		JButton imageButton = new JButton(smallPika);
		
		
		panel.add(imageLabel);
		panel.add(imageButton);
		frame.add(panel); 
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
