import java.awt.Color;
import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Display extends JFrame{
	
	
	public Display(){
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		
		String[] text = {"Test Leap Year", "Check if point is in rectangle", "Check if number has two ending zeroes", "Check if a date is later than another"};
		JComboBox<String> a = new JComboBox<String>(text);
a.ad
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display w = new Display();
		w.setBounds(300, 300, 400, 400);
		w.setDefaultCloseOperation(EXIT_ON_CLOSE);
		w.setVisible(true);
		
		
	}

}
