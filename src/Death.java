import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;



/**
 * Death image will be created and displayed when the frog dies
 * @author Sierra, Kim, Mitch
 *
 */
public class Death extends MovingGameObject {

	/**
	 * Create an death image as a MovingGameObject, with a 
	 * particular size and an image.
	 * @param location The location.
	 * @param size The size (width and height)
	 * @angle angle The angle of the object.  
	 */	
	public Death(Point location, Rectangle size, Image i, double angle) {
		super(location, size, i, angle);
		maxAge = 30;  
	}

}
