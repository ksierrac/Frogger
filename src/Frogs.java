
import java.awt.Image;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

//import FrogScreen.TimerListener;



/**
 * Frogs is the player controlled object that has a particular
 * location, size, image, and angle.  
 * @author Sierra, Kim, Mitch
 *
 */
public class Frogs  extends MovingGameObject 
{
	/**
	 * Create Frogs at a location.
	 * @param location Starting location.
	 * @param size Starting size.
	 * @param i Image of the Frog.
	 */

	
	public Frogs (Point location, Rectangle size, Image i) 
	{
		
		super(location, size, i, 0);
		
	
	}

}