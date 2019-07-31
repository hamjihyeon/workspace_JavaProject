package ThreadEx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyModalDialog extends JDialog{
		JTextField tf = new JTextField(10);
		JButton okButton = new JButton("OK");
		
		public MyModalDialog(JFrame frame, String title) {
			super(frame, title, true);
			add(tf);
			add(okButton);
			setSize(200, 100);
			
			okButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
		}
		String getInput() {
			if(tf.getText().length() == 0) return null;
			else return tf.getText();
		}
}
