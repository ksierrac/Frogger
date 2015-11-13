import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;



/**
 * Frogs is the player controlled object that has a particular
 * location, size, image, and angle.  
 * @author Kim
 *
 */
public class Frogs  extends MovingGameObject {
	/**
	 * Create Frogs at a location.
	 * @param location Starting location.
	 * @param size Starting size.
	 * @param i Image of the ship.
	 */
	public Frogs (Point location, Rectangle size, Image i) {
		super(location, size, i, 0);
	
		
	}

}
