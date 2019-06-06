	import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
	
	public class WalkerTest extends JPanel {
		private Image shoe1;
		private Image shoe2;
	
		// Constructor
		public WalkerTest() {
			shoe1 = (new ImageIcon("leftshoe.gif")).getImage();
			shoe2 = (new ImageIcon("rightshoe.gif")).getImage();
		}
	
		// Called automatically when the panel needs repainting
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
	
			int x = 300;
			int y = 100;
			int stepLength = 100;
			Walker walker = new Walker(x, y, shoe1, shoe2);
	
			/* part one
			 * 
			 * for (int i = 1; i <= 4; i++) {
			 * 
			 * walker.firstStep();
			 * 
			 * walker.stop();
			 * 
			 * walker.draw(g); }
			 * 
			 */
	
			// part 2
	
			walker.firstStep();
	
			walker.stop();
	
			walker.draw(g);
			walker.firstStep();
	
			walker.stop();
	
			walker.draw(g);
			walker.firstStep();
	
			walker.stop();
	
			walker.firstStep();
	
			walker.stop();
	
			walker.draw(g);
	
			/*
			 * walker.draw(g);
			 * 
			 * walker.firstStep();
			 * 
			 * walker.stop(); walker.draw(g); walker.firstStep(); walker.nextStep();
			 * walker.stop(); walker.draw(g);
			 */
			// Draw a cursor at the expected center of the first "shoe":
			g.drawLine(x - 50, y, x + 50, y);
			g.drawLine(x, y - 50, x, y + 50);
		}
	
		public static void main(String[] args) {
			JFrame window = new JFrame("Feet");
			window.setBounds(100, 100, 500, 480);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
			WalkerTest panel = new WalkerTest();
			panel.setBackground(Color.WHITE);
			Container c = window.getContentPane();
			c.add(panel);
	
			window.setVisible(true);
		}
		
		
		/*
		 * • Which class is Foot a subclass of?
		 * Foot is a subclass of the class JPanel . 
• Does class Walker encapsulate functionality? If so, what does it encapsulate?
		 * 
		 * Yes, it encapsulates functionality since it can be invoked by other classes. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}