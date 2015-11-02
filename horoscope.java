import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HoroscopeGenerator extends JFrame {

	private JLabel instructions;
	private JPanel panel;
	private ArrayList<String> horoscopeList;
	private JTextArea horoscope;
	private JComboBox day;
	private JComboBox month;
	
	/** Months of the year **/
	public static String [] months = {"January", "February", "March", "April",
		"May", "June", "July", "August", "September", "October", "November",
		"December"};
	
	/** Zodiac signs **/
	public static String [] zodiacs = {"Sagittarius", "Capricorn", "Aquarius", "Pisces", "Aries",
		"Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio" };
	

	/**
	 * Create a window with specified title, size, and a panel which contains
	 * all of the necessary GUI components. Also reads in all of the horoscopes
	 * from the input file and stores them in an ArrayList.  
	 * @throws FileNotFoundException 
	 */
	public HoroscopeGenerator() throws FileNotFoundException 
	{
		setTitle("Horoscope Generator");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
		
		//read in horoscopes and store in an ArrayList
		horoscopeList = new ArrayList<String>();
		File f = new File("horoscopes.txt");
		Scanner scan = new Scanner(f);
		while(scan.hasNextLine())
		{
			String next = scan.nextLine();
			horoscopeList.add(next);
		}
		scan.close();
	}
	
	/**
	 * 
	 * Listener to attach to Generate button - finds random horoscope
	 *
	 */
	class HoroscopeListener implements ActionListener
	{
		Random generator = new Random();
		
		/**
		 * Identifies selected month and day, finds correct horoscope name and random horoscope
		 */
		public void actionPerformed(ActionEvent e) 
		{
			String chosenMonth = (String) month.getSelectedItem();
			int chosenDay = (int) day.getSelectedItem();
			int hIndex = generator.nextInt(horoscopeList.size());
			int zIndex = findIndex(chosenMonth, chosenDay);
			horoscope.setText(zodiacs[zIndex]+": "+horoscopeList.get(hIndex));
		}
		
		/**
		 * 
		 * @param m The user's birth month
		 * @param d	The user's birth day
		 * @return The index of their zodiac sign in the list
		 */
		public int findIndex(String m, int d)
		{
			int index=0;
			if ((m.equals("November") && d>=23) || (m.equals("December") && d<=22))
			{
				index = 0;
			}
			else if ((m.equals("December") && d>=23) || (m.equals("January") && d<=20))
			{
				index = 1;
			} 
			else if ((m.equals("January") && d>=21) || (m.equals("February") && d<=19))
			{
				index = 2;
			}
			else if ((m.equals("February") && d>=20) || (m.equals("March") && d<=20))
			{
				index = 3;
			}
			else if ((m.equals("March") && d>=21) || (m.equals("April") && d<=20))
			{
				index = 4;
			}
			else if ((m.equals("April") && d>=21) || (m.equals("May") && d<=22))
			{
				index = 5;
			}
			else if ((m.equals("May") && d>=22) || (m.equals("June") && d<=21))
			{
				index = 6;
			}
			else if ((m.equals("June") && d>=22) || (m.equals("July") && d<=22))
			{
				index = 7;
			}
			else if ((m.equals("July") && d>=23) || (m.equals("August") && d<=21))
			{
				index = 8;
			}
			else if ((m.equals("August") && d>=22) || (m.equals("September") && d<=23))
			{
				index = 9;
			}
			else if ((m.equals("September") && d>=24) || (m.equals("October") && d<=23))
			{
				index = 10;
			}
			else if ((m.equals("October") && d>=24) || (m.equals("November") && d<=22))
			{
				index = 11;
			}
			return index;
		}
	}
	
	/**
	 * Builds a panel with instructions, month and day drop-down menus,
	 * a text area to show horoscope and a button to generate.
	 */
	private void buildPanel() 
	{
		
		panel = new JPanel();
		instructions = new JLabel("Enter your birthday");
		panel.add(instructions);
		
		month = new JComboBox();
		for (int i=0; i<months.length; i++)
		{
			month.addItem(months[i]);
		}
		panel.add(month);
		
		day = new JComboBox();
		for (int i=1; i<=31; i++)
		{
			day.addItem(i);
		}
		panel.add(day);
		
		horoscope = new JTextArea(10,20);
		horoscope.setLineWrap(true);
		horoscope.setWrapStyleWord(true);
		horoscope.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(horoscope);
		panel.add(scrollPane);
		
		
		JButton generate = new JButton("Find My Horoscope");
		ActionListener listener = new HoroscopeListener();
		generate.addActionListener(listener);
		panel.add(generate);
	}

	/**
	 * Create an instance of the window.
	 * @param args Command-line arguments (ignored).
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
		HoroscopeGenerator window = new HoroscopeGenerator();
		

	}

}
