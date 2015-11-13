import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Kim
 * Builds a screen, holds most of gameplay mechanics
 *
 */
public class FrogScreen extends JPanel implements KeyListener {
	
	public static int screenWidth = 600;
	public static int screenHeight = 650;
	//public static ImageIcon bgImg = new ImageIcon ("Frogger Background.png");
	public static ImageIcon bgImg = new ImageIcon ("withLanes.png");
	public static ImageIcon carImg = new ImageIcon ("car1.png");
	public static ImageIcon truckImg = new ImageIcon ("truck1.png");
	public static ImageIcon frogImg = new ImageIcon ("frogger-frog_design.png");
	public static ImageIcon ladyFrogImg = new ImageIcon ("Frogger_female.png");
	public static ImageIcon logImg = new ImageIcon ("log.eps");
	public static ImageIcon turtleImg = new ImageIcon ("turtle.png");
	
	//Obstacle 
	public static int obstacleWidth = 45;
	public static int obstacleHeight = 45;
	public static int obstaclePoints = 10;

	
	private ArrayList<GameObject> GameObject;
	private javax.swing.Timer timer;

	/**
	 * The screen has the original Frogger background.  When first
	 * create the game Level is 1.  Frogs, Trucks, Logs and Turtles
	 * and the score will be added.  The timer begins.
	 */
	public FrogScreen() {
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		GameObject = new ArrayList<GameObject>();
		
		
		addFrogsandObstacles();
		
		//add the score here 
		//theScore = 
		
		
		this.addKeyListener(this);
		
		//set new timer and start
		timer = new javax.swing.Timer(30, new TimerListener());
		timer.start();
	}
	
	/**
	 * This method adds the Frogs and Obstacles to the screen
	 * creates and adds new ones.  
	 */
	public void addFrogsandObstacles() {
		// add Frog 
		// adds the frog to the bottom of the screen
				int x = screenWidth / 2;
				int y = screenHeight / 20;
				Frogs playerfrog = new Frogs(new Point(x, y), new Rectangle(20, 20),
						frogImg.getImage());
				//playerfrog.setVector(new MyVector(0, 0));
				//playerfrog.setAngle(0);
				//GameObject.add(0, playerfrog); // always at index 0

		//add  Truck
				Truck truck = new Truck(new Point(x, y), new Rectangle(
						width, height), points, truckImg.getImage());

				// generate trial vector
				//double a = 10 * Math.random() - 5;
				//double b = 10 * Math.random() - 5;
				//truck.setVector(new MyVector(a,b));

				GameObject.add(truck);
				
				
		//add Turtle
				Turtle turtle = new Turtle(new Point(x, y), new Rectangle(
						width, height), points, turtleImg.getImage());

				// generate trial vector
				//double c = 10 * Math.random() - 5;
				//double d = 10 * Math.random() - 5;
				truck.setVector(new MyVector(c,d);

				GameObject.add(turtle);
				
		//add Log 
				Log log = new Log(new Point(x, y), new Rectangle(
						width, height), points, turtleImg.getImage());

				// generate trial vector
				//double e = 10 * Math.random() - 5;
				//double f = 10 * Math.random() - 5;
				truck.setVector(new MyVector(e,f));

				GameObject.add(turtle);
				
				
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
