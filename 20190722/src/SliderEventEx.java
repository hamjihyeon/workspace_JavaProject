import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderEventEx extends JFrame{
	Container contentpane;
	JLabel colorLabel;
	JSlider[] sl = new JSlider [3];
	
	SliderEventEx() {
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentpane = getContentPane();
		contentpane.setLayout(new FlowLayout());
		colorLabel = new JLabel("	SLIDER EXAMPLE	");
		
		for(int i = 0; i<sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 125);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new MyChangeListener());
			contentpane.add(sl[i]);
		}
		
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(sl[0].getValue(),sl[1].getValue(), sl[2].getValue()));
		contentpane.add(colorLabel);
		setSize(300,300);
		setVisible(true);
	}
	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			colorLabel.setBackground(new Color(sl[0].getValue(), sl[1].getValue(), sl[2].getValue()));
		}
		
	}
	
	public static void main(String[] args) {
		new SliderEventEx();
	}

}
