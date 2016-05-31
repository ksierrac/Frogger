import javax.swing.JFrame;


/**
 * @author Sierra, Kim, Mitch
 * Window class to hold all game components
 *
 **/

public class Window extends JFrame 
{

	/**
	 * Window constructor
	 * Calls and adds a frogScreen
	 **/
	public Window() 
	{
		setTitle("Frogger");
		FrogScreen frogScreen = new FrogScreen();
		add(frogScreen);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frogScreen.setFocusable(true);
		frogScreen.requestFocusInWindow();
		pack();
		setLocationRelativeTo(null);		//center the window on the desktop
		
		setVisible(true);
	}


}