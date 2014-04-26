package graficosAnimados;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Pelota extends JPanel {
	
	int x = getWidth()/2;
	int y = getHeight()/2;
	 
	
	void moveBall() {
		x = x + 1;
		y = y + 1;
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
	}
	

	
	public static void main(String[] args) throws InterruptedException {
		//
		JFrame frame = new JFrame("Juego");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		
		Pelota pelota1 = new Pelota();
		frame.add(pelota1);
		
		System.out.println();
		while (true) {
			//System.out.println("x:" + pelota1.x + " y:" + pelota1.y);
			pelota1.moveBall();
			pelota1.repaint();
			Thread.sleep(10);
		}
	}





}
