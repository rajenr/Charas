/********************************************************************** 
 *  COURSE:        CS 112 Intro to CS II 
 *  DAYS AND TIME: TuTh 1:30 pm - 3:20 pm
 *  CHAPTER #:     Cumulative
 *	PROJECT #:     Final Project
 *  PROGRAMMER(s): Reesha Rajen
 *  LAST MODIFIED: 12/11/2017
 *  PROGRAM TITLE: HairPanel
 **********************************************************************
 *  PROGRAM DESCRIPTION: 
 *  Instantiates panel for CharasFrame.
 **********************************************************************
 *  UNIFIED MODELING LANGUAGE DIAGRAM (UML):
 *  ----------------------------
 *	|   HairPanel
 *  ----------------------------
 *  | - icon : ImageIcon
 *  | - image : BufferedImage
 *  | - label : JLabel
 *	----------------------------
 *  | + HairPanel()
 *  ----------------------------
 **********************************************************************/
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.io.IOException;
import javax.imageio.ImageIO; 
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class HairPanel extends JPanel
{
	/*** CONSTANTS ***/
	private static String DEFAULT_HAIR = "/Images/defaultHair.png";
	
	private static String BLO_LEIA = "/Images/blondeHairLeia.png";
	private static String BR_LEIA = "/Images/brownHairLeia.png";
	private static String BL_LEIA = "/Images/blackHairLeia.png";
	private static String G_LEIA = "/Images/greenHairLeia.png";
	
	private static String BLO_LINK = "/Images/blondeHairLink.png";
	private static String BR_LINK = "/Images/brownHairLink.png";
	private static String BL_LINK = "/Images/blackHairLink.png";
	private static String G_LINK = "/Images/greenHairLink.png";
	
	/*** INSTANCE VARIABLES ***/
	private BufferedImage image1;
	private ImageIcon icon1;
	private JLabel label1, text;
		
	/*** METHODS ***/
	
	//DESCRIPTION:    Default constructor for HairPanel
	//PRE-CONDITION:  N/A
	//POST-CONDITION: Creates new instance of HairPanel
	public HairPanel()
	{
		
		text = new JLabel("Hair Tone:");
		text.setToolTipText("Select tone first, then style");
		setBounds(0, 0, 325, 600);
		setBackground(Color.WHITE);
		setOpaque(false);

		ButtonGroup colors;
		
		JRadioButton blondeButton;
		String blondeString;
		
		JRadioButton brownButton;
		String brownString;
		
		JRadioButton blackButton;
		String blackString;
		
		JRadioButton funButton;
		String funString;
		
		blondeString = "Light";
		brownString = "Medium";
		blackString = "Dark";
		funString = "Green";
		
		blondeButton = new JRadioButton(blondeString);
		brownButton = new JRadioButton(brownString);
		blackButton = new JRadioButton(blackString);
		funButton = new JRadioButton(funString);
		
		blondeButton.setBackground(Color.WHITE);
		brownButton.setBackground(Color.WHITE);
		blackButton.setBackground(Color.WHITE);
		funButton.setBackground(Color.WHITE);
		
		colors = new ButtonGroup();
		colors.add(blondeButton);
		colors.add(brownButton);
		colors.add(blackButton);
		colors.add(funButton);
		
		JButton button = new JButton();
		JButton button2 = new JButton();
		
		try
		{
			
			image1 = ImageIO.read(getClass().getResource(DEFAULT_HAIR));
			icon1 = new ImageIcon(image1);
			label1 = new JLabel(icon1);
			
			BufferedImage hairImage1 = ImageIO.read(getClass().getResource(BLO_LEIA));
			ImageIcon hairIcon1 = new ImageIcon(hairImage1);
			
			BufferedImage hairImage2 = ImageIO.read(getClass().getResource(BR_LEIA));
			ImageIcon hairIcon2 = new ImageIcon(hairImage2);
			
			BufferedImage hairImage3 = ImageIO.read(getClass().getResource(BL_LEIA));
			ImageIcon hairIcon3 = new ImageIcon(hairImage3);
			
			BufferedImage hairImage4 = ImageIO.read(getClass().getResource(G_LEIA));
			ImageIcon hairIcon4 = new ImageIcon(hairImage4);
			
			BufferedImage hairImage5 = ImageIO.read(getClass().getResource(BLO_LINK));
			ImageIcon hairIcon5 = new ImageIcon(hairImage5);
			
			BufferedImage hairImage6 = ImageIO.read(getClass().getResource(BR_LINK));
			ImageIcon hairIcon6 = new ImageIcon(hairImage6);
			
			BufferedImage hairImage7 = ImageIO.read(getClass().getResource(BL_LINK));
			ImageIcon hairIcon7 = new ImageIcon(hairImage7);
			
			BufferedImage hairImage8 = ImageIO.read(getClass().getResource(G_LINK));
			ImageIcon hairIcon8 = new ImageIcon(hairImage8);
			
			add(label1);
			add(text);
			setOpaque(false);
		
			Image image = ImageIO.read(
						  getClass().getResource("/Images/leiaButton.png"));	
			button.setIcon(new ImageIcon(image));
			Image image2 = ImageIO.read(
						  getClass().getResource("/Images/linkButton.png"));	
			button2.setIcon(new ImageIcon(image2));
			
			button.setToolTipText("Star Wars Leia Organa");
			button2.setToolTipText("Link of Legend of Zelda");
			
			button.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(blondeButton.isSelected())
					{
						label1.setIcon(hairIcon1);
					}
					if(brownButton.isSelected())
					{
						label1.setIcon(hairIcon2);
					}
					if(blackButton.isSelected())
					{
						label1.setIcon(hairIcon3);
					}
					if(funButton.isSelected())
					{
						label1.setIcon(hairIcon4);
					}
				}
			});
			
			button2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(blondeButton.isSelected())
					{
						label1.setIcon(hairIcon5);
					}
					if(brownButton.isSelected())
					{
						label1.setIcon(hairIcon6);
					}
					if(blackButton.isSelected())
					{
						label1.setIcon(hairIcon7);
					}
					if(funButton.isSelected())
					{
						label1.setIcon(hairIcon8);
					}
				}
			});
		}
		catch(IOException ioe)
		{
			new FileNotFoundException();
		}
		
		button.setBackground(Color.WHITE);
		button.setBorder(null);
		
		button2.setBackground(Color.WHITE);
		button2.setBorder(null);
		
		
		add(blondeButton);
		add(brownButton);
		add(blackButton);
		add(funButton);
		add(button);
		add(button2);
	
	}
}
