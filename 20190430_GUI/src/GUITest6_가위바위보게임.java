import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest6_가위바위보게임 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("가위바위보 게임");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
	
		//Component 만들자
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon("");
		JLabel computerlabel = new JLabel(computerImage);
		
		ImageIcon scissorsImage = new ImageIcon("");
		JButton scissorsButon = new JButton(scissorsImage);
		ImageIcon rockImage = new ImageIcon("");
		JButton rockButon = new JButton(rockImage);
		ImageIcon paperImage = new ImageIcon("");
		JButton paperButon = new JButton(paperImage);
		
		panel.add(result);
		panel.add(computerlabel);
		panel.add(scissorsButon);
		panel.add(rockButon);
		panel.add(paperButon);
		frame.add(panel); 
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
