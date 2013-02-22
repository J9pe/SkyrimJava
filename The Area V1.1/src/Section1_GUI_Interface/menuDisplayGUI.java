package Section1_GUI_Interface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Section3_DuelSimulation.TesterForData;
import Utilities.ConsoleVersion;
import Utilities.ShortcutMethods;
import Utilities.gameObjects;
	

@SuppressWarnings("serial")
public class menuDisplayGUI extends JFrame implements ActionListener{
	
	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: tired
	 * ##############################################################################################
	 */ 
////////////////////////////////////////////////////////////////////////////////////
//The following is a GUI to display the menu of the game
//This basiaclly allows you to run the game with different options
////////////////////////////////////////////////////////////////////////////////////

	final private int windowXpixels=1000; 
	final private int windowYpixels=700; 
	final private int choiceButtonsSize=200;
	private Font choiceButtonsFont;
	final private int numButtons=6;
	
	private JButton[] choiceButtons;
	
	private JPanel menuPanel;
	private JPanel picPanel;
	private JPanel sidePanelLeft;
	private JPanel sidePanelRight;
	
	private JPanel testerScene;
		private final int numInputsTesterScene=8;
		private ImageIcon testerBackgroundImage;
		private JLabel testerBackground;
		private JLabel testerInfo;
		private String[] inputInfoLabelTitle={"YOUR RACE","YOUR WEAPON","YOUR ARMOUR",
				"ENEMY RACE","ENEMY WEAPON", "ENEMY ARMOUR", 
				"FIGHT HOW MANY TIMES","DISTANCE IN FEET"};
		private JLabel[] inputInfoLabel;
		private JTextField[] inputInfo;
		private JButton submitTester;
		private JButton returnToMenu;
		private JTextArea testerInfoArea;
		private JScrollPane scrollPane1;
	
	private ImageIcon image_Intro;
	private ImageIcon image_Pillar;
	private ImageIcon image_GuyDownOblivion;


	private Font font_Dialog_50;

	private SpringLayout layout1_Spring;
	private FlowLayout layout1_Flow;
	

	private JLabel label_Intro;
	private JLabel label_IntroTitle;
	private JLabel label_SideImage;
	private JLabel label_SideImage2;
	private JLabel label_GuyDownOblivion;
	
	private String[] menuButtonTitle;
	
	private ShortcutMethods ShortcutMethods=new ShortcutMethods();
	private static TesterForData testLand;

	
	public menuDisplayGUI()//constructor
	        { 
	        	super("Menu Display");
	        	
	        	
	        	addPanels();
	        	
	        	addActionListeners();
	        }
			
			public void addPanels()
			{
	        	font_Dialog_50= new Font("Dialog", Font.BOLD, 50);
	        	choiceButtonsFont=ShortcutMethods.font4;
	        	 
	        	layout1_Spring=new SpringLayout();
	        	layout1_Flow=new FlowLayout();
	        	
	        	//menuPanel
		        	menuPanel=new JPanel(layout1_Spring);
		        	menuPanel.setPreferredSize(new Dimension(300,300));

		        	
		        	menuButtonTitle=new String[numButtons];
		        	menuButtonTitle[0]="Guide";
		        	menuButtonTitle[1]="Start";
		        	menuButtonTitle[2]="Highscore";
		        	menuButtonTitle[3]="play Console";
		        	menuButtonTitle[4]="Test Simulation";
		        	menuButtonTitle[5]="Exit";
		        	
		        	choiceButtons=new JButton[numButtons];
		        	for (int i=0;i<numButtons;i++)
		        	{
		        		choiceButtons[i]=new JButton((i+1)+"-"+menuButtonTitle[i]);
		        		choiceButtons[i].setPreferredSize (new Dimension(choiceButtonsSize,choiceButtonsSize/4));
		        		choiceButtons[i].setFont(choiceButtonsFont);
		        		menuPanel.add(choiceButtons[i]);
		        	}
		        	layout1_Spring.putConstraint(SpringLayout.NORTH, choiceButtons[0], 30, SpringLayout.NORTH, menuPanel );
    				layout1_Spring.putConstraint(SpringLayout.WEST, choiceButtons[0], 20, SpringLayout.WEST, menuPanel );
    				
    				layout1_Spring.putConstraint(SpringLayout.NORTH, choiceButtons[1], 30, SpringLayout.NORTH, menuPanel );
    				layout1_Spring.putConstraint(SpringLayout.WEST, choiceButtons[1], 283, SpringLayout.WEST, menuPanel );
    				
    				layout1_Spring.putConstraint(SpringLayout.NORTH, choiceButtons[2], 70, SpringLayout.NORTH, menuPanel );
    				layout1_Spring.putConstraint(SpringLayout.WEST, choiceButtons[2], 20, SpringLayout.WEST, menuPanel );
    				
    				layout1_Spring.putConstraint(SpringLayout.NORTH, choiceButtons[3], 30, SpringLayout.NORTH, menuPanel );
    				layout1_Spring.putConstraint(SpringLayout.WEST, choiceButtons[3], 545, SpringLayout.WEST, menuPanel );
    				
    				layout1_Spring.putConstraint(SpringLayout.NORTH, choiceButtons[4], 70, SpringLayout.NORTH, menuPanel );
    				layout1_Spring.putConstraint(SpringLayout.WEST, choiceButtons[4], 283, SpringLayout.WEST, menuPanel );
    				
    				layout1_Spring.putConstraint(SpringLayout.NORTH, choiceButtons[5], 70, SpringLayout.NORTH, menuPanel );
    				layout1_Spring.putConstraint(SpringLayout.WEST, choiceButtons[5], 545, SpringLayout.WEST, menuPanel );
    				
	        		image_GuyDownOblivion=ShortcutMethods.createImageIcon("images/ScrapPics/guydownOblivion.GIF",
	        				"Just an intro picture to catch interest from the user");
	        		
	        		label_GuyDownOblivion=new JLabel(image_GuyDownOblivion);
	        		label_GuyDownOblivion.setOpaque(true);
	        		
	        		layout1_Spring.putConstraint(SpringLayout.NORTH, label_GuyDownOblivion, 0, SpringLayout.NORTH, menuPanel );
    				layout1_Spring.putConstraint(SpringLayout.WEST, label_GuyDownOblivion, 20, SpringLayout.WEST, menuPanel );
	        		
	        		menuPanel.add(label_GuyDownOblivion);
        		//end menuPanel
	        		
		        //sidePanelLeft
	        		sidePanelLeft=new JPanel();
	        		sidePanelLeft.setSize(100,windowYpixels);
	        		image_Pillar=ShortcutMethods.createImageIcon("images/Parts/pillar.GIF",
    				"Just an SIDE picture to catch interest from the user");
		    		label_SideImage=new JLabel(image_Pillar);
		  
		    		sidePanelLeft.add(label_SideImage);
		        	
        		//end sidePanelLeft
		    		
			    //sidePanelRight
	        		sidePanelRight=new JPanel();
	        		sidePanelRight.setSize(100,windowYpixels);
	        		image_Pillar=ShortcutMethods.createImageIcon("images/Parts/pillar.GIF",
    				"Just an SIDE picture to catch interest from the user");
		    		label_SideImage2=new JLabel(image_Pillar);
		  
		    		sidePanelRight.add(label_SideImage2);
		        	
        		//end sidePanelRight
	        		
	        		
        		//picPanel
		        	picPanel=new JPanel(layout1_Flow);
		        	picPanel.setVisible(true);	
		        	picPanel.setSize(400,300);
		        	
	        		image_Intro=ShortcutMethods.createImageIcon("images/Parts/Colosseum.GIF",
	        				"Just an intro picture to catch interest from the user");  
		        	label_Intro=new JLabel(image_Intro);


	        		
	        		label_IntroTitle=new JLabel("The Arena");
	        		label_IntroTitle.setFont(font_Dialog_50);
	        		
	        		picPanel.add(label_Intro);
	        		picPanel.add(label_IntroTitle);
	        		
        		//end picPANEL 
        		
	        		
	        	//testerScene Panel
//	        		private JPanel testerScene;
//	        		private int numInputsTesterScene=8;
//	        		private JLabel testerInfo;
//	        		private JLabel[] inputInfoLabel;
//	        		private JTextField[] inputInfo;
//	        		private JButton submitTester;
//	        		private ImageIcon testerBackgroundImage;
//	        		private JLabel testerBackground;
	        		
	        		testerScene=new JPanel(layout1_Flow);
	        		testerScene.setVisible(false);	
	        		testerScene.setPreferredSize(new Dimension(300,300));
	        		
	        		
	        		

	        		testerBackgroundImage=ShortcutMethods.createImageIcon("images/scrapPics/testerScenePic.GIF",
	        				"Just a background picture to catch interest from the user");  
		        	testerBackground=new JLabel(testerBackgroundImage);
		        	testerScene.add(testerBackground);
		        	
	        		testerInfo=new JLabel("WELCOME, THIS IS TO GENERATE THE RESULT FROM YOUR INPUTS");
		        	testerInfo.setFont(ShortcutMethods.font2);
		        	testerScene.add(testerInfo);
		        	
		        	inputInfoLabel=new JLabel[numInputsTesterScene];
		        	inputInfo=new JTextField[numInputsTesterScene];
		        	for (int i=0;i<numInputsTesterScene;i++)
		        	{
		        		inputInfo[i]=new JTextField("<number only>");
		        		inputInfo[i].setPreferredSize (new Dimension(((int)(choiceButtonsSize*2.5)),choiceButtonsSize/6));
		        		inputInfo[i].setFont(ShortcutMethods.font2);
		        		testerScene.add(inputInfo[i]);
		        		
		        		inputInfoLabel[i]=new JLabel((i+1)+"-"+inputInfoLabelTitle[i]);
		        		inputInfoLabel[i].setPreferredSize (new Dimension(choiceButtonsSize,choiceButtonsSize/6));
		        		inputInfoLabel[i].setFont(ShortcutMethods.font2);
		        		testerScene.add(inputInfoLabel[i]);
		        	}
		        	submitTester=new JButton(">TEST!<");
		        	testerScene.add(submitTester);
		        	returnToMenu=new JButton("<--RETURN");
		        	testerScene.add(returnToMenu);
		        	
		        	testerInfoArea=new JTextArea("<Result Here>\n" +
		        			"Here is a list for the input below(use scrollbar):\n\nRACES:\n1-Bosmer\n2-GreenNeck\n3-Huang\n4-Imperial\n5-Khajiit\n6-Nord\n7-Orc" +
		        			"\n\nWEAPONS:\n1.Greataxe\n2.Longsword\n3.Short Spear" +
						"\n4.Shortsword\n5.Steel Crossbow\n6.Tomhawk\n7.War Hammer\n8.Wooden Bat\n9.Yew LongBow"+
		        			"\n\nARMOUR:\n1.IronPlatedArmour\n2.IronHelmet\n3.LeatherBoots\n4.VikingShield\n<Result will be displayed here>\n");
		        	scrollPane1=new JScrollPane(testerInfoArea);
		        	scrollPane1.setPreferredSize(new Dimension(480-1,70));
		        	testerScene.add(scrollPane1);

	        	//end testerScene Panel
	
        		this.add(picPanel, BorderLayout.NORTH);
	        	this.add(menuPanel, BorderLayout.CENTER);
	        	this.add(sidePanelLeft, BorderLayout.WEST);
	        	this.add(sidePanelRight, BorderLayout.EAST);
	        	
	        	
	        	menuPanel.setVisible(true);
	        	
	        	repaint();
			}
			
			public void addActionListeners()
			{
				for (int i=0;i<numButtons;i++)
	        	{
	        		choiceButtons[i].addActionListener(this);
	        	}
				returnToMenu.addActionListener(this);
				submitTester.addActionListener(this);
			}
	        
////////////////////////////////////////////////////////////////////////////////////
//The following is to set the gui visibility to true
////////////////////////////////////////////////////////////////////////////////////
	        public void displayGUI()
	        {
	        	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            this.setVisible(true); //makes frame visible
	            this.setSize(windowXpixels,windowYpixels);
	        }
	        public void hideGUI()
	        {
	            this.setVisible(false); //makes frame visible
	        }

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				repaint();
				if (e.getSource()==choiceButtons[0])
				{	 
////////////////////////////////////////////////////////////////////////////////////
//This looks like a lot, but this is actually just displaying the instructions
////////////////////////////////////////////////////////////////////////////////////
					JOptionPane.showMessageDialog(this,
							"	Welcome to the The Arena Game...\n" +
							"\nClick 2 to play\n"+"\nYou can also test two contestants by going to test simulation\n"
									+"\nThe Arena game is a role-playing fighting game that pits mythical races against " +
									"\neach other in a dual to determine who the victor is. " +
									"\nA role-playing game (RPG) is a game in which players assume the roles of characters in a fictional setting." +
									" \nThe entire game is displayed on a GUI, but the actual fighting output information will be text-based," +
									"\n NOT animation, since that would take a tremendous amount of time."+
							"\nPRESS OK, to continue", "Info and Instructions", 
							JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(this,
							
							"Always remeber that your far left side, that tool bar panel, below the pillar," +
							"\nis crucial for changing scenese. At first, you will need to choose your race," +
							"\nfrom the array of radio buttons"+
							"\nPRESS OK, to continue", "Info and Instructions", 
							JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(this,
							
							"Then you are sent to your room, where you can perform different actions, " +
							"\n such as eating or working out. This can be started by clicking the do something button." +
							"\nThe activities(except sleep) all cost money, but the amount depends" +
							"\n on the type of preparation."+
							"\nThen once you are satisfied or broke" +
							"\nclick the ==> to continue to the shop"+
							"\nPRESS OK, to continue", "Info and Instructions", 
							JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(this,
							
							"Next you are at the shop. You must have a weapon to enter the arena"+
							"\nYou don't need armour. 1-9 are weapons, and 10-13 are armour options."+
							"\nYou can only equip 1 weapon at a time, and 1 piece of armour at a time."+
							"\nYou cannot equip a weapon unless you already bought it, which will be indicated"+
							"in the equipment list. Lastly, to select a weapon, DON'T click the list,"+
							"\nYou must type the appropriate number like 4 as in shortsword," +
							"\nthen click buy, then click equip"+
							"\nWhen you are done, click  ==>"+
							"\nPRESS OK, to continue", "Info and Instructions", 
							JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(this,
							
							"Then you are at the dual simulation section"+
							"\nYou are the left side, and the enemy is on the right side"+
							"\nThis is a turn based game like chess, who goes first depends" +
							"\non who has the greater speed. Then when it's your turn, select your move"+
							"\nRight after you select, its your enemy's turn. It would take less than a second"+
							"\n because I can't have a thread/timer. Basically if you make your move, the enemy" +
							"\nwill then make his move, and it will be displayed in the center in green text. "+
							"\nThen you can continue. 2 most cruical variables to remeber are health and stamina"+
							"\nHealth is crucial. If yours reach 0, you lose; if the enemy's reach 0, you win basically"+
							"\nStamina is the second important factor, every move you chose will affect your remaining stamina"+
							"\nSome times more energy than others. DO NOTHING will restore 30 stamina"+
							"\nThere are so many more variables, but I will let you to figure out the rest!"+
							
							"\nPRESS OK, to continue", "Info and Instructions", 
							JOptionPane.PLAIN_MESSAGE);
					
					JOptionPane.showMessageDialog(this,
							
							"\nIf you won, you will loot the enemy's pocket cash,and you will be sent back to your room. " +
							"\nthen you can continue. Every time you win," +
							"\nthe amount of victories you have obtained will add by 1. This is basically a record for"
							+"\nyour highscore."+"If you Die, then well, your $$ turns back to zero,"+
							"\nbut you get to keep your skill levels and equipment, but playerVictory resets to zero."+
							"\nNo matter what, after each battle, your health and stamina restores to default"+
							
							"\nPRESS OK, to continue", "Info and Instructions", 
							JOptionPane.PLAIN_MESSAGE);
					
					JOptionPane.showMessageDialog(this,
							
							"\nThis game is made by Ankun Fang, " +
							"\nand all pictures are from skyrim.wiki.com"+
							
							"\nPRESS OK, to continue", "Info and Instructions", 
							JOptionPane.PLAIN_MESSAGE);
				}
				
				
				else if (e.getSource()==choiceButtons[1])
				{	 

					
					TheArenaGameGUI unit1=new TheArenaGameGUI();
					unit1.displayGUI();					
				}
				else if (e.getSource()==choiceButtons[2])
				{	 
					JOptionPane.showMessageDialog(this,
							"	Click ok to continue\n" +
							"\n"+
							"\n", "HIGHSCORE" , 
							JOptionPane.PLAIN_MESSAGE);
					try
					{
						String leadersboardInfo=ShortcutMethods.readFromTxtFile("leadersboardsData");
						if (leadersboardInfo.length()>115){leadersboardInfo=leadersboardInfo.substring(0,115)+
							"\nThe rest of the scores are useless \ncuz they are too low to be on";}
						JOptionPane.showMessageDialog(this,
								"	VOLA, here ya go:\n" +
								leadersboardInfo+"\nClick ok to continue\n" +
								"\n"+
								"\n", "HIGHSCORE" , 
								JOptionPane.PLAIN_MESSAGE);
					}
					catch(Exception failedToOpen)
					{
						JOptionPane.showMessageDialog(this,
							"	Sorry file missing or corrupted" +
							"\nClick ok to continue\n" +
							"\n"+
							"\n", "ERROR" , 
							JOptionPane.PLAIN_MESSAGE);
					}
					
				}
				else if (e.getSource()==choiceButtons[3])
				{	 
	        		image_GuyDownOblivion=ShortcutMethods.createImageIcon
	    					(("images/ScrapPics/consoleVersionInfo.gif"),"console scene"); 
	        		label_GuyDownOblivion.setIcon(image_GuyDownOblivion);
	        		menuPanel.add(label_GuyDownOblivion);
		        	for (int i=0;i<numButtons;i++)
		        	{
		        		choiceButtons[i].setVisible(false);
		        	}
					JOptionPane.showMessageDialog(this,
							"	Click ok to continue\nNOW you see who is stronger.\n" +
							" Here you can input what armour what weapon and what race you want,\n" +
							" and your enemy with the same information. \n" +
							"Then you can input who many battles you wanna let them fight. \n" +
							"They will fight based on a computer AI(Artificial intelligence)\n" +
							"\n", "CONSOLE VERSION" , 
							JOptionPane.PLAIN_MESSAGE);

	        		
					ConsoleVersion.introductionMethod();
					ConsoleVersion.mainMenu();
					ConsoleVersion.endProgramMethod();
	        		image_GuyDownOblivion=ShortcutMethods.createImageIcon
	    					(("images/ScrapPics/guyDownOblivion.GIF"),"console");    	
	        		label_GuyDownOblivion.setIcon(image_GuyDownOblivion);
	        		menuPanel.add(label_GuyDownOblivion);
		        	for (int i=0;i<numButtons;i++)
		        	{
		        		choiceButtons[i].setVisible(true);
		        	}
	        		repaint();

				}
				else if (e.getSource()==choiceButtons[4])
				{	 
					JOptionPane.showMessageDialog(this,
							"	Click ok to continue\n" +
							"\n"+
							"\n", "Test Simulation" , 
							JOptionPane.PLAIN_MESSAGE);
					testerScene.setVisible(true);
					menuPanel.setVisible(false);
					picPanel.setVisible(false);
		        	this.add(testerScene, BorderLayout.CENTER);

				}
				else if (e.getSource()==choiceButtons[5])
				{	 
					JOptionPane.showMessageDialog(this,
							"			BYE\n" +
							"\n"+
							"\n", "THANKS" , 
							JOptionPane.PLAIN_MESSAGE);
					hideGUI();
					System.exit(0);
				}
				else if (e.getSource()==returnToMenu)
				{
					testerScene.setVisible(false);
					menuPanel.setVisible(true);
					picPanel.setVisible(true);
		        	this.add(menuPanel, BorderLayout.CENTER);
				}
				else if(e.getSource()==submitTester)
				{
					try
					{

						int myRace,myWeapon,myArmour;
						int enemyRace,enemyWeapon,enemyArmour;
						
						myRace=Integer.parseInt(inputInfo[0].getText());
						myWeapon=Integer.parseInt(inputInfo[1].getText());
						myArmour=Integer.parseInt(inputInfo[2].getText());
						
						enemyRace=Integer.parseInt(inputInfo[3].getText());
						enemyWeapon=Integer.parseInt(inputInfo[4].getText());
						enemyArmour=Integer.parseInt(inputInfo[5].getText());
						

						int howManyTimes=Integer.parseInt(inputInfo[6].getText());
						int myDistance=Integer.parseInt(inputInfo[7].getText());
						if ((myRace<gameObjects.numRaces+1)&&(enemyRace<gameObjects.numRaces+1))
						{
								if (myDistance>=5&&myDistance<=500)
								{
									JOptionPane.showMessageDialog(this,
											"	Note that if weapons and armour exceed list range,\n" +
									"the simulator would consider the input as 0, which means empty\n" +
									"And if you have no weapon, haha, then your toasted.." +
									"\nClick ok to continue\n" +
											"\n"+
											"\n", "Test Simulation" , 
											JOptionPane.PLAIN_MESSAGE);
									
									testerInfoArea.setText("WELCOME TO TEST, THIS WILL GENERATE\n " +
											"THE RESULT OF 100 BATTLES BETWEEN THESE 2 CHARACTERS\n " +
											"WITH THEIR WEAPONS AND ARMOUR \nYour enemy is a random opponent\n");
									testLand = new TesterForData(myDistance);
									
									testLand.battleMenu(howManyTimes,myRace,myWeapon,myArmour,
									enemyRace,enemyWeapon,enemyArmour,testerInfoArea);
								}
								else
								{
									JOptionPane.showMessageDialog(this,
											"			Sorry, your distance must be from 5-500 feet\n" +
											"\n"+
											"\n", "OPPS" , 
											JOptionPane.PLAIN_MESSAGE);
								}
						}
						else
						{
							JOptionPane.showMessageDialog(this,
									"			Sorry, your race Info is invalid\nPlz input the proper range" +
									"\n"+
									"\n", "OPPS" , 
									JOptionPane.PLAIN_MESSAGE);
						}
					}
					catch (Exception invalidInput)
					{
						JOptionPane.showMessageDialog(this,
								"			Sorry, this is invalid\n" +
								"\n"+
								"\n", "OPPS" , 
								JOptionPane.PLAIN_MESSAGE);
					}
				}
				
				repaint();
			}
	        
	        
}


