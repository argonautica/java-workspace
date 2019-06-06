import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class BullsEye extends JPanel
{
	
	 public void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);  // Call JPanel's paintComponent method
	                              //   to paint the background
	    int xCenter = getWidth() / 2;
	    int yCenter = getHeight() / 2;
	    g.setColor(Color.RED);
	    g.fillOval(xCenter-45	, yCenter-45, 90, 90);


	    g.setColor(Color.WHITE);
	    g.fillOval(xCenter-30, yCenter-30	, 60, 60);
	    g.setColor(Color.RED);
	    g.fillOval(xCenter-15, yCenter-15, 30, 30);



	  }

	  public static void main(String[] args)
	  {
	    JFrame window = new JFrame("Red Cross");
	    window.setBounds(300, 300, 200, 200);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    BullsEye panel = new BullsEye();
	    panel.setBackground(Color.WHITE);
	    Container c = window.getContentPane();
	    c.add(panel);
	    window.setVisible(true);
	  }
	}

