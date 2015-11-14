



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
	
	public static int screenWidth = 575;
	public static int screenHeight = 625;
	public static ImageIcon bgImg = new ImageIcon ("Frogger Background.png");
	//public static ImageIcon bgImg = new ImageIcon ("withLanes.png");
	public static ImageIcon carImg = new ImageIcon ("car.png");
	public static ImageIcon truckImg = new ImageIcon ("truck.png");
	public static ImageIcon frogImg = new ImageIcon ("frog.png");
	public static ImageIcon ladyFrogImg = new ImageIcon ("ladyfrog.png");
	public static ImageIcon logImg = new ImageIcon ("log.png");
	public static ImageIcon turtleImg = new ImageIcon ("turtle.png");
	
	//Obstacle 
	public static int obstacleWidth = 45;
	public static int obstacleHeight = 36;
	public static int obstaclePoints = 10;
	
	public static int truckWidth = 111;	
	public static int turtleWidth = 47;
	public static int logWidth = 72;

	
	private ArrayList<GameObject> gameObject;
	private javax.swing.Timer timer;

	/**
	 * The screen has the original Frogger background.  When first
	 * create the game Level is 1.  Frogs, Trucks, Logs and Turtles
	 * and the score will be added.  The timer begins.
	 */
	public FrogScreen() {
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		gameObject = new ArrayList<GameObject>();

		
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
				Frogs playerFrog = new Frogs(new Point(x, y), new Rectangle(20, 20),
						frogImg.getImage());
				playerFrog.setVector(new MyVector(0, 0));
				playerFrog.setAngle(0);
				gameObject.add(0, playerFrog); // always at index 0

		//add  Truck
				Truck truck = new Truck(new Point(x, y), new Rectangle(
						truckWidth, obstacleHeight), obstaclePoints, truckImg.getImage());

				// generate trial vector
				//double a = 10 * Math.random() - 5;
				//double b = 10 * Math.random() - 5;
				//truck.setVector(new MyVector(a,b));

				gameObject.add(truck);
				
				
		//add Turtle
				Turtle turtle = new Turtle(new Point(x, y), new Rectangle(
						turtleWidth, obstacleHeight), obstaclePoints, turtleImg.getImage());

				// generate trial vector
				//double c = 10 * Math.random() - 5;
				//double d = 10 * Math.random() - 5;
				truck.setVector(new MyVector(0,0));

				gameObject.add(turtle);
				
		//add Log 
				Log log = new Log(new Point(x, y), new Rectangle(
						logWidth, obstacleHeight), obstaclePoints, turtleImg.getImage());

				// generate trial vector
				//double e = 10 * Math.random() - 5;
				//double f = 10 * Math.random() - 5;
				truck.setVector(new MyVector(0,0));

				gameObject.add(log);
				
				
			}
		

	
	public void paintComponent(Graphics g) {
		/**
		 * override paintComponent to draw background image and objects
		 */
		screenWidth = this.getWidth();
		screenHeight = this.getHeight();
		super.paintComponent(g);

		
		g.drawImage(bgImg.getImage(), 0, 0, screenWidth, screenHeight, null);

		//will draw other game objects in this method
		for (GameObject obj : gameObject) 
		  {
				obj.draw(g);
				
			}
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
			for (int i = 0; i < gameObject.size(); i++) 
			{
				GameObject obj = gameObject.get(i);
			}
			
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
