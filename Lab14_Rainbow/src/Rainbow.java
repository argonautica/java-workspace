
// ________________________________________________

import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel {
	// Declare skyColor:
	// ________________________________________________

	private static final Color skyColor = Color.CYAN;

	public Rainbow() {
		setBackground(skyColor);
	}

	// Draws the rainbow.
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();


		g.setColor(Color.RED); // draw arcs
		g.fillArc(50, 50, SolveW(50), SolveH(50), 0, 180);
		g.setColor(Color.YELLOW);
		g.fillArc(60, 60, SolveW(60), SolveH(60), 0, 180);
		g.setColor(Color.ORANGE);
		g.fillArc(70, 70, SolveW(70), SolveH(70), 0, 180);
		g.setColor(Color.GREEN);
		g.fillArc(80, 80, SolveW(80), SolveH(80), 0, 180);
		g.setColor(Color.BLUE);
		g.fillArc(90, 90, SolveW(90), SolveH(90), 0, 180);
		g.setColor(Color.PINK);
		g.fillArc(100, 100, SolveW(100), SolveH(100), 0, 180);
		g.setColor(Color.MAGENTA);
		g.fillArc(110, 110, SolveW(110), SolveH(110), 0, 180);
		g.setColor(Color.WHITE);
		g.fillArc(120, 120, SolveW(120), SolveH(120), 0, 180);
		g.setColor(Color.CYAN);
		g.fillArc(130, 130, SolveW(130), SolveH(130), 0, 180);
		g.setColor(Color.GREEN);
		g.fill3DRect(0, getHeight() - (getHeight() / 10), getWidth(), (getHeight() / 5) * 2, true);
		g.setColor(Color.YELLOW);

	}

	public int SolveW(int x) {// solves for the width given the x coordinate

		int res = getWidth() - (x * 2);
		return res;
	}

	public int SolveH(int x) {// solves for the height given the y coordinate

		int res = getHeight() * 2 - (x * 2);
		return res;

	}

	public static void main(String[] args) {
		JFrame w = new JFrame("Rainbow");
		w.setBounds(300, 300, 335, 200);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(new Rainbow());
		w.setVisible(true);
	}
}
