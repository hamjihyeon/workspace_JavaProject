import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest12_Listeners {

	public static void main(String[] args) {

		JFrame frame = new JFrame("업앤다운업앤다운");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(400, 600));
		
		JPanel panel = new JPanel();
		JTextField tfInput = new JTextField(10);
		JTextField tfInput2 = new JTextField(20);
		JLabel lbOutput = new JLabel("쳐 엔터!");
		
		tfInput.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				lbOutput.setText(tfInput.getText()+" 흠뻑쇼!!!!");	
			}
		});
		tfInput.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				lbOutput.setText("다시돌아와ㅠㅠ");
			}
			@Override
			public void focusGained(FocusEvent e) {
				lbOutput.setText("나만바라봐 0.0");
			}
		});
		
		
		panel.add(tfInput);
		panel.add(tfInput2);
		panel.add(lbOutput);
		frame.add(panel); 
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
