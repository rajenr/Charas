/********************************************************************** 
 *  COURSE:        CS 112 Intro to CS II 
 *  DAYS AND TIME: TuTh 1:30 pm - 3:20 pm
 *  CHAPTER #:     Cumulative
 *	PROJECT #:     Final Project
 *  PROGRAMMER(s): Reesha Rajen
 *  LAST MODIFIED: 12/11/2017
 *  PROGRAM TITLE: CharasFrame
 **********************************************************************
 *  PROGRAM DESCRIPTION: 
 *  Instantiates frame for Charas application.
 **********************************************************************
 *  UNIFIED MODELING LANGUAGE DIAGRAM (UML):
 *  ----------------------------
 *	|   CharasFrame
 *	----------------------------
 *  | - defaultPanel : DefaultPanel
 *  | - tonePanel : TonePanel
 *  | - hairPanel : HairPanel
 *  | - shirtPanel : ShirtPanel
 *  | - accessoriesPanel : AccessoriesPanel
 *	----------------------------
 *  | + CharasFrame()
 *  ----------------------------
 **********************************************************************/
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import java.io.IOException;
import javax.imageio.ImageIO; 
import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.Color;

public class CharasFrame extends JFrame 
{
	/*** CONSTANTS ***/
    private static String DEFAULT_TITLE = "Charas";
    private static int DEFAULT_WIDTH = 340;
    private static int DEFAULT_HEIGHT = 580;
    private static String DEFAULT_FILE = "/Images/basic.png";
    
    /*** INSTANCE VARIABLES ***/
    private JLayeredPane pane;
    private BufferedImage image;
    private ImageIcon icon;
    private JLabel label;
    
    private DefaultPanel defaultPanel; 
	private TonePanel tonePanel;
	private HairPanel hairPanel;
	private ShirtPanel shirtPanel;
	private AccessoriesPanel accessoriesPanel;

	/*** METHODS ***/
	
	//DESCRIPTION:    Default constructor for CharasFrame
	//PRE-CONDITION:  N/A
	//POST-CONDITION: Creates new instance of CharasFrame
	public CharasFrame()
	{
		defaultPanel = new DefaultPanel();
		tonePanel = new TonePanel();
		hairPanel = new HairPanel();
		shirtPanel = new ShirtPanel();
		accessoriesPanel = new AccessoriesPanel();
		pane = new JLayeredPane();
		
		setTitle(DEFAULT_TITLE);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setResizable(false);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(pane, BorderLayout.CENTER);
		pane.setBounds(0, 0, 325, 600);
		pane.add(defaultPanel, new Integer(0), 0);
		pane.add(tonePanel, new Integer(1), 0);
		pane.add(hairPanel, new Integer(2), 0);
		pane.add(shirtPanel, new Integer(3), 0);
		pane.add(accessoriesPanel, new Integer(4), 0);
	}
	
	private class DefaultPanel extends JPanel
	{
		public DefaultPanel()
		{
			try
			{
				image = ImageIO.read(getClass().getResource(DEFAULT_FILE));
				icon = new ImageIcon(image);
				label = new JLabel(icon);
				setBounds(0, 0, 325, 600);
				setBackground(Color.WHITE);
				add(label);
				setOpaque(true);	
			}
			catch(IOException e)
			{
				new FileNotFoundException();
			}
		}
	}
	
	
	
	
	
			
}
