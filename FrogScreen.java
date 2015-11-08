import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;




/**
 * @author Sierra
 * Builds a screen, holds most of gameplay mechanics
 *
 */
public class FrogScreen extends JPanel implements KeyListener {
	
	public static int screenWidth = 600;
	public static int screenHeight = 650;
	public static ImageIcon bgImg = new ImageIcon ("Frogger Background.png");
	public static ImageIcon carImg = new ImageIcon ("car1.png");
	public static ImageIcon truckImg = new ImageIcon ("truck1.png");
	public static ImageIcon frogImg = new ImageIcon ("frogger-frog_design.png");
	public static ImageIcon ladyFrogImg = new ImageIcon ("Frogger_female.png");
	public static ImageIcon logImg = new ImageIcon ("log.eps");
	public static ImageIcon turtleImg = new ImageIcon ("turtle.png");
	
	//private ArrayList<ScreenObjects> screenObjects;
	private javax.swing.Timer timer;

	/**
	 * Constructor
	 */
	public FrogScreen() {
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		//screenObjects = new ArrayList<ScreenObject>();
		
		this.addKeyListener(this);
		
		//set new timer and start
		timer = new javax.swing.Timer(30, new TimerListener());
		timer.start();
	}
	
	public void paintComponent(Graphics g) {
		/**
		 * override paintComponent to draw background image and objects
		 */
		super.paintComponent(g);
		g.drawImage(bgImg.getImage(), 0, 0, null);
		
		//will draw other game objects in this method
		/*for (ScreenObject obj : screenObjects) 
		 * {
				obj.draw(g);
			}*/
	}
	
	/**
	 * @return the timer
	 */
	public javax.swing.Timer getTimer() {
		return timer;
	}

	/**
	 * @param timer the timer to set
	 */
	public void setTimer(javax.swing.Timer timer) {
		this.timer = timer;
	}

	private class TimerListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// move each object 
			// obstacles will be moved in one direction at various speeds
			//
			
			
			repaint();
			
		}
		
	}
	

	/**
	 * Set controls to move frog around
	 */
	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
	    switch( keyCode ) 
	    { 
	        case KeyEvent.VK_UP:
	            // frog faces front and moves forward one unit 
	        	
	            break;
	        case KeyEvent.VK_DOWN:
	            // frog faces back and moves back one unit 
	        	
	            break;
	        case KeyEvent.VK_LEFT:
	        	//frog faces left and moves left one unit
	        	
	            
	            break;
	        case KeyEvent.VK_RIGHT :
	        	//frog faces right and moves right one unit
	            
	            break; 
	     }
	    repaint();
	
	}

		
	

	
	public void keyReleased(KeyEvent e) 
	{
		// does nothing
	}
	public void keyTyped(KeyEvent e) 
	{
		// does nothing		
	}

}
