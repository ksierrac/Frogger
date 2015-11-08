import javax.swing.JFrame;


/**
 * @author Sierra
 * Window class to hold all game components
 *
 */

public class Window extends JFrame 
{

	/**
	 * Window constructor
	 */
	public Window() 
	{
		setTitle("Frogger");
		setLocationRelativeTo(null);		//center the window on the desktop
		FrogScreen frogScreen = new FrogScreen();
		add(frogScreen);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Window frogWindow = new Window();

	}

}
