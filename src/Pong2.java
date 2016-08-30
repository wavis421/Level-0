import javax.swing.*;
import java.awt.*;

public class Pong2 extends JPanel {
	private static final int BOX_WIDTH = 640;
	private static final int BOX_HEIGHT = 480;
	
	private int xPos = 50;
	private int yPos = 50;
	private int radius = 10;
	private int speedX = 8;
	private int speedY = 8;

	public Pong2() {
		this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));
		System.out.println("Pong2 enter constructor");
		// Start the ball bouncing (in its own thread)
		Thread gameThread = new Thread() {
			public void run() {
				while (true) { // Execute one update step
					drawBall();

					try {
						Thread.sleep(20); // milliseconds
					} catch (InterruptedException ex) {}
				}
			}
		};
		System.out.println("Pong2 constructor, ready to start");
		gameThread.start();
		System.out.println("Pong2 constructor, started thread");
	}

	/** Custom rendering codes for drawing the JPanel */
	public void paintComponent(Graphics g) {
		super.paintComponents(g); // Paint background

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, BOX_WIDTH,  BOX_HEIGHT);
		
		// Draw the ball
		g.setColor(Color.BLUE);
		g.fillOval(xPos, yPos, (2 * radius), (2 * radius));
	}

	public void drawBall() {
		xPos += speedX;
		yPos += speedY;
		if (xPos >= (BOX_WIDTH - 2*radius) || xPos <= 0)
			speedX = -speedX;
			
		if (yPos >= (BOX_HEIGHT - 2*radius) || yPos <= 0)
			speedY = -speedY;

		repaint();
	}

	public static void main(String[] args) {
		// Run GUI in the Event Dispatcher Thread (EDT) instead of main thread.
		System.out.println("Entering main");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				System.out.println("Entering run in main");
				// Set up main window (using Swing's Jframe)
				JFrame frame = new JFrame("Pong2 Game");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(BOX_WIDTH,  BOX_HEIGHT);
				frame.setContentPane(new Pong2());
				System.out.println("Done new Pong2 in main");
				frame.pack();
				frame.setVisible(true);
			}
		});
		System.out.println("Done with main");
	}
}
