import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

/**
 * A Log is a  object that moves in a horizontal line and is located 
 * in the water.  
 * If it frog reaches the log, the frog will stay on the log.
 * When the player moves to the next lane and avoids 
 * the water, the player will receive 10 points.
 * @author Kim
 *
 */
public class Log extends Obstacles{

	/**
	 * Create an Log at a particular place, with a 
	 * particular size, a particular point value, and an image.
	 * @param p The location.
	 * @param s The size (width and height)
	 * @param pv The point value
	 * @param i The image
	 */	
	public Log(Point p, Rectangle s, int pv, Image i) {
		super(p, s, pv, i);
	}

	

}
