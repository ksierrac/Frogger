import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

	
public class StartFrogScreen extends JFrame implements KeyListener 
{    
	   public static int screenWidth = 720;
	   public static int screenHeight = 782;
	   	   
	   public StartFrogScreen()
	   {
		   setSize(screenWidth, screenHeight);
		   setLocationRelativeTo(null);						
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setTitle("Start");
		   addKeyListener(this);
		   ImageIcon start = new ImageIcon("start.png");
		   JLabel imgLabel = new JLabel();
		   imgLabel.setIcon(start);
		   add(imgLabel);
		   
		   setVisible(true);
	   }

	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
	    switch( keyCode ) 
	    { 
	        case KeyEvent.VK_ENTER:
	        	setVisible(false);
	        	Window frogWindow = new Window();
	        break;
	    }
	}

	public void keyReleased(KeyEvent e) 
	{
	}
	
	public void keyTyped(KeyEvent e) 
	{
	}
	
	public static void main(String[] args) 
	{	
		StartFrogScreen start = new StartFrogScreen();
	}
}

