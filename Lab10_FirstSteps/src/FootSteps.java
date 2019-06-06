import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootSteps extends JPanel
{
  private Image shoe1;
  private Image shoe2;

  // Constructor
  public FootSteps()
  {
    shoe1 = (new ImageIcon("leftshoe.gif")).getImage();
    shoe2 = (new ImageIcon("rightshoe.gif")).getImage();
    
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 300;
    int y = 100;
    int stepLength = 100;

    Foot foot1 = new Foot(x, y, shoe1);
    Foot foot2 = new Foot(x, y+50, shoe2);

    //part a:
  /*  for (int i = 1; i <= 4; i++) {
    	
    	foot1.moveForward(stepLength);
    	foot2.moveForward(stepLength);

    	foot1.draw(g);
    	foot2.draw(g);

    } */

    
    
    //part b:
	foot1.moveForward(stepLength);
	foot2.moveForward(stepLength);
	foot1.draw(g);
	foot2.draw(g);
	foot1.moveForward(stepLength);
	foot2.moveForward(stepLength);
	foot1.draw(g);
	foot2.draw(g);
	foot1.moveForward(stepLength);
	foot2.moveForward(stepLength);
	foot1.moveForward(stepLength);
	foot2.moveForward(stepLength);
	foot1.draw(g);
	foot2.draw(g);

    // Draw a cursor at the expected center of the first "shoe":
    g.drawLine(x - 50, y, x + 50, y);
    g.drawLine(x, y - 50, x, y + 50);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 800, 480);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FootSteps panel = new FootSteps();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}