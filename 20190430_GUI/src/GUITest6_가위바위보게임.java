import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest6_가위바위보게임 {

	static String[] filename = {"src/images/scissors.png", "src/images/rock.png", "src/images/paper.png"};
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("가위바위보 게임");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
	
		//Component 만들자
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(filename[1]);
		JLabel computerlabel = new JLabel(computerImage);		//컴퓨터 패의 버튼
		
		ImageIcon scissorsImage = new ImageIcon(filename[0]);
		JButton scissorsButon = new JButton(scissorsImage);		//가위 버튼
		ImageIcon rockImage = new ImageIcon(filename[1]);
		JButton rockButon = new JButton(rockImage);				//바위 버튼
		ImageIcon paperImage = new ImageIcon(filename[2]);
		JButton paperButon = new JButton(paperImage);			//보 버튼
		
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
