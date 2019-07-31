package ThreadEx;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyDialog extends JDialog{
	JTextField tf = new JTextField(10);
	JButton okButton = new JButton("OK");
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

}
