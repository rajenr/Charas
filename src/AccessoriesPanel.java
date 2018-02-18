/********************************************************************** 
 *  COURSE:        CS 112 Intro to CS II 
 *  DAYS AND TIME: TuTh 1:30 pm - 3:20 pm
 *  CHAPTER #:     Cumulative
 *	PROJECT #:     Final Project
 *  PROGRAMMER(s): Reesha Rajen
 *  LAST MODIFIED: 12/11/2017
 *  PROGRAM TITLE: AccessoriesPanel
 **********************************************************************
 *  PROGRAM DESCRIPTION: 
 *  Instantiates panel for CharasFrame.
 **********************************************************************
 *  UNIFIED MODELING LANGUAGE DIAGRAM (UML):
 *  ----------------------------
 *	|   AccessoriesPanel
 *  ----------------------------
 *  | - icon : ImageIcon
 *  | - image : BufferedImage
 *  | - label : JLabel
 *  | - accessories : ButtonGroup
 *	----------------------------
 *  | + AccessoriesPanel()
 *  ----------------------------
 **********************************************************************/
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.io.IOException;
import java.io.File; 
import javax.imageio.ImageIO; 
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class AccessoriesPanel extends JPanel
{
	private static String DEFAULT_ACCESSORY = "/Images/defaultAccessory.png";
	private static String GREEN_ELF_HAT = "/Images/elfHat.png";
	private static String SWORD_ACCESSORY = "/Images/sword.png";
	
	private BufferedImage image;
	private ImageIcon icon;
	private JLabel label;

	private ImageIcon hatIcon;
	private BufferedImage hat;
	private JCheckBox hatCheck;
	private String hatText;
	private String hatToolTip;
	
	private ImageIcon swordIcon;
	private BufferedImage sword;
	private JCheckBox swordCheck;
	private String swordText;
	private String swordToolTip;
	
	private JLabel text;
	private ButtonGroup accessories;

	public AccessoriesPanel()
	{
		accessories = new ButtonGroup();
		
		setBounds(0, 0, 325, 600);
		setBackground(Color.WHITE);
		setOpaque(false);
		
		hatText = "Link's Hat";
		swordText = "Legendary Sword";
		hatToolTip = "Iconic Hat from Legend of Zelda series";
		swordToolTip = "Recurring Legendary Sword in Legend of Zelda series";
		text = new JLabel("Accessory:");
			
		hatCheck = new JCheckBox(hatText);
		hatCheck.setBackground(Color.WHITE);
		hatCheck.setToolTipText(hatToolTip);
		
		swordCheck = new JCheckBox(swordText);
		swordCheck.setBackground(Color.WHITE);
		swordCheck.setToolTipText(swordToolTip);
		
		accessories.add(hatCheck);
		accessories.add(swordCheck);
		
		try
		{
			image = ImageIO.read(getClass().getResource(DEFAULT_ACCESSORY));
			icon = new ImageIcon(image);
			label = new JLabel(icon);
			
			hat = ImageIO.read(getClass().getResource(GREEN_ELF_HAT));
			sword = ImageIO.read(getClass().getResource(SWORD_ACCESSORY));
			
			hatIcon = new ImageIcon(hat);
			swordIcon = new ImageIcon(sword);
			
			add(label);
			add(text);
			
			hatCheck.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(hatCheck.isSelected())
					{
						label.setIcon(hatIcon);
					}
				}
			});
			swordCheck.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(swordCheck.isSelected())
					{
						label.setIcon(swordIcon);
					}
				}
			});
		}
		catch(IOException ioe)
		{
			new FileNotFoundException();
		}
			
		add(text);
		add(hatCheck);
		add(swordCheck);
	}
}
