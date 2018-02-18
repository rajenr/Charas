/********************************************************************** 
 *  COURSE:        CS 112 Intro to CS II 
 *  DAYS AND TIME: TuTh 1:30 pm - 3:20 pm
 *  CHAPTER #:     Cumulative
 *	PROJECT #:     Final Project
 *  PROGRAMMER(s): Reesha Rajen
 *  LAST MODIFIED: 12/11/2017
 *  PROGRAM TITLE: TonePanel
 **********************************************************************
 *  PROGRAM DESCRIPTION: 
 *  Instantiates panel for CharasFrame.
 **********************************************************************
 *  UNIFIED MODELING LANGUAGE DIAGRAM (UML):
 *  ----------------------------
 *	|   TonePanel
 *  ----------------------------
 *  | - iconDefault : ImageIcon
 *  | - buttons : ArrayList<JButtons>
 *	----------------------------
 *  | + TonePanel()
 *  ----------------------------
 **********************************************************************/
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.io.IOException;
import javax.imageio.ImageIO; 
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import java.util.ArrayList;

public class TonePanel extends JPanel
{
	/*** CONSTANTS ***/
	private static String DEFAULT_FILE = "/Images/basic.png";
	private static String TONE1 = "/Images/tone1.png";
	private static String TONE2 = "/Images/tone2.png";
	private static String TONE3 = "/Images/tone3.png";
	private static String TONE4 = "/Images/tone4.png";
	private static String TONE5 = "/Images/tone5.png";
	private static String TONE6 = "/Images/tone6.png";
	private static String TONE7 = "/Images/tone7.png";

	/*** INSTANCE VARIABLES ***/
	private ImageIcon iconDefault, icon1, icon2, icon3;
	private ImageIcon icon4, icon5, icon6, icon7;
	private JLabel label;
	private ArrayList<JButton> buttons;
	private BufferedImage imageDefault, image1, image2, image3;
	private BufferedImage image4, image5, image6, image7;
	
	
	/*** METHODS ***/
	
	//DESCRIPTION:    Default constructor for TonePanel
	//PRE-CONDITION:  N/A
	//POST-CONDITION: Creates new instance of TonePanel
	public TonePanel()
	{
		try
		{
			imageDefault = ImageIO.read(getClass().getResource(DEFAULT_FILE));
			iconDefault = new ImageIcon(imageDefault);
			label = new JLabel(iconDefault);
			
			image1 = ImageIO.read(getClass().getResource(TONE1));
			image2 = ImageIO.read(getClass().getResource(TONE2));
			image3 = ImageIO.read(getClass().getResource(TONE3));
			image4 = ImageIO.read(getClass().getResource(TONE4));
			image5 = ImageIO.read(getClass().getResource(TONE5));
			image6 = ImageIO.read(getClass().getResource(TONE6));
			image7 = ImageIO.read(getClass().getResource(TONE7));

			icon1 = new ImageIcon(image1);
			icon2 = new ImageIcon(image2);
			icon3 = new ImageIcon(image3);
			icon4 = new ImageIcon(image4);
			icon5 = new ImageIcon(image5);
			icon6 = new ImageIcon(image6);
			icon7 = new ImageIcon(image7);

			setBounds(0, 0, 325, 600);
			setBackground(Color.WHITE);
			add(label); //redundant!!! fix first
			setOpaque(false);
		
			buttons = new ArrayList<JButton> ();
		
			for(int i = 0; i < 7; i++)
			{
				buttons.add(new JButton());
			}
			
			buttons.get(0).setToolTipText("Lightest");
			buttons.get(1).setToolTipText("Light");
			buttons.get(2).setToolTipText("Medium-Light");
			buttons.get(3).setToolTipText("Medium");
			buttons.get(4).setToolTipText("Medium-Dark");
			buttons.get(5).setToolTipText("Dark");
			buttons.get(6).setToolTipText("Darkest");
	
			Image image1 = ImageIO.read(getClass().getResource("/Images/swatch01.png"));
			Image image2 = ImageIO.read(getClass().getResource("/Images/swatch02.png"));
			Image image3 = ImageIO.read(getClass().getResource("/Images/swatch03.png"));
			Image image4 = ImageIO.read(getClass().getResource("/Images/swatch04.png"));
			Image image5 = ImageIO.read(getClass().getResource("/Images/swatch05.png"));
			Image image6 = ImageIO.read(getClass().getResource("/Images/swatch06.png"));
			Image image7 = ImageIO.read(getClass().getResource("/Images/swatch07.png"));
			
			buttons.get(0).setIcon(new ImageIcon(image1));
			buttons.get(1).setIcon(new ImageIcon(image2));
			buttons.get(2).setIcon(new ImageIcon(image3));
			buttons.get(3).setIcon(new ImageIcon(image4));
			buttons.get(4).setIcon(new ImageIcon(image5));
			buttons.get(5).setIcon(new ImageIcon(image6));
			buttons.get(6).setIcon(new ImageIcon(image7));
			
			for(int i = 0; i < 7; i++)
			{
				buttons.get(i).setBackground(Color.WHITE);
				buttons.get(i).setBorder(null);
				add(buttons.get(i));
			}
		
			 buttons.get(0).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
						label.setIcon(icon1);
				}
			});
			buttons.get(1).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
						label.setIcon(icon2);
				}
			});
			buttons.get(2).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
						label.setIcon(icon3);
				}
			});
			buttons.get(3).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
						label.setIcon(icon4);
				}
			});
			buttons.get(4).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
						label.setIcon(icon5);
				}
			});
			buttons.get(5).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
						label.setIcon(icon6);
				}
			});
			buttons.get(6).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
						label.setIcon(icon7);
				}
			});
		}
		catch(IOException e)
		{
			new FileNotFoundException();
		} 
	}
}
