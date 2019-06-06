import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MovingDisk extends JPanel implements ActionListener {
	private int time;
	private int days;
	private Color skycolor;
	int rval;
	int gval;
	int bval;
	public MovingDisk() {
		time = 0;
		Timer clock = new Timer(30, this);
		clock.start();
		
		//System.out.println(days);
	}

	public void paintComponent(Graphics g) {
		int x = 150 - (int) (100 * Math.cos(0.005 * Math.PI * time));
		int y = 150 - (int) (75 * Math.sin(0.005 * Math.PI * time));
		int r = 20;

		
		Color sky;
		if (y > 130)
			sky = Color.BLACK;
		else 
			sky = Color.CYAN;
			   setBackground(sky);
			    super.paintComponent(g);
				g.setColor(Color.ORANGE);
				g.fillOval(x - r, y - r, 2 * r, 2 * r);	
			
		

		g.setColor(Color.GREEN);

		g.fillOval(140, 140, 20, 20);

		g.setColor(Color.WHITE);

		// g.fillOval(140, 20, 25 , 25);
		// g.fillOval(155, 20, 25 , 25);
		// g.fillOval(135, 35, 25 , 25);
		// g.fillOval(135, 40, 25 , 25);

		
		g.fillArc(180, 180, 40, 40, 90, (days/4 * 360));
	}

	public void actionPerformed(ActionEvent e) {
		time++;
		repaint();
		if (time == 400) {
			days++;
			time = 0;
			System.out.println(days);
		}
		//System.out.println(time);
		System.out.println(Window.WIDTH);
	}
	

	public int getMid(int width) {

		return (Window.WIDTH / 2) - width / 2;
	}
		

	public int getoMid(int height) {

		return (Window.HEIGHT / 2) - height / 2;
	}

	public static void main(String[] args) {

		JFrame window = new JFrame("Moving Disk");
		window.setBounds(300, 300, 300, 300);
		MovingDisk a = new MovingDisk();
		// w.setSize(300, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = window.getContentPane();
		c.add(a);
		window.setResizable(false);
		window.setVisible(true);
	}
}
