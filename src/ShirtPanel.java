/********************************************************************** 
 *  COURSE:        CS 112 Intro to CS II 
 *  DAYS AND TIME: TuTh 1:30 pm - 3:20 pm
 *  CHAPTER #:     Cumulative
 *	PROJECT #:     Final Project
 *  PROGRAMMER(s): Reesha Rajen
 *  LAST MODIFIED: 12/11/2017
 *  PROGRAM TITLE: ShirtPanel
 **********************************************************************
 *  PROGRAM DESCRIPTION: 
 *  Instantiates panel for CharasFrame.
 **********************************************************************
 *  UNIFIED MODELING LANGUAGE DIAGRAM (UML):
 *  ----------------------------
 *	|   ShirtPanel
 *  ----------------------------
 *  | - icon : ImageIcon
 *  | - image : BufferedImage
 *  | - label : JLabel
 *  | - shirts : ButtonGroup
 *	----------------------------
 *  | + ShirtPanel()
 *  ----------------------------
 **********************************************************************/
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.io.IOException;
import javax.imageio.ImageIO; 
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class ShirtPanel extends JPanel
{
	/*** CONSTANTS ***/
	private static String DEFAULT_SHIRT = "/Images/defaultShirt.png";
	private static String RED_SHIRT = "/Images/redShirt.png";
	private static String GREEN_SHIRT = "/Images/greenShirt.png";
	private static String BLUE_SHIRT = "/Images/blueShirt.png";
	
	/*** INSTANCE VARIABLES ***/
	private BufferedImage image1;
	private ImageIcon icon1;
	private JLabel label1, text;
	private ButtonGroup shirts;
	
	/*** METHODS ***/
	
	//DESCRIPTION:    Default constructor for ShirtPanel
	//PRE-CONDITION:  N/A
	//POST-CONDITION: Creates new instance of ShirtPanel
	public ShirtPanel()
	{
		setBounds(0, 0, 325, 600);
		setBackground(Color.WHITE);
		setOpaque(false);
		
		shirts = new ButtonGroup();
		text = new JLabel("Shirt Color:");
		
		JRadioButton greenShirt;
		JRadioButton redShirt;
		JRadioButton blueShirt;

		greenShirt = new JRadioButton();
		redShirt = new JRadioButton();
		blueShirt = new JRadioButton();
		
		greenShirt.setBackground(Color.WHITE);
		redShirt.setBackground(Color.WHITE);
		blueShirt.setBackground(Color.WHITE);
		
		shirts.add(greenShirt);
		shirts.add(redShirt);
		shirts.add(blueShirt);
		
		try
		{
			
			image1 = ImageIO.read(getClass().getResource(DEFAULT_SHIRT));
			icon1 = new ImageIcon(image1);
			label1 = new JLabel(icon1);
			
			BufferedImage shirtImage1 = ImageIO.read(getClass().getResource(GREEN_SHIRT));
			BufferedImage shirtImage2 = ImageIO.read(getClass().getResource(RED_SHIRT));
			BufferedImage shirtImage3 = ImageIO.read(getClass().getResource(BLUE_SHIRT));
			
			ImageIcon shirtIcon1 = new ImageIcon(shirtImage1);
			ImageIcon shirtIcon2 = new ImageIcon(shirtImage2);
			ImageIcon shirtIcon3 = new ImageIcon(shirtImage3);
			
			Image color1 = ImageIO.read(getClass().getResource("/Images/redSwatch.png"));
			Image color2 = ImageIO.read(getClass().getResource("/Images/greenSwatch.png"));
			Image color3 = ImageIO.read(getClass().getResource("/Images/blueSwatch.png"));
			
			redShirt.setIcon(new ImageIcon(color1));
			greenShirt.setIcon(new ImageIcon(color2));
			blueShirt.setIcon(new ImageIcon(color3));
			
			redShirt.setToolTipText("X-Wing Red");
			greenShirt.setToolTipText("Hyrule Green");
			blueShirt.setToolTipText("Skywalker Blue");
			
			add(label1);
			add(text);
			
			greenShirt.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(greenShirt.isSelected())
					{
						label1.setIcon(shirtIcon1);
					}
				}
			});
			redShirt.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(redShirt.isSelected())
					{
						label1.setIcon(shirtIcon2);
					}
				}
			});
			blueShirt.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(blueShirt.isSelected())
					{
						label1.setIcon(shirtIcon3);
					}
				}
			});
		}
		catch(IOException ioe)
		{
			new FileNotFoundException();
		}
		
		add(greenShirt);
		add(redShirt);
		add(blueShirt);
	}
}
