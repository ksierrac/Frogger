import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 	Displays a start screen prompt
 * When the user hits Enter, closes start screen and opens a game window
 * Contains main method
 * @author Sierra, Kim, Mitch
 *
 */
public class StartFrogScreen extends JFrame implements KeyListener 
{    
	   public static int screenWidth = 720;
	   public static int screenHeight = 782;
	   protected static Window frogWindow;
	   
	   private JLabel imgLabel;
	   	   
	   public StartFrogScreen()
	   {
		   setSize(screenWidth, screenHeight);
		   setLocationRelativeTo(null);						
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setTitle("Start");
		   addKeyListener(this);
		   ImageIcon start = new ImageIcon("start.png");
		   imgLabel = new JLabel();
		   imgLabel.setIcon(start);
		   add(imgLabel);
		   
		   setVisible(true);
	   }
	   
	/**
	 * Watches for Enter to be pressed to initialize a game window   
	 */
	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
	    switch( keyCode ) 
	    { 
	        case KeyEvent.VK_ENTER:
	        	remove(imgLabel);
	        	frogWindow = new Window();
	        break;
	    }
	}
	public void keyReleased(KeyEvent e) 
	{
		//does nothing
	}
	
	public void keyTyped(KeyEvent e) 
	{
		//does nothing
	}
	
	/**
	 * Main method sets current frog window to invisible and opens a new start screen
	 * @param args ignore
	 */
	public static void main(String[] args) 
	{	
		if (frogWindow != null)
		{
			frogWindow.dispose();
		}
		
		StartFrogScreen start = new StartFrogScreen();
	}
}

