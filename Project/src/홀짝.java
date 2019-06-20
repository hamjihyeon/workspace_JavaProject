import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 홀짝 {

	private static int computer;

	public static void main(String[] args) {

		JFrame frame = new JFrame("홀짝게임");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));

		JLabel Jl = new JLabel("\t 은 홀수일까요 짝수일까요?");

		Random random = new Random();
		computer = random.nextInt(10000);
		Jl.setText(computer + Jl.getText());

		ImageIcon 홀수 = new ImageIcon("src/image/홀수.png");
		ImageIcon 짝수 = new ImageIcon("src/image/짝수.png");

		JButton imageButton = new JButton(홀수);
		JButton imageButton1 = new JButton(짝수);

		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (computer % 2 == 0) { //짝수
					if (e.getSource() == imageButton) {
						Jl.setText("오답입니다");
					} else if (e.getSource() == imageButton1) {
						Jl.setText("정답입니다");
					}
				} else {	//홀수
					if (e.getSource() == imageButton) {
						Jl.setText("정답입니다");
					} else if (e.getSource() == imageButton1) {
						Jl.setText("오답입니다");
					}
				}
			}
		};

		imageButton.addActionListener(al);
		imageButton1.addActionListener(al);

		panel.add(imageButton);
		panel.add(imageButton1);
		panel.add(Jl);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
