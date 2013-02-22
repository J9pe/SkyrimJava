package Section1_GUI_Interface;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Equipment.IronBodyArmour;
import Equipment.IronHelmet;
import Equipment.LeatherBoots;
import Equipment.VikingShield;
import Section2_Preparation.Contestant;
import Section2_Preparation.RandomArenaMessageGenerator;
import Section3_DuelSimulation.BattleFieldGUIDealer;
import Utilities.ShortcutMethods;
import Utilities.gameObjects;
	

@SuppressWarnings("serial")
public class TheArenaGameGUI extends JFrame implements ActionListener, MouseListener{
	
	
	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: tired
	 * ##############################################################################################
	*/ 
////////////////////////////////////////////////////////////////////////////////////
//The following is a GUI to display the main game, it has different scenes
//First is the race selector scene, then its the preparation scene, then it is the shop
//scene, and then its the dual simulation scene. If you win you go back to preparation scene,
//if you lose, you go to the 5th scene called the game over scene
//I used spring layouts for all the scenes
////////////////////////////////////////////////////////////////////////////////////
	 
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
///////
//Below is creating all the variables and constants
///////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	final private int windowXPixels=1000; 
	final private int windowYPixels=700; 

	final private int toolButtonsSize=200;
	final private Font toolButtonsFont=ShortcutMethods.font7;
	
	final private int toolButtonsSizeForToolBarScene4=280;
	final private Font toolButtonsFontForToolBarScene4=ShortcutMethods.font2;
	
	final private int toolButtonsSizeplayerOffenceButtons=280;
	final private Font toolButtonsFontplayerOffenceButtons=ShortcutMethods.font2;


	
	final private int numtoolButtons=4;
	final private int numScenes=4;
	final private int numtoolButtonsForToolBarScene4=6;
	final private int numButtonsForPlayerMoves=5;
	
	//The Races Name //alphabetical
	private String[] raceRadioSelectionText={"blood","BIT","bosmer","darkman","green neck","huang","imperial","khajiit","nord","stickman","orc","cheetaman"};//alphabetical
	   
	//The Weapons Name //alphabetical
	private String[] weaponsTextFieldSelectionText={"Great Axe","Longsword","Short Spear","Shortsword","Steel Crossbow","Tomhawk","War Hammer","FREE wood stick",
			"Yew Longbow","Matchlock Musket","repeatingCrossbow","SimpleBow","TurkishBow","Nest of Bees arrow launcher", "Atlatl", "Daggers", "Javelins", "Pilum", "FREE Sling", "Throwing Knife"
					,"Throwing Stars", "Baseball Bat", "Dao", "Broadsword", "Steel Claymore", "Katana", "Pike", "Lance", "Halberd", "Nunchucks", "Morning Star", "Compound Bow",
					"Pump Shotgun", "Nuke Launcher", "Mauser Bolt Action Rifle", "RPG Launcher", "M9 Pistol", "AK47", "M4A1", "M60", "Type 56", "MP5", "Barrett 50 Cal.","m16"
					,"use fist", "use claw"}; //alphabetical for original, then updated after
	
	//The armour Name //alphabetical
	private String[] armourTextFieldSelectionText={"Iron Body Armour","IronHelmet","LeatherBoots","VikingShield","puffyArmour","ElectroArmour","AquaArmour","ForestArmour","CardboardArmour"}; //alphabetical
	
	
	//The Races Name Description
	private String[] raceNameDescription=new String[gameObjects.numRaces];
	
	//The Races Portrait Path
	private String[] racePortraitPath={"images/PortraitOblivion/BloodPort.GIF","images/PortraitOblivion/BitPort.GIF","images/PortraitOblivion/BosmerPort.GIF","images/PortraitOblivion/DarkmanPort.GIF","images/PortraitOblivion/GreenNeckPort.GIF" ,
			"images/PortraitOblivion/HuangPort.GIF","images/PortraitOblivion/ImperialPort.GIF","images/PortraitOblivion/KhajiitPort.GIF",
			"images/PortraitOblivion/NordPort.GIF","images/PortraitOblivion/StickmanPort.GIF","images/PortraitOblivion/OrcPort.GIF","images/PortraitOblivion/CheetamanPort.GIF"};
	//The Equipment Portrait Path
	private String[] equipmentPortraitPath={"images/PortraitEquipment/greatAxePort.GIF","images/PortraitEquipment/longSwordPort.GIF" ,
			"images/PortraitEquipment/shortSpearPort.GIF","images/PortraitEquipment/shortSwordPort.GIF","images/PortraitEquipment/steelCrossbowPort.GIF",
			"images/PortraitEquipment/tomhawkPort.GIF","images/PortraitEquipment/warHammerPort.GIF","images/PortraitEquipment/woodenStickPort.GIF",
			"images/PortraitEquipment/YewLongbowPort.GIF","images/PortraitEquipment/matchlockMusketPort.GIF","images/PortraitEquipment/repeatingCrossbow.GIF","images/PortraitEquipment/simpleBowPort.GIF","images/PortraitEquipment/turkishBowPort.GIF","images/PortraitEquipment/arrowLauncherPort.GIF","images/PortraitEquipment/atlatlPort.GIF","images/PortraitEquipment/daggerPort.GIF","images/PortraitEquipment/javelinPort.GIF","images/PortraitEquipment/pilumPort.GIF","images/PortraitEquipment/slingPort.GIF",
			"images/PortraitEquipment/throwingKnifePort.GIF","images/PortraitEquipment/throwingStarPort.GIF","images/PortraitEquipment/baseballBatPort.GIF","images/PortraitEquipment/daoPort.GIF","images/PortraitEquipment/broadSwordPort.GIF","images/PortraitEquipment/steelClaymorePort.GIF","images/PortraitEquipment/katanaPort.GIF","images/PortraitEquipment/pikePort.GIF","images/PortraitEquipment/lancePort.GIF","images/PortraitEquipment/halberdPort.GIF","images/PortraitEquipment/nunchucksPort.GIF",
			"images/PortraitEquipment/morningStarPort.GIF","images/PortraitEquipment/compoundBowPort.GIF",
			"images/PortraitEquipment/pumpShotgunPort.GIF","images/PortraitEquipment/nukeLauncherPort.GIF","images/PortraitEquipment/mauserPort.GIF",
			"images/PortraitEquipment/rpgPort.GIF","images/PortraitEquipment/m9Port.GIF","images/PortraitEquipment/ak47Port.GIF",
			"images/PortraitEquipment/m4a1Port.GIF","images/PortraitEquipment/m60Port.GIF","images/PortraitEquipment/type56Port.GIF",
			"images/PortraitEquipment/mp5Port.GIF","images/PortraitEquipment/barret50CalPort.GIF","images/PortraitEquipment/m16Port.GIF","images/PortraitEquipment/genericPort.GIF",
			"images/PortraitEquipment/clawPort.GIF",
			
			"images/PortraitEquipment/ironBodyArmourPort.GIF","images/PortraitEquipment/ironHelmetPort.GIF","images/PortraitEquipment/leatherBootsPort.GIF",
			"images/PortraitEquipment/vikingShieldPort.GIF","images/PortraitEquipment/puffyArmourPort.GIF","images/PortraitEquipment/electroArmourPort.GIF",
			"images/PortraitEquipment/aquaArmourPort.GIF","images/PortraitEquipment/forestArmourPort.GIF","images/PortraitEquipment/cardboardArmourPort.GIF"};
	
	//storing data
	private int raceSelectedNum=0;
	public void setRaceSelectedNum(int raceSelectedNum) {
		this.raceSelectedNum = raceSelectedNum;
	}

	public int getRaceSelectedNum() {
		return raceSelectedNum;
	}
	
	private int weaponEquippedNum=0;
	public void setweaponEquippedNum(int weaponEquippedNum) {
		this.weaponEquippedNum = weaponEquippedNum;
	}

	public int getweaponEquippedNum() {
		return weaponEquippedNum;
	}

	private int armourEquippedNum=0;
	public void setarmourEquippedNum(int armourEquippedNum) {
		this.armourEquippedNum = armourEquippedNum;
	}

	public int getarmourEquippedNum() {
		return armourEquippedNum;
	}

	
	public int enemyRace;
	public int enemyWeapon;
	public int enemyArmour;
	
	//scroll PANE
	private JScrollPane scrollPane;
	private JScrollPane scrollPane2;
	private JScrollPane scrollPane3;
	
	//tool buttons
	private JButton[] toolButtons;

	//String for button array
	private String[] toolButtonroomActionsButtonsTitle;

	
	//frame panels (always existing)
	private JPanel sidePanelLeft;
	private JPanel sidePanelRight;
	private JPanel toolBarBottomScene4;
	
	//scene panels
	private JPanel raceSelectorPanel;
	private JPanel preparationScenePanel;
	private JPanel shopScenePanel;
	private JPanel duelSimulationScenePanel;
	private JPanel gameOverPanel;
	
	
	//additional panels
	private JPanel playerMovesPanel;
	private JPanel roomActionsBox;
	
	//key Components for Scenes
	
	
		//scene1
		private JLabel raceSelectorroomActionsButtonsTitleLabel;
		private JTextArea raceSelectorDescriptionTextArea;
		private JRadioButton[] raceRadioSelection= new JRadioButton[gameObjects.numRaces];//
		private JLabel nextPanelHint;
		
		//scene2
		private JLabel yourRoomLabel;
		private JLabel roomNoticeLabel;
		private ImageIcon yourRoomBackground;
		private JLabel yourRoomBackgroundLabel;
		private JTextArea bulletinBoard;

		private JButton revealRoomActionsBox;
		private String[] roomActionsButtonsTitle={"EAT","SLEEP","WORKOUT","STUDY",
				"BREAD","FRUITS","MEAT",
				"ONE DAY",
				"STRENGTH TRAINING","CARDIO TRAINING","WEAPON HANDLING",
				"COMBAT BOOKS","AGILITY BOOKS","PSYCHOLOGY BOOKS",""};
		private int numRoomActionsButtons=14;
		private JButton[] roomActionsButtons=new JButton[numRoomActionsButtons];

		private int increaserValue=1;
		
		//scene3
		private JLabel shopSceneroomActionsButtonsTitleLabel;
		private JTextArea shopSceneStoreTextArea;
		private JTextArea shopSceneEquipmentDescriptionTextArea;
		private JTextField shopChoiceSelectorTextField;
		private JButton equipButton;
		private JLabel youCanClickConfirmLabel;
		private JButton buyButton;
		private JButton lookButton;
		private JLabel shopPicLabel;
		private ImageIcon duelSimulationPic;
		private JLabel duelSimulationPicLabel;
		private JLabel nextSceneNotice;
		
		
		//scene4
		private JLabel playerHealth;
		private JLabel enemyHealth;
		
		private JLabel playerStamina;
		private JLabel enemyStamina;
		
		private JLabel distanceLabel;
		private JButton distanceBar;
		
		
		private JTextArea combatInfo;
		private JTextArea fightingStatusInfo;
		private JTextArea judgeInfo;
		private BattleFieldGUIDealer battlefield1;
		private JButton iAmReadyButton;
		private JLabel playerPortraitScene4;
		private JLabel enemyPortraitScene4;
		private JLabel playerWPortraitScene4;
		private JLabel enemyWPortraitScene4;
		private JLabel playerAPortraitScene4;
		private JLabel enemyAPortraitScene4;

		private JButton[] toolButtonsForToolBarScene4;
		private JButton[] playerOffenceButtons;
		private String[] toolButtonsScene4;
		private String[] playerOffenceButtonsroomActionsButtonsTitle;
		
		//scene5
		private JLabel youDieInfo;
		private JLabel failPicture;
		private ImageIcon youDiePic;
		private JButton exitScene5;
		private JButton returnScene5;
		

	//ImageIcon
	private ImageIcon image_Pillar;
	private ImageIcon racePortrait;
	private ImageIcon weaponPortrait;
	private ImageIcon armourPortrait;
	private ImageIcon shopPic;
	
	//Layouts
	private SpringLayout layout1_Spring;
	
	//Labels
	private JLabel moneyData;//on side 2
	private JLabel sceneNumLabel;//2nd side
	private JLabel label_SideImage;
	private JTextArea speechArea;

	private JLabel label_RacePortrait;
	private JLabel label_RacePortraitroomActionsButtonsTitle;//below the RacePortrait label

	private JLabel label_weaponPortrait;
	private JLabel label_weaponPortraitroomActionsButtonsTitle;//below the WeaponPortrait label

	private JLabel label_armourPortrait;
	private JLabel label_armourPortraitroomActionsButtonsTitle;//below the ArmourPortrait label
	
	//Other
	private ShortcutMethods forAreanaGameGUI=new ShortcutMethods();
	private RandomArenaMessageGenerator generator1=new RandomArenaMessageGenerator();
	private int sceneNum=0;
	public int getsceneNum() 
	{
		return sceneNum;
	}
	
	public void setsceneNum(int sNum) 
	{
		this.sceneNum = sNum;
	}
	private boolean fightingModeStill=false;
	
	private boolean[] boughtThisEquipment= 
		new boolean [gameObjects.numWeapons+gameObjects.numArmour+1];
	
	private boolean allowToSceneFour=false;
	int userSelectedMove=0;
	int xMoveequipButtonButton=5;
	private boolean toolButtonClickedWhileFighting=false;
	private boolean samePlayer=false;
	private boolean playerGoFirst=false;
	private boolean playerTurnStill;
	
	static public int playerVictories=0;
	
	int[] increasePlayerDataByTen=new int [numRoomActionsButtons] ;
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
///////
//Above was creating all the variables and constants
///////
///////
//Below is mainly dealing with the visual look and adding panels to the game, all isVisible(false) except
//The first one
///////Basically I am starting to create scenes using panels now
///////
//The methods below require the methods Shortcut Methods
///////
///////
//
///////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Constructor
	public TheArenaGameGUI()
	     { 	
	    	super("Main Game");
	        		            
	     	addPanels();
	        	
	        addActionListeners();
	        
	        addMouseListeners();
	     }
	
	
			
	public void addPanels()
		{
		 	layout1_Spring=new SpringLayout();
		 	
		 	//The following below will all user layout1_Spring for their inner Components and Panels
	        addotherGUIpanels();
	        addGUISideBars();
    		addSceneOnePanel();
    		addSceneTwoPanel();
	        addSceneThreePanel();
	    	addSceneFourPanel();
	    	addSceneFivePanel();
			panelOrganiserOnThis();
	        sceneInitiator();
	    }
	
	
		public void  addotherGUIpanels()
		{
			
			
			//toolBarBottomScene4
			toolBarBottomScene4=new JPanel();
			toolBarBottomScene4.setSize ((windowXPixels-50),(windowYPixels*15/100));
			toolBarBottomScene4.setVisible(false);//only scene 3 makes this visible = true
			//adding tool Buttons 
			toolButtonsScene4=new String[numtoolButtonsForToolBarScene4];
			toolButtonsScene4[0]="ATTACK";
			toolButtonsScene4[1]="GUARD";
			toolButtonsScene4[2]="CHARGE";
			toolButtonsScene4[3]="REST";
			toolButtonsScene4[4]="STATUS";
			toolButtonsScene4[5]="BACK UP";
			
			toolButtonsForToolBarScene4=new JButton[numtoolButtonsForToolBarScene4];
			for (int i=0;i<numtoolButtonsForToolBarScene4;i++)
			{
				toolButtonsForToolBarScene4[i]=new JButton(toolButtonsScene4[i]);
				toolButtonsForToolBarScene4[i].setPreferredSize (new Dimension(toolButtonsSizeForToolBarScene4/(3),(toolButtonsSizeForToolBarScene4/4)));//rectangle, not square
				toolButtonsForToolBarScene4[i].setFont(toolButtonsFontForToolBarScene4);
				toolButtonsForToolBarScene4[i].setBackground(Color.black);
				toolButtonsForToolBarScene4[i].setForeground(Color.CYAN);
				toolBarBottomScene4.add(toolButtonsForToolBarScene4[i]);
			}
			repaint();
			
			//end  toolBarBottomScene4	
			
			// playerMovesPanel
			playerMovesPanel=new JPanel();
			playerMovesPanel.setSize ((windowXPixels-50),(windowYPixels*15/100));
			playerMovesPanel.setVisible(false);//only scene 3 makes this visible = true
			//adding tool Buttons d
			 playerOffenceButtonsroomActionsButtonsTitle=new String[numButtonsForPlayerMoves];
			 playerOffenceButtonsroomActionsButtonsTitle[0]="SLASH";
			 playerOffenceButtonsroomActionsButtonsTitle[1]="STAB";
			 playerOffenceButtonsroomActionsButtonsTitle[2]="CRUSH";
			 playerOffenceButtonsroomActionsButtonsTitle[3]="SHOOT/THROW";
			 playerOffenceButtonsroomActionsButtonsTitle[4]="Cancel";
			
			playerOffenceButtons=new JButton[numButtonsForPlayerMoves];
			for (int i=0;i< numButtonsForPlayerMoves;i++)
			{
				playerOffenceButtons[i]=new JButton(playerOffenceButtonsroomActionsButtonsTitle[i]);
				playerOffenceButtons[i].setPreferredSize 
					(new Dimension(toolButtonsSizeplayerOffenceButtons/2,(toolButtonsSizeplayerOffenceButtons/4)));//rectangle, not square
				playerOffenceButtons[i].setFont(toolButtonsFontplayerOffenceButtons);
				playerOffenceButtons[i].setBackground(Color.black);
				playerOffenceButtons[i].setForeground(Color.yellow);
				playerMovesPanel.add(playerOffenceButtons[i]);	
			}
		
			repaint();
			//end playerMovesPanel

		}
		
		public void addGUISideBars()
		{
			//sidePanelLeft
    		sidePanelLeft=new JPanel();
    		sidePanelLeft.setPreferredSize (new Dimension(100,windowYPixels-100));
    		image_Pillar=forAreanaGameGUI.createImageIcon("images/Parts/pillar.GIF",
			"Just an SIDE picture to catch interest from the user");
    		label_SideImage=new JLabel(image_Pillar);
    		sidePanelLeft.add(label_SideImage);
    		//adding tool Buttons 
    		toolButtonroomActionsButtonsTitle=new String[numtoolButtons];
        	toolButtonroomActionsButtonsTitle[0]="<==";
        	toolButtonroomActionsButtonsTitle[1]="==>";
        	toolButtonroomActionsButtonsTitle[2]="INFO";
        	toolButtonroomActionsButtonsTitle[3]="BYE";
        	
        	toolButtons=new JButton[numtoolButtons];
        	for (int i=0;i<numtoolButtons;i++)
        	{
        		toolButtons[i]=new JButton(toolButtonroomActionsButtonsTitle[i]);
        		toolButtons[i].setPreferredSize (new Dimension(toolButtonsSize/2,(toolButtonsSize/4)));//rectangle, not square
        		toolButtons[i].setFont(toolButtonsFont);
        		sidePanelLeft.add(toolButtons[i]);
        	}
        	repaint();
    		
        	//end sidePanelLeft
    		
        	//sidePanelRight
    		sidePanelRight=new JPanel();
    		sidePanelRight.setPreferredSize (new Dimension(200,windowYPixels-100));
    

    	
    		label_RacePortraitroomActionsButtonsTitle=new JLabel("unknown Race");
    		label_RacePortraitroomActionsButtonsTitle.setFont(ShortcutMethods.font2);
    		sidePanelRight.add(label_RacePortraitroomActionsButtonsTitle);	
    		
    		label_weaponPortraitroomActionsButtonsTitle=new JLabel("no weapon");
    		label_weaponPortraitroomActionsButtonsTitle.setFont(ShortcutMethods.font2);
    		sidePanelRight.add(label_weaponPortraitroomActionsButtonsTitle);
    		
    		label_armourPortraitroomActionsButtonsTitle=new JLabel("no armour");
    		label_armourPortraitroomActionsButtonsTitle.setFont(ShortcutMethods.font2);
    		sidePanelRight.add(label_armourPortraitroomActionsButtonsTitle);
    		
    		moneyData=new JLabel("My $:"+"null");
    		moneyData.setFont(ShortcutMethods.font5);
    		moneyData.setForeground(ShortcutMethods.forestGreen);
    		sidePanelRight.add(moneyData);
    		
    		sceneNumLabel=new JLabel("Scene:"+sceneNum);
    		sceneNumLabel.setFont(ShortcutMethods.font5);
    		sidePanelRight.add(sceneNumLabel);
    		
    		
    		racePortrait=forAreanaGameGUI.createImageIcon("images/PortraitOblivion/GenericPort.GIF", "Race Portrait");
    		label_RacePortrait=new JLabel(racePortrait);
    		sidePanelRight.add(label_RacePortrait);


    		weaponPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort.GIF", "Weapon Portrait");
    		label_weaponPortrait=new JLabel(weaponPortrait);
    		sidePanelRight.add(label_weaponPortrait);



    		armourPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort2.GIF", "Armour Portrait");
    		label_armourPortrait=new JLabel(armourPortrait);
    		sidePanelRight.add(label_armourPortrait);



    		repaint();
    		//end sidePanelRight    
    		

		}

		
		public void addSceneOnePanel()
		{
			//raceSelectorPanel--scene1 
	    	raceSelectorPanel=new JPanel(layout1_Spring);
	    	raceSelectorPanel.setVisible(false);
	    	raceSelectorPanel.setSize (windowXPixels,windowYPixels);
	    	raceSelectorPanel.setBackground(Color.lightGray);
	    	

	    	
	    	//Radio Buttons
	    	
	    	ButtonGroup raceSelectorPanelGroup = new ButtonGroup();
	    			
	    	for (int x=0;x<gameObjects.numRaces;x++)
			{	
	    		raceRadioSelection[x]=new JRadioButton((x+1)+"-"+raceRadioSelectionText[x]);
				raceRadioSelection[x].setFont(ShortcutMethods.font1);
				raceSelectorPanelGroup.add(raceRadioSelection[x]);
				raceSelectorPanel.add(raceRadioSelection[x]);
				raceRadioSelection[x].setBackground(null);
				raceRadioSelection[x].setForeground(Color.black);
				
	    		int index=x;
				int inti=150;
				int xIncrement=220;		
				int yIncrement=50;
				
				int xvalue = inti + xIncrement * (index % 3);
				int yvalue = 80 + yIncrement * (index / 3);
				
				layout1_Spring.putConstraint(SpringLayout.WEST, raceRadioSelection[index],xvalue, SpringLayout.WEST, raceSelectorPanel );
				layout1_Spring.putConstraint(SpringLayout.NORTH, raceRadioSelection[index], yvalue, SpringLayout.NORTH, raceSelectorPanel );
				
			}
			

	    	
			//add a roomActionsButtonsTitle
			raceSelectorroomActionsButtonsTitleLabel=new JLabel("SELECT YOUR RACE BELOW");
			raceSelectorroomActionsButtonsTitleLabel.setFont(ShortcutMethods.font1);
			raceSelectorroomActionsButtonsTitleLabel.setForeground(Color.cyan);
			layout1_Spring.putConstraint(SpringLayout.WEST, raceSelectorroomActionsButtonsTitleLabel,325, SpringLayout.WEST, raceSelectorPanel );
			layout1_Spring.putConstraint(SpringLayout.NORTH, raceSelectorroomActionsButtonsTitleLabel, 35, SpringLayout.NORTH, raceSelectorPanel );
			raceSelectorPanel.add(raceSelectorroomActionsButtonsTitleLabel);
			
			//add a description box					
			raceSelectorDescriptionTextArea=new JTextArea("<Race Description>",11,10);
			raceSelectorDescriptionTextArea.setEditable(false);
			raceSelectorDescriptionTextArea.setWrapStyleWord(true);
			raceSelectorDescriptionTextArea.setFont(ShortcutMethods.font4);
			raceSelectorDescriptionTextArea.setBackground(ShortcutMethods.brown);
			raceSelectorDescriptionTextArea.setForeground(Color.white);
			raceSelectorDescriptionTextArea.setSize((windowXPixels*55/100),(int)(windowYPixels/2.2));
			
		    scrollPane = new JScrollPane(raceSelectorDescriptionTextArea);
		    scrollPane.setPreferredSize(new Dimension((windowXPixels*65/100),(int)(windowYPixels/2.2)));
		    scrollPane.setWheelScrollingEnabled(true);
			
		    raceSelectorPanel.add(scrollPane);
			
		    //add to layout
		    layout1_Spring.putConstraint(SpringLayout.WEST, raceSelectorDescriptionTextArea,180, SpringLayout.WEST, raceSelectorPanel );
			layout1_Spring.putConstraint(SpringLayout.NORTH,raceSelectorDescriptionTextArea, 300, SpringLayout.NORTH, raceSelectorPanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, scrollPane,180, SpringLayout.WEST, raceSelectorPanel );
			layout1_Spring.putConstraint(SpringLayout.NORTH,scrollPane, 300, SpringLayout.NORTH, raceSelectorPanel );
			
			//add a notice
			nextPanelHint=new JLabel("You can click ==> in the far LEFT after your done");
			nextPanelHint.setFont(ShortcutMethods.font3);
			nextPanelHint.setForeground(Color.black);
			layout1_Spring.putConstraint(SpringLayout.NORTH, nextPanelHint,640, SpringLayout.NORTH, raceSelectorPanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, nextPanelHint,105, SpringLayout.WEST, raceSelectorPanel );
			raceSelectorPanel.add(nextPanelHint);
			
	//end raceSelectorPanel
		}
		
		public void addSceneTwoPanel()
		{
			//preparationPanel--scene1 
	    	preparationScenePanel=new JPanel(layout1_Spring);
	    	preparationScenePanel.setVisible(false);
	    	preparationScenePanel.setSize (windowXPixels,windowYPixels);
	    	preparationScenePanel.setBackground(Color.black);
	    	
			//add a roomActionsButtonsTitle
			yourRoomLabel=new JLabel("Your Waiting Room:");
			yourRoomLabel.setFont(ShortcutMethods.font1);
			yourRoomLabel.setForeground(ShortcutMethods.brown);
			layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomLabel,35, SpringLayout.NORTH, preparationScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomLabel,150, SpringLayout.WEST, preparationScenePanel );
			preparationScenePanel.add(yourRoomLabel);
			
			//add a notice
			roomNoticeLabel=new JLabel("You can click ==> in the far LEFT after your done");
			roomNoticeLabel.setFont(ShortcutMethods.font3);
			roomNoticeLabel.setForeground(ShortcutMethods.brown);
			layout1_Spring.putConstraint(SpringLayout.NORTH, roomNoticeLabel,520, SpringLayout.NORTH, preparationScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, roomNoticeLabel,105, SpringLayout.WEST, preparationScenePanel );
			preparationScenePanel.add(roomNoticeLabel);
			
			//add panels
			// roomActionsBox
			roomActionsBox=new JPanel();
			roomActionsBox.setSize ((windowXPixels-50),(windowYPixels*15/100));
			
			//adding tool Buttons 
				//Action buttons
			for (int x=0;x<numRoomActionsButtons;x++)
			{
				roomActionsButtons[x]=new JButton(roomActionsButtonsTitle[x]);	
				roomActionsButtons[x].setForeground(ShortcutMethods.brown);
				roomActionsBox.add(roomActionsButtons[x]);
				roomActionsButtons[x].setVisible(false);
			}
			preparationScenePanel.add(roomActionsBox);
			roomActionsBox.setVisible(false);
			layout1_Spring.putConstraint(SpringLayout.NORTH, roomActionsBox,150, SpringLayout.NORTH, preparationScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, roomActionsBox,150, SpringLayout.WEST, preparationScenePanel );
			
			
			
				//Action buttons
			revealRoomActionsBox=new JButton("Do something");	
			revealRoomActionsBox.setFont(ShortcutMethods.font1);
			revealRoomActionsBox.setForeground(ShortcutMethods.brown);
			layout1_Spring.putConstraint(SpringLayout.NORTH, revealRoomActionsBox,235, SpringLayout.NORTH, preparationScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, revealRoomActionsBox,110, SpringLayout.WEST, preparationScenePanel );
			preparationScenePanel.add(revealRoomActionsBox);
			
			//Adding the Additional Information TextAreas
			bulletinBoard=new JTextArea("Welcome new contestant!\n"+"Below are information of daily events and results of the arena.\nClick confirm to go to shop.\n");
			bulletinBoard.setSize((windowXPixels*30/100),(int)(windowYPixels/2.8));
			bulletinBoard.setBackground(Color.black);
			bulletinBoard.setForeground(Color.green);
			bulletinBoard.setFont(ShortcutMethods.font3);
			bulletinBoard.setEditable(false);		
			bulletinBoard.setWrapStyleWord(true);
			layout1_Spring.putConstraint(SpringLayout.NORTH, bulletinBoard,420, SpringLayout.NORTH, preparationScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, bulletinBoard,570, SpringLayout.WEST, preparationScenePanel );
			
		    scrollPane3 = new JScrollPane(bulletinBoard);
		    scrollPane3.setPreferredSize(new Dimension((windowXPixels*30/100),(int)(windowYPixels/2.8)));
		    scrollPane3.setWheelScrollingEnabled(false);
			scrollPane3.getComponent(1).setBackground(ShortcutMethods.brown);//whoot this is the background of the scroll sheet
			layout1_Spring.putConstraint(SpringLayout.NORTH, scrollPane3,420, SpringLayout.NORTH, preparationScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, scrollPane3,570, SpringLayout.WEST, preparationScenePanel );
			preparationScenePanel.add(scrollPane3);
			
			yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/oldRoom.PNG", "Your Room Picture, like jail");
			yourRoomBackgroundLabel=new JLabel(yourRoomBackground);
			layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
			preparationScenePanel.add(yourRoomBackgroundLabel);
			
			
		
		}
		
		public void addSceneThreePanel()
		{
			//shopScenePanel--scene2 
			shopScenePanel=new JPanel(layout1_Spring);
			shopScenePanel.setVisible(false);
			shopScenePanel.setBackground(Color.lightGray);
			shopScenePanel.setSize (windowXPixels,windowYPixels);
			
			//add shopSceneroomActionsButtonsTitleLabel
			shopSceneroomActionsButtonsTitleLabel=new JLabel("WELCOME TO THE SHOP");
			shopSceneroomActionsButtonsTitleLabel.setForeground(Color.yellow);
			shopSceneroomActionsButtonsTitleLabel.setFont(ShortcutMethods.font1);
			
			shopSceneStoreTextArea=new JTextArea("LIST\n");
			shopSceneStoreTextArea.setSize((windowXPixels*24/100),(int)(windowYPixels/1.9));
			shopSceneStoreTextArea.setBackground(Color.black);
			shopSceneStoreTextArea.setForeground(Color.white);
			shopSceneStoreTextArea.setFont(ShortcutMethods.font1);
			//shopSceneStoreTextArea.setEditable(false);
			
			
			refreshShopDisplay();
			
			scrollPane2 = new JScrollPane(shopSceneStoreTextArea);
			scrollPane2.setPreferredSize(new Dimension((windowXPixels*24/100),(int)(windowYPixels/1.9)));
		 	scrollPane2.setWheelScrollingEnabled(true);
		 	scrollPane2.getComponent(1).setBackground(Color.black);//whoot this is the background of the scroll sheet
			  
			shopChoiceSelectorTextField=new JTextField("<YOUR COMAND HERE-NUM ONLY>");
			shopChoiceSelectorTextField.setPreferredSize(new Dimension(500,40));
			shopChoiceSelectorTextField.setBackground(ShortcutMethods.brown);
			shopChoiceSelectorTextField.setForeground(Color.white);
			shopChoiceSelectorTextField.setFont(ShortcutMethods.font1);
			
			
			//shopSceneEquipmentDescriptionTextArea
			//add a description box					
			shopSceneEquipmentDescriptionTextArea=new JTextArea("<EQUIPMENT DESCRIPTION>",11,10);
			shopSceneEquipmentDescriptionTextArea.setEditable(false);
			shopSceneEquipmentDescriptionTextArea.setWrapStyleWord(true);
			shopSceneEquipmentDescriptionTextArea.setFont(ShortcutMethods.font2);
			shopSceneEquipmentDescriptionTextArea.setBackground(ShortcutMethods.brown);
			shopSceneEquipmentDescriptionTextArea.setForeground(Color.white);
			shopSceneEquipmentDescriptionTextArea.setSize((windowXPixels*22/100),(int)(windowYPixels/2));
			
		    scrollPane = new JScrollPane(shopSceneEquipmentDescriptionTextArea);
		    scrollPane.setPreferredSize(new Dimension((windowXPixels*22/100),(int)(windowYPixels/2)));
		    scrollPane.setWheelScrollingEnabled(true);
		    
			equipButton=new JButton("Equip");
			equipButton.setSize(60,40);
			equipButton.setBackground(ShortcutMethods.brown);
			equipButton.setForeground(Color.white);
			equipButton.setFont(ShortcutMethods.font2);
			
			lookButton=new JButton("look");
			lookButton.setSize(60,40);
			lookButton.setBackground(ShortcutMethods.brown);
			lookButton.setForeground(Color.GREEN);
			lookButton.setFont(ShortcutMethods.font3);
	
			youCanClickConfirmLabel	=new JLabel("To continue, click ==> on far LEFT");
			youCanClickConfirmLabel.setVisible(false);
			youCanClickConfirmLabel.setForeground(Color.white);
			youCanClickConfirmLabel.setFont(ShortcutMethods.font1);
			

			buyButton=new JButton("Buy");
			buyButton.setSize(40,40);
			buyButton.setBackground(ShortcutMethods.brown);
			buyButton.setForeground(Color.yellow);
			buyButton.setFont(ShortcutMethods.font2);
			
			shopScenePanel.add(scrollPane);			
			shopScenePanel.add(scrollPane2);
			shopScenePanel.add(shopSceneroomActionsButtonsTitleLabel);
			shopScenePanel.add(shopChoiceSelectorTextField);
			shopScenePanel.add(equipButton);
			shopScenePanel.add(youCanClickConfirmLabel);
			shopScenePanel.add(buyButton);
			shopScenePanel.add(lookButton);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, shopSceneroomActionsButtonsTitleLabel,180, SpringLayout.WEST, shopScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,shopSceneroomActionsButtonsTitleLabel, 70, SpringLayout.NORTH, shopScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, scrollPane,423, SpringLayout.WEST, shopScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,scrollPane, 100, SpringLayout.NORTH, shopScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, scrollPane2,180, SpringLayout.WEST, shopScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,scrollPane2, 100, SpringLayout.NORTH, shopScenePanel);
			
			
			layout1_Spring.putConstraint(SpringLayout.WEST, shopChoiceSelectorTextField,140, SpringLayout.WEST, shopScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,shopChoiceSelectorTextField, 480, SpringLayout.NORTH, shopScenePanel);
		
			
			layout1_Spring.putConstraint(SpringLayout.WEST, lookButton,795, SpringLayout.WEST, shopScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,lookButton, 486, SpringLayout.NORTH, shopScenePanel);
		
			layout1_Spring.putConstraint(SpringLayout.WEST, equipButton,715, SpringLayout.WEST, shopScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,equipButton, 486, SpringLayout.NORTH, shopScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, buyButton,645, SpringLayout.WEST, shopScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,buyButton, 486, SpringLayout.NORTH, shopScenePanel);
			
			
			layout1_Spring.putConstraint(SpringLayout.WEST, youCanClickConfirmLabel,200, SpringLayout.WEST, shopScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,youCanClickConfirmLabel, 530, SpringLayout.NORTH, shopScenePanel);
			
			shopPic=forAreanaGameGUI.createImageIcon("images/ScenePics/marketplace.PNG", "Your Room Picture, like jail");
			shopPicLabel=new JLabel(shopPic);
			layout1_Spring.putConstraint(SpringLayout.NORTH, shopPicLabel,30, SpringLayout.NORTH, shopScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, shopPicLabel,100, SpringLayout.WEST, shopScenePanel );
			shopScenePanel.add(shopPicLabel);
			
			//add a notice
			nextSceneNotice=new JLabel("You can click ==> in the far LEFT after your done, BUT U NEED A WEAPON at least");
			nextSceneNotice.setFont(ShortcutMethods.font3);
			nextSceneNotice.setForeground(Color.black);
			layout1_Spring.putConstraint(SpringLayout.NORTH, nextSceneNotice,630, SpringLayout.NORTH, shopScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, nextSceneNotice,105, SpringLayout.WEST, shopScenePanel );
			shopScenePanel.add(nextSceneNotice);
			
			//end shopScenePanel--scene2
		}
		
		public void addSceneFourPanel()
		{
			//dualSimulationScenePanel--scene3 	
			duelSimulationScenePanel=new JPanel(layout1_Spring);
			duelSimulationScenePanel.setVisible(false);
			duelSimulationScenePanel.setSize (windowXPixels,windowYPixels);
			duelSimulationScenePanel.setBackground(Color.white);
			
			iAmReadyButton=new JButton("I'M READY!");
			iAmReadyButton.setBackground(Color.black);
			iAmReadyButton.setForeground(Color.WHITE);
			iAmReadyButton.setFont(ShortcutMethods.font3);
			iAmReadyButton.setVisible(true);
			
			distanceBar=new JButton("Distance Between Contestants");
			distanceBar.setBackground(Color.green);
			distanceBar.setForeground(Color.red);
			distanceBar.setFont(ShortcutMethods.font2);
			distanceBar.setPreferredSize(new Dimension(100,20));
			distanceBar.setVisible(true);
			
			combatInfo=new JTextArea("COMBAT INFO\n\n\n",25,40);
			combatInfo.setSize(((windowXPixels*38/100)-1),(int)(windowYPixels/2.8));
			combatInfo.setBackground(Color.black);
			combatInfo.setForeground(Color.green);
			combatInfo.setFont(ShortcutMethods.font3);
			combatInfo.setEditable(false);		
			combatInfo.setWrapStyleWord(true);

		    scrollPane = new JScrollPane(combatInfo);
		    scrollPane.setPreferredSize(new Dimension((windowXPixels*38/100),(int)(windowYPixels/2.8)));
		    scrollPane.setWheelScrollingEnabled(true);
		    scrollPane.getComponent(1).setBackground(Color.yellow);//whoot this is the background of the scroll sheet
		    
			playerHealth=new JLabel("Your Health:");
			playerHealth.setBackground(ShortcutMethods.brown);
			playerHealth.setForeground(Color.red);
			playerHealth.setFont(ShortcutMethods.font4);
			
			enemyHealth=new JLabel("Enemy Health:");
			enemyHealth.setBackground(ShortcutMethods.brown);
			enemyHealth.setForeground(Color.red);
			enemyHealth.setFont(ShortcutMethods.font4);

			speechArea=new JTextArea("");
			speechArea.setBackground(Color.black);
			speechArea.setPreferredSize(new Dimension((windowXPixels*2/3),(windowYPixels/15)));
			speechArea.setForeground(Color.yellow);
			speechArea.setFont(ShortcutMethods.font4);
			
			playerStamina=new JLabel("Your Stamina:");
			playerStamina.setBackground(ShortcutMethods.brown);
			playerStamina.setForeground(Color.green);
			playerStamina.setFont(ShortcutMethods.font4);
			
			enemyStamina=new JLabel("Enemy Stamina:");
			enemyStamina.setBackground(ShortcutMethods.brown);
			enemyStamina.setForeground(Color.green);
			enemyStamina.setFont(ShortcutMethods.font4);
			
			distanceLabel=new JLabel("Distance in feet");
			distanceLabel.setForeground(ShortcutMethods.brown);
			distanceLabel.setFont(ShortcutMethods.font4);
			
			//Adding the Additional Information TextAreas
			fightingStatusInfo=new JTextArea("QUICK STATUS INFO\n");
			fightingStatusInfo.setSize((windowXPixels*60/100),(int)(windowYPixels/2));
			fightingStatusInfo.setBackground(Color.black);
			fightingStatusInfo.setForeground(Color.white);
			fightingStatusInfo.setFont(ShortcutMethods.font3);
			fightingStatusInfo.setEditable(false);		
			fightingStatusInfo.setWrapStyleWord(true);
			fightingStatusInfo.setVisible(false);
			
		    scrollPane2 = new JScrollPane(fightingStatusInfo);
		    scrollPane2.setPreferredSize(new Dimension((windowXPixels*60/100),(windowYPixels/2)));
		    scrollPane2.setWheelScrollingEnabled(false);
			scrollPane2.getComponent(1).setBackground(Color.black);//whoot this is the background of the scroll sheet
			scrollPane2.setVisible(false); 
			
			judgeInfo=new JTextArea("");
			judgeInfo.setPreferredSize(new Dimension((windowXPixels*23/100),(windowYPixels/13)));
			judgeInfo.setBackground(Color.black);
			judgeInfo.setForeground(Color.cyan);
			judgeInfo.setFont(ShortcutMethods.font3);
			judgeInfo.setEditable(false);		
			judgeInfo.setWrapStyleWord(true);
			
			//Adding the portraits
    		racePortrait=forAreanaGameGUI.createImageIcon("images/PortraitOblivion/GenericPort.GIF", "Portrait");
    		playerPortraitScene4=new JLabel(racePortrait);
    		
    		racePortrait=forAreanaGameGUI.createImageIcon("images/PortraitOblivion/GenericPort.GIF", "Portrait");
    		enemyPortraitScene4=new JLabel(racePortrait);

    		armourPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort2.GIF", "Armour");
    		playerAPortraitScene4=new JLabel(armourPortrait);
    		
    		armourPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort2.GIF", "Armour");
    		enemyAPortraitScene4=new JLabel(armourPortrait);

    		weaponPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort.GIF", "Weapon");
    		playerWPortraitScene4=new JLabel(weaponPortrait);
    		
    		weaponPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort.GIF", "Weapon");
    		enemyWPortraitScene4=new JLabel(weaponPortrait);
    		
//    		
			duelSimulationPic=forAreanaGameGUI.createImageIcon("images/ScenePics/oblivionArena.GIF", "The arena background, scary");
			duelSimulationPicLabel=new JLabel(duelSimulationPic);
			layout1_Spring.putConstraint(SpringLayout.NORTH, duelSimulationPicLabel,70, SpringLayout.NORTH, duelSimulationScenePanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, duelSimulationPicLabel,100, SpringLayout.WEST, duelSimulationScenePanel );
			
			//positioning
			layout1_Spring.putConstraint(SpringLayout.WEST, speechArea,130, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,speechArea, 140, SpringLayout.NORTH, duelSimulationScenePanel);
			
			
			layout1_Spring.putConstraint(SpringLayout.WEST, playerStamina,130, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,playerStamina, 200, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, enemyStamina,665, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,enemyStamina, 200, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, playerHealth,130, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,playerHealth, 250, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, enemyHealth,665, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,enemyHealth, 250, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, distanceBar,140, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,distanceBar, 225, SpringLayout.NORTH, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.WEST, distanceLabel,420, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,distanceLabel, 260, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, iAmReadyButton,700, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,iAmReadyButton, 600, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST,fightingStatusInfo,200, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,fightingStatusInfo,140, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, scrollPane2,200, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,scrollPane2,140, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, combatInfo,285, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,combatInfo, 290, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, scrollPane,285, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,scrollPane,290, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, judgeInfo,370, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,judgeInfo,550, SpringLayout.NORTH, duelSimulationScenePanel);
			
			
			layout1_Spring.putConstraint(SpringLayout.WEST, playerAPortraitScene4,150, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,playerAPortraitScene4,310, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, enemyAPortraitScene4,710, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,enemyAPortraitScene4,310, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, playerWPortraitScene4,200, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,playerWPortraitScene4,310, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, enemyWPortraitScene4,760, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,enemyWPortraitScene4,310, SpringLayout.NORTH, duelSimulationScenePanel);

			layout1_Spring.putConstraint(SpringLayout.WEST, playerPortraitScene4,150, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,playerPortraitScene4,410, SpringLayout.NORTH, duelSimulationScenePanel);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, enemyPortraitScene4,710, SpringLayout.WEST, duelSimulationScenePanel);
			layout1_Spring.putConstraint(SpringLayout.NORTH,enemyPortraitScene4,410, SpringLayout.NORTH, duelSimulationScenePanel);
			


			
			
			//add the stuff
			duelSimulationScenePanel.add(speechArea);
			duelSimulationScenePanel.add(scrollPane2);
			duelSimulationScenePanel.add(scrollPane);
			duelSimulationScenePanel.add(playerStamina);
			duelSimulationScenePanel.add(enemyStamina);
			duelSimulationScenePanel.add(playerHealth);
			duelSimulationScenePanel.add(enemyHealth);
			duelSimulationScenePanel.add(distanceLabel);		
			duelSimulationScenePanel.add(distanceBar);
			duelSimulationScenePanel.add(iAmReadyButton);
			duelSimulationScenePanel.add(judgeInfo);
			duelSimulationScenePanel.add(playerAPortraitScene4);
			duelSimulationScenePanel.add(enemyAPortraitScene4);
   			duelSimulationScenePanel.add(playerWPortraitScene4);
			duelSimulationScenePanel.add(enemyWPortraitScene4);
    		duelSimulationScenePanel.add(playerPortraitScene4);
    		duelSimulationScenePanel.add(enemyPortraitScene4);
 
			duelSimulationScenePanel.add(duelSimulationPicLabel);
			
		//end dualSimulationScenePanel--scene2
		
			repaint();
		}
		public void addSceneFivePanel()
		{

			//gameOverPanel--scene1 
	    	gameOverPanel=new JPanel(layout1_Spring);
	    	gameOverPanel.setVisible(false);
	    	gameOverPanel.setSize (windowXPixels,windowYPixels);
	    	gameOverPanel.setBackground(Color.black);
	    	
	    	//image
	    	youDiePic=forAreanaGameGUI.createImageIcon("images/scrapPics/fail.GIF",
			"your dead");
    		failPicture=new JLabel(youDiePic);
    		gameOverPanel.add(failPicture);
	    	
			//add a roomActionsButtonsTitle
	    	youDieInfo=new JLabel("YOU LOST :(");
	    	youDieInfo.setMaximumSize(new Dimension(600,400));
	    	youDieInfo.setFont(ShortcutMethods.font6);
	    	youDieInfo.setForeground(Color.red);

			gameOverPanel.add(youDieInfo);

			//add buttons
			exitScene5=new JButton("Exit entirely");
			returnScene5=new JButton("Try Again");
			gameOverPanel.add(exitScene5);
			gameOverPanel.add(returnScene5);
			
			layout1_Spring.putConstraint(SpringLayout.WEST, youDieInfo,100, SpringLayout.WEST, gameOverPanel );
			layout1_Spring.putConstraint(SpringLayout.NORTH, youDieInfo,10, SpringLayout.NORTH, gameOverPanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, failPicture,50, SpringLayout.WEST, gameOverPanel );
			layout1_Spring.putConstraint(SpringLayout.NORTH, failPicture,310, SpringLayout.NORTH, gameOverPanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, exitScene5,565, SpringLayout.WEST, gameOverPanel );
			layout1_Spring.putConstraint(SpringLayout.NORTH, exitScene5,630, SpringLayout.NORTH, gameOverPanel );
			layout1_Spring.putConstraint(SpringLayout.WEST, returnScene5,565, SpringLayout.WEST, gameOverPanel );
			layout1_Spring.putConstraint(SpringLayout.NORTH, returnScene5,530, SpringLayout.NORTH, gameOverPanel );
			
			repaint();
		   
	//end gameOverPanel
		}
		
		
		public void panelOrganiserOnThis()
		{
			this.add(sidePanelLeft, BorderLayout.WEST);
	       	this.add(sidePanelRight, BorderLayout.EAST);
	       	this.add(toolBarBottomScene4, BorderLayout.SOUTH);
	       	this.add(playerMovesPanel, BorderLayout.SOUTH);
        	this.add(raceSelectorPanel, BorderLayout.CENTER);
        	this.add(preparationScenePanel, BorderLayout.CENTER);
        	this.add(shopScenePanel, BorderLayout.CENTER);
	        this.add(duelSimulationScenePanel, BorderLayout.CENTER);
	        this.add(gameOverPanel, BorderLayout.CENTER);
		}
		
		public void sceneInitiator()
		{
        	//sceneInitiator
        	raceSelectorPanel.setVisible(true);
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////		
//////////////////////////////////////////////////////////////////////////////////////////////////////////		
//////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////
		//Above was pure GUI
		///////
		///////
		//Below is mainly dealing with actionListeners 
		///////
		///////
		//The methods below require the methods Shortcut Methods and definitely BattleFieldGUIDealer
		///////
		///////
		//
		///////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			public void addActionListeners()
			{
				for (int i=0;i<numtoolButtons;i++)
	        	{
	        		toolButtons[i].addActionListener(this);
	        	}
				for (int i=0;i<numtoolButtonsForToolBarScene4;i++)
				{
					toolButtonsForToolBarScene4[i].addActionListener(this);
				}
				for (int i=0;i<numButtonsForPlayerMoves;i++)
				{
					playerOffenceButtons[i].addActionListener(this);
				}
				for (int i=0;i<gameObjects.numRaces;i++)
	        	{
					raceRadioSelection[i].addActionListener(this);
	        	}
				shopChoiceSelectorTextField.addActionListener(this);
				lookButton.addActionListener(this);
				equipButton.addActionListener(this);			
				buyButton.addActionListener(this);
				iAmReadyButton.addActionListener(this);
				exitScene5.addActionListener(this);
				returnScene5.addActionListener(this);
				for (int i=0;i<numRoomActionsButtons;i++){
				roomActionsButtons[i].addActionListener(this);}
	
				revealRoomActionsBox.addActionListener(this);
				
			}
			
			public void addMouseListeners()
			{
				shopChoiceSelectorTextField.addMouseListener(this);	
			
			}
			

			
			public void textAreaCleaner(JTextArea outputer)
			{	try
				{
					if (outputer.getText().length()>250){
						ShortcutMethods.outputToTxtFile(outputer.getText(), "Your Moves History", true);
						outputer.setText("");} 
				}
				catch(Exception e)
				{
					
				}
			}
			
	        public void displayGUI()
	        {
	        	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            this.setVisible(true); //makes frame visible
	            this.setSize(windowXPixels+100,windowYPixels);
	        }
	        
	        public void hideGUI()
	        {
	            this.setVisible(false); //makes frame visible
	        }
	        
			public void actionPerformed(ActionEvent e) 
			{
				//START THE CODE WITH A REFRESH
				repaint();
				
		        informationRefreshings(e);
				mainToolActions(e);
				sceneOneActions(e);
				sceneTwoActions(e);
				sceneThreeActions(e);
				sceneFourActions(e);
				sceneFiveActions(e);
				informationRefreshings(e);
				
				//COMPLETE THE CODE WITH A REFRESH
				repaint();
			}

			
///////////////////////////////////////////////////////////////////////////////////////
			//
			//THESE METHODS BELOW ARE FOR ACTIONLISTENER
			//
///////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
///////
//Welcome to the listener methods to react to user input
///////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
			
	public void informationRefreshings(ActionEvent e)
	{
		//display scene data
		
		sceneNumLabel.setText("Scene:"+sceneNum);
		
		if (sceneNum>=1){
			moneyData.setText("My $:"+battlefield1.getplayerMoney());
			
			}
		
	}
			
	public void sceneOneActions(ActionEvent e)
	{
		if (sceneNum<1){
		for (int x=0;x<gameObjects.numRaces;x++)
		{
			if (e.getSource()== raceRadioSelection[x])
			{   raceNameDescription[x]=ShortcutMethods.loadRaceDescription(x,raceNameDescription[x]);
				raceSelectedNum=x+1;
				try
				{
					racePortrait=forAreanaGameGUI.createImageIcon(racePortraitPath[x],("Race: "+x));
				}
				catch(Exception nullImage)
				{
					racePortrait=forAreanaGameGUI.createImageIcon("images/PortraitOblivion/GenericPort.GIF",
							"unknown race");
				}
				label_RacePortrait.setIcon(racePortrait);
				label_RacePortraitroomActionsButtonsTitle.setText(raceRadioSelectionText[x]);
				raceSelectorDescriptionTextArea.setText((x+1)+raceNameDescription[x]);
				

			}
			else{}
		}
		 scrollPane.getViewport().setViewPosition(new Point(0,raceSelectorDescriptionTextArea.getText().length())); 

		}
	}
	public void sceneTwoActions(ActionEvent e)
	{
		if (sceneNum==1)
		{
			bulletinBoard.setText("");
			bulletinBoard.append("\nDaily Message:"+generator1.randomGenerate());
			scrollPane3.getViewport().setViewPosition(new Point(0,bulletinBoard.getText().length())); 

			whatButton(e);
		}
		else
		{
			
		}
	}
	
	public void sceneThreeActions(ActionEvent e)
	{
		

		try
		{
			refreshShopDisplay();
			int outputNumber=(Integer.parseInt(shopChoiceSelectorTextField.getText()));
			if (e.getSource()==equipButton)
			{
				youCanClickConfirmLabel.setText("To continue, click ==> on far LEFT");
				
				if (boughtThisEquipment[ outputNumber]==true)
				{
					
						if ( outputNumber>0&&
								(outputNumber<gameObjects.numWeapons+1))
						{
							weaponEquippedNum= outputNumber;
							youCanClickConfirmLabel.setVisible(true);
							try
							{
								weaponPortrait=forAreanaGameGUI.createImageIcon(equipmentPortraitPath[weaponEquippedNum-1],("Weapon"));
							}
							catch(Exception nullImage)
							{
								weaponPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort.GIF",
										"unknown weapon");
							}
							label_weaponPortrait.setIcon(weaponPortrait);
							label_weaponPortraitroomActionsButtonsTitle.setText(weaponsTextFieldSelectionText[weaponEquippedNum-1]);		
							
							allowToSceneFour=true;
						}
						else if ( (outputNumber>gameObjects.numWeapons)&&
								( outputNumber<gameObjects.numArmour+gameObjects.numWeapons+1))
						{
							armourEquippedNum= outputNumber;
							youCanClickConfirmLabel.setVisible(true);
							try
							{
								armourPortrait=forAreanaGameGUI.createImageIcon(equipmentPortraitPath[armourEquippedNum-1],("Armour"));
							}
							catch(Exception nullImage)
							{
								armourPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort2.GIF",
										"unknown armour");
							}
							label_armourPortrait.setIcon(armourPortrait);
							label_armourPortraitroomActionsButtonsTitle.setText(armourTextFieldSelectionText[armourEquippedNum-gameObjects.numWeapons-1]);
							if (weaponEquippedNum>0)
							{
								allowToSceneFour=true;
							}
							
						}
						else
						{
							youCanClickConfirmLabel.setVisible(false);
							allowToSceneFour=false;
						}
		
					
					
		
				}
				else
				{
					weaponEquippedNum=-1;
					shopChoiceSelectorTextField.setText("<Did not buy it yet!>");
					allowToSceneFour=false;
					youCanClickConfirmLabel.setVisible(false);
				}
	
			}
			else if (e.getSource()==lookButton)
			{	
				if (outputNumber<=gameObjects.numWeapons){
				ShortcutMethods.loadWeaponDescription(outputNumber,shopSceneEquipmentDescriptionTextArea);}
				else if (outputNumber<=gameObjects.numArmour+gameObjects.numWeapons){
				ShortcutMethods.loadArmourDescription(outputNumber,shopSceneEquipmentDescriptionTextArea);}
				refreshShopDisplay();
			}
			else if (e.getSource()==buyButton)
			{
				if ( outputNumber<=gameObjects.numWeapons)
				{
					

					int selectedWeapon= outputNumber;
					int selectedWeaponCost=gameObjects.weaponArray[selectedWeapon-1].getWeaponCost();
					
					ShortcutMethods.loadWeaponDescription(selectedWeapon,shopSceneEquipmentDescriptionTextArea);
					if (battlefield1.getplayerMoney()>=selectedWeaponCost)
							{
						if (selectedWeapon==45||selectedWeapon==46)
						{
							if(raceSelectedNum==8|raceSelectedNum==12){
							selectedWeapon=46;
							}
							else{selectedWeapon=45;}
						}
								battlefield1.setplayerMoney(battlefield1.getplayerMoney()-selectedWeaponCost);
								boughtThisEquipment[selectedWeapon]=true;
								youCanClickConfirmLabel.setText("<THX-you can click equip now>");
								JOptionPane.showMessageDialog(this,
										"\nYou purchased the item\nNow you can shop for more" +
										"\n or click equip for you battle"+
										"\nOK", "advice", JOptionPane.PLAIN_MESSAGE);
								youCanClickConfirmLabel.setVisible(true);
							
							refreshShopDisplay();
							}
					else
							{
								boughtThisEquipment[selectedWeapon+1]=false;
								shopChoiceSelectorTextField.setText("<Not Enough $$ for weapon!>");
								JOptionPane.showMessageDialog(this,
										"\nYou don't have enough,\n you might wanna buy something cheaper" +
										"\n or 'buy' the free woodenBat-8\nor free cardbaord armour-20\n\t--type 8 for that"+
										"\nOK", "advice", 
										JOptionPane.PLAIN_MESSAGE);
								youCanClickConfirmLabel.setVisible(false);
							}
				}
				else
				{

					int selectedArmour=outputNumber-gameObjects.numWeapons;
					int selectedArmourCost=gameObjects.armourArray[selectedArmour-1].getArmourCost();
					
					ShortcutMethods.loadArmourDescription(selectedArmour+gameObjects.numWeapons,shopSceneEquipmentDescriptionTextArea);
					if (battlefield1.getplayerMoney()>=selectedArmourCost)
							{
								battlefield1.setplayerMoney(battlefield1.getplayerMoney()-selectedArmourCost);
								boughtThisEquipment[selectedArmour+gameObjects.numWeapons]=true;
								youCanClickConfirmLabel.setText("<THX-you can click equip now>");
								JOptionPane.showMessageDialog(this,
										"\nYou purchased this weapon\nNow you can shop for more" +
										"\n or click equip for you battle"+
										"\nOK", "advice", JOptionPane.PLAIN_MESSAGE);
								youCanClickConfirmLabel.setVisible(true);
								refreshShopDisplay();
							}
					else
							{
								boughtThisEquipment[selectedArmour+gameObjects.numWeapons+1]=false;
								shopChoiceSelectorTextField.setText("<Not Enough $$ for armour!>");
								JOptionPane.showMessageDialog(this,
										"\nYou don't have enough,\n you might wanna buy something cheaper" +
										"\n or 'buy' the free woodenBat\n\t--type 8 for that"+
										"\nOK", "advice", JOptionPane.PLAIN_MESSAGE);
								youCanClickConfirmLabel.setVisible(false);
							}
				}
			}
			else
			{
				//default status
			}
		}
		catch (Exception notInRange)
		{
			
			allowToSceneFour=false;
			shopChoiceSelectorTextField.setText("<INVALID CHOICE>");
			System.out.print("ya"+notInRange);
			youCanClickConfirmLabel.setVisible(false);
		}
	}
	public void refreshShopDisplay()
	{		

		shopSceneStoreTextArea.setText("");
	
		for (int x=0;x<gameObjects.numWeapons;x++)
		{		
			shopSceneStoreTextArea.append((x+1)+"-"+weaponsTextFieldSelectionText[x]+"\n");
			if (boughtThisEquipment[x+1]==true){shopSceneStoreTextArea.append("   (^BOUGHT)\n");}
		}
		
		for (int x=0;x<gameObjects.numArmour;x++)
		{	
			shopSceneStoreTextArea.append((x+gameObjects.numWeapons+1)+"-"+armourTextFieldSelectionText[x]+"\n");
			if (boughtThisEquipment[x+gameObjects.numWeapons+1]==true){shopSceneStoreTextArea.append("   (^BOUGHT)\n");}
		}
	}
	public void sceneFourActions(ActionEvent e)
	{	//scene3 action fight button
		
		playerTurnMoveActions(e);
			ShortcutMethods.stall(200);
		
		if (iAmReadyButton.isVisible()==false&&fightingModeStill==true)//launch player attack
		{
			textAreaCleaner(combatInfo);
			for (int x=0;x<numtoolButtons;x++)
			{
				if(e.getSource()==toolButtons[x])
				{
					 
					toolButtonClickedWhileFighting=true;
					 break;
				}	
				else
				{ 
					toolButtonClickedWhileFighting=false;
				}
						
			}
			if ( toolButtonClickedWhileFighting==false)
			{
				battlefield1.playerTurn(combatInfo, userSelectedMove,playerTurnStill);
						
			}
		}
		ShortcutMethods.stall(200);
			//Battle Turn Decisioner
		if( (playerTurnStill==false)&&(iAmReadyButton.isVisible()==false)&&fightingModeStill==true)
		{
			for (int x=0;x<numtoolButtons;x++)
			{
				if(e.getSource()==toolButtons[x])
				{
				 toolButtonClickedWhileFighting=true;break;
				}	else{ toolButtonClickedWhileFighting=false;}
						
			}
			if ( toolButtonClickedWhileFighting==false)
			{
				battlefield1.enemyTurn(combatInfo);		
			}
		}
		ShortcutMethods.stall(200);
		if (e.getSource()==iAmReadyButton)
		{
			fightingModeStill=true;
			iAmReadyButton.setVisible(false);
			toolBarBottomScene4.setVisible(true);
			playerGoFirst =	battlefield1.whoStartsFirst(combatInfo);
			if (playerGoFirst==false)
			{				
				battlefield1.enemyTurn(combatInfo);
			}
		}
		ShortcutMethods.stall(200);
		 scrollPane.getViewport().setViewPosition(new Point(0,combatInfo.getText().length())); 
	}
	
	public void sceneFiveActions(ActionEvent e)
	{	//scene4
		if (e.getSource()== returnScene5){
			JOptionPane.showMessageDialog(this,
			"Well, you gotta thank god because your back to life again\n" +
			"But you can't find you original cash anymore!" +
			"\nLOST ALL MONEY!"+
			"\nOK", "YES", 
			JOptionPane.PLAIN_MESSAGE);
			fightingModeStill=false;
			sceneNum=1;
			preparationScenePanel.setVisible(true);
			gameOverPanel.setVisible(false);
			playerMovesPanel.setVisible(false);
			toolBarBottomScene4.setVisible(false);
			battlefield1.completeRestoreRegData();
			battlefield1.setplayerHp(battlefield1.getOriginalplayerHp());
			battlefield1.setenemyHp(battlefield1.getOriginalenemyHp());
			//display scene data
			
		}
		else if (e.getSource()== exitScene5)
		{
			JOptionPane.showMessageDialog(this,
			"Well too bad, better luck next time! You high score will be recorded:)\n"+
			"\nOK", "YES", 
			JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
	}
	
	public void mainToolActions(ActionEvent e){
		
		if (sceneNum==3){speechArea.setText("The enemy says: "+generator1.randomGenerateWarTaunt());}
		if (e.getSource()==toolButtons[0])//<==
		{	 
			if (sceneNum>0)
			{
				if (sceneNum==1)
				{

					JOptionPane.showMessageDialog(this,
							"	NOW YOU ARE BACK AT CHOOSING RACE!\n" +
							"ALL YOUR ORIGINAL SELECTIONS ARE NOW SET TO DEFAULT\n"+
							"\nOK", "CHANGE", 
							JOptionPane.PLAIN_MESSAGE);
					for (int x=0;x<gameObjects.numWeapons+gameObjects.numArmour+1;x++){
					boughtThisEquipment[x]=false;}
					for (int x=0;x<numRoomActionsButtons;x++){
					increasePlayerDataByTen[x]=0;}
					
		    		raceSelectorPanel.setVisible(true);
		    		shopScenePanel.setVisible(false);
		    		preparationScenePanel.setVisible(false);
		    		roomActionsBox.setVisible(false);
		    		samePlayer=false;
		    		raceSelectedNum=0;
		    		weaponEquippedNum=0;
		    		armourEquippedNum=0;
		    		

		    			
		    		
		    		label_RacePortraitroomActionsButtonsTitle.setText("unknown Race");
		    		
		    		label_weaponPortraitroomActionsButtonsTitle.setText("no weapon");
		    		
		    		label_armourPortraitroomActionsButtonsTitle.setText("no armour");
		    		
		    		//reset potraits
		    		racePortrait=forAreanaGameGUI.createImageIcon("images/PortraitOblivion/GenericPort.GIF", "Race Portrait");
		    		label_RacePortrait.setIcon(racePortrait);
		    		sidePanelRight.add(label_RacePortrait);


		    		weaponPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort.GIF", "Weapon Portrait");
		    		label_weaponPortrait.setIcon(weaponPortrait);
		    		sidePanelRight.add(label_weaponPortrait);



		    		armourPortrait=forAreanaGameGUI.createImageIcon("images/PortraitEquipment/GenericPort2.GIF", "Armour Portrait");
		    		label_armourPortrait.setIcon(armourPortrait);
		    		sidePanelRight.add(label_armourPortrait);
		    		
		    		sceneNumLabel.setText("Scene:0");
		    		moneyData.setText("My $:null");
		    		
		    		sceneNum--;//located them here so I can control how many scenes I skip
				}
				else if (sceneNum==2)
				{

		    		shopScenePanel.setVisible(false);
		    		preparationScenePanel.setVisible(true);
		    		sceneNum--;//located them here so I can control how many scenes I skip
					
				}
				else if (sceneNum==3)
				{
					JOptionPane.showMessageDialog(this,
							"	Can't run you coward! Your fighting!\n"+
							"\nOK", "NO!", 
							JOptionPane.PLAIN_MESSAGE);
				}
				else
				{
					
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this,
						"	NOTHING TO GO BACK!\n"+
						"\nOK", "<==", 
						JOptionPane.PLAIN_MESSAGE);
			}
		}
		else if (e.getSource()==toolButtons[1])//==>
		{	
			if (sceneNum<(numScenes-1))
			{
				if (sceneNum==0)
				{
					if (raceSelectedNum>0){
		    		raceSelectorPanel.setVisible(false);
//		    		JOptionPane.showMessageDialog(this,"Welcome welcome! \nNow you walked to your bedroom"+
//		    		"before you fight your enemy, don't you wanna train a bit or prepare a bit at least?" +
//		    		"\nwell you can click do something now to perform these actions. If you wanna continue," +
//		    		"\n click ==>!"+ "\n", "OK", JOptionPane.PLAIN_MESSAGE);
//					JOptionPane.showMessageDialog(this,
//							
//							"Now you can perform different actions, " +
//							"\n such as eating or working out. This can be started by clicking the do something button." +
//							"\nThe activities(except sleep) all cost money, but the amount depends" +
//							"\n on the type of preparation."+
//							"\nThen once you are satisfied or broke" +
//							"\nclick the ==> to continue to the shop"+
//							"\nPRESS OK, to continue", "Info and Instructions", 
//							JOptionPane.PLAIN_MESSAGE);
		    		preparationScenePanel.setVisible(true);
		    		sceneNum++;			
		    		if (samePlayer==false){
		    			samePlayer=true;
		    			battlefield1=new BattleFieldGUIDealer();
		    			battlefield1.setplayerMoney(gameObjects.raceArray[raceSelectedNum-1].getInitialWealth());
		    			informationRefreshings(e);
		    			}
		    		}
					else{raceSelectorDescriptionTextArea.setText("\n\n\n\n\n\tYou must select a race!!!\n");}
				}
				else if (sceneNum==1)
				{
			    		preparationScenePanel.setVisible(false);
//			    		JOptionPane.showMessageDialog(this,"You walked to the blacksmith shop"+
//			    				"\n", "OK", 
//			    				JOptionPane.PLAIN_MESSAGE);
			    		shopScenePanel.setVisible(true);
//						JOptionPane.showMessageDialog(this,
//								
//								"You are at the shop. You must have a weapon to enter the arena"+
//								"\nYou don't need armour. 1-9 are weapons, and 10-13 are armour options."+
//								"\nYou can only equip 1 weapon at a time, and 1 piece of armour at a time."+
//								"\nYou cannot equip a weapon unless you already bought it, which will be indicated"+
//								"in the equipment list. Lastly, to select a weapon, DON'T click the list,"+
//								"\nYou must type the appropriate number like 4 as in shortsword," +
//								"\nthen click buy, then click equip"+
//								"\nWhen you are done, click  ==>"+
//								"\nPRESS OK, to continue", "Info and Instructions", 
//								JOptionPane.PLAIN_MESSAGE);
			    		shopSceneEquipmentDescriptionTextArea.setText("<EQUIPMENT DESCRIPTION>");
			    		sceneNum++;
				}
				else if (sceneNum==2)
				{
					if (allowToSceneFour==true)
					{
						
						shopScenePanel.setVisible(false);
						duelSimulationScenePanel.setVisible(true);
//						JOptionPane.showMessageDialog(this,
//								
//								"You are now at the dual simulation section"+
//								"\nYou are the left side, and the enemy is on the right side"+
//								"\nThis is a turn based game like chess, who goes first depends" +
//								"\non who has the greater speed. Then when it's your turn, select your move"+
//								"\nRight after you select, its your enemy's turn. It would take less than a second"+
//								"\n because I can't have a thread/timer. Basically if you make your move, the enemy" +
//								"\nwill then make his move, and it will be displayed in the center in green text. "+
//								"\nThen you can continue. 2 most cruical variables to remeber are health and stamina"+
//								"\nHealth is crucial. If yours reach 0, you lose; if the enemy's reach 0, you win basically"+
//								"\nStamina is the second important factor, every move you chose will affect your remaining stamina"+
//								"\nSome times more energy than others. DO NOTHING will restore 30 stamina"+
//								"\nThere are so many more variables, but I will let you to figure out the rest!"+
//								
//								"\nPRESS OK, to continue", "Info and Instructions", 
//								JOptionPane.PLAIN_MESSAGE);
						iAmReadyButton.setVisible(true);
						sceneNum++;
			    		
			    		dualSimulationLauncher();
					}
					else
					{
						shopChoiceSelectorTextField.setText("need a weapon(no need for armour)");
						allowToSceneFour=false;
					}
				}
				else
				{
					allowToSceneFour=false;
				}
			}
			else
			{
				if (sceneNum==numScenes-1)
				{
					JOptionPane.showMessageDialog(this,
					"\nSorry, invalid.\nThere is nothing to confirm,\n click the buttons in the center instead\n"+
					"\nOK", "unavailable", 
					JOptionPane.PLAIN_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(this,
					"You can't yet\n"+
					"\nOK", "INCOMPLETE", 
					JOptionPane.PLAIN_MESSAGE);
				}
			}
		
		}
		else if (e.getSource()==toolButtons[2])//info
		{	
		 
			JOptionPane.showMessageDialog(this,
			"BY ANKUN FANG \n" +
			"CREDITS: pictures from the internet\n"+//JIAGHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHCREDITS
			"\nOK", "INFO", 
			JOptionPane.PLAIN_MESSAGE);
		}
		else if (e.getSource()==toolButtons[3])
		{	 
			JOptionPane.showMessageDialog(this,
			"Hope you had a great time\n " +
			"Your number of victories are recorded\n"+
			"\nOK", "EXIT", 
			JOptionPane.PLAIN_MESSAGE);
			ShortcutMethods.outputToTxtFile("\n"+playerVictories, "leadersboardsData", true);
			playerVictories=0;
			this.hideGUI();

		}
		else
		{
			
		}
		
		//display scene data
		
	}
	///////////////
	
	public void playerTurnMoveActions(ActionEvent e){
		if (fightingModeStill=true&&duelSimulationScenePanel.isVisible()==true){
			
			try{
			
				dualSimualtionRefreshInformation();
					
				//bottom tools
				if (e.getSource()==toolButtonsForToolBarScene4[0])//OFFENCE
				{	
					playerMovesPanel.setVisible(true);
					toolBarBottomScene4.setVisible(false);
					playerTurnStill=true;
					userSelectedMove=-1;
				}
				else if (e.getSource()==toolButtonsForToolBarScene4[1])//GUARD
				{	
					userSelectedMove=1;
					playerTurnStill=false;
				}
				else if (e.getSource()==toolButtonsForToolBarScene4[2])//CHARGE
				{	
					userSelectedMove=2;
					playerTurnStill=false;
				}
				else if (e.getSource()==toolButtonsForToolBarScene4[3])//DO NOTHING
				{	
					userSelectedMove=3;
					playerTurnStill=false;
				}
				else if (e.getSource()==toolButtonsForToolBarScene4[5])//back up
				{	
					userSelectedMove=5;
					playerTurnStill=false;
				}
				else
				{}
				
				if (e.getSource()==toolButtonsForToolBarScene4[4]&&
						toolButtonsForToolBarScene4[4].getText().equals(">RETURN<"))//STATUS
				{	
					toolButtonsForToolBarScene4[4].setText("STATUS");
					scrollPane2.setVisible(false); 
					fightingStatusInfo.setVisible(false);
					playerTurnStill=true;
					scrollPane.setVisible(true);
				}
				else if (e.getSource()==toolButtonsForToolBarScene4[4]&&
						toolButtonsForToolBarScene4[4].getText().equals("STATUS"))//STATUS
				{		
					scrollPane2.setVisible(true); 
					fightingStatusInfo.setVisible(true);
					toolButtonsForToolBarScene4[4].setText(">RETURN<");
					if (battlefield1.getMyVision()>battlefield1.getDistance())
					{
						battlefield1.displayMoreFightingStatus=true;
					}
					else//if off vision again
					{
						battlefield1.displayMoreFightingStatus=false;
					}
					battlefield1.distanceStatus(fightingStatusInfo);
					battlefield1.fightingStatus(fightingStatusInfo);
					userSelectedMove=4;
					playerTurnStill=true;
					scrollPane.setVisible(false);
				}
				else
				{}
				
				//Moves
				if (e.getSource()==playerOffenceButtons[0])//slash
				{	 
					userSelectedMove=10;
					playerTurnStill=false;
				}
				else if (e.getSource()==playerOffenceButtons[1])//stab
				{	
					userSelectedMove=11;
					playerTurnStill=false;
				}
				else if (e.getSource()==playerOffenceButtons[2])//crush
				{	
					userSelectedMove=12;
					playerTurnStill=false;
				}
				else if (e.getSource()==playerOffenceButtons[3])//shoot
				{	
					userSelectedMove=13;
					playerTurnStill=false;
				}
				else if (e.getSource()==playerOffenceButtons[4])//cancel
				{	playerTurnStill=true;
					userSelectedMove=-1;
					playerMovesPanel.setVisible(false);
					toolBarBottomScene4.setVisible(true);	
				}
				else
				{
					
				}
				
				dualSimualtionRefreshInformation();
				
			}
		catch(Exception notThisSceneYet)
			{
				System.out.println("not this scene yet");
			}
			repaint();
		}
	}
	
	public void shrinkPortrats()
	{
		//display Portraits
		
				try
				{
					racePortrait=forAreanaGameGUI.createImageIcon(racePortraitPath[raceSelectedNum-1],
							("Race: "+raceSelectedNum));
				}
				catch(Exception nullImage)
				{
					racePortrait=forAreanaGameGUI.createImageIcon
					("images/PortraitOblivion/GenericPort.GIF","unknown race");
				}
				duelSimulationScenePanel.add(new JLabel(forAreanaGameGUI.scale(racePortrait.getImage(), 0.25))); 
				playerPortraitScene4.setIcon(racePortrait);
				
				try
				{
					racePortrait=forAreanaGameGUI.createImageIcon(racePortraitPath[enemyRace-1],
							("Race: "+raceSelectedNum));//
				}
				catch(Exception nullImage)
				{
					racePortrait=forAreanaGameGUI.createImageIcon
					("images/PortraitOblivion/GenericPort.GIF","unknown race");
				}
				duelSimulationScenePanel.add(new JLabel(forAreanaGameGUI.scale(racePortrait.getImage(), 0.25))); 
			    enemyPortraitScene4.setIcon(racePortrait);
			    try
				{
					weaponPortrait=forAreanaGameGUI.createImageIcon(equipmentPortraitPath[weaponEquippedNum-1],
							("weapon: "+weaponEquippedNum));
				}
				catch(Exception nullImage)
				{
					weaponPortrait=forAreanaGameGUI.createImageIcon
					("images/PortraitEquipment/GenericPort.GIF","unknown weapon");
				}
				weaponPortrait=((forAreanaGameGUI.scale(weaponPortrait.getImage(), 0.55))); 
				playerWPortraitScene4.setIcon(weaponPortrait);
				 try
				{
					weaponPortrait=forAreanaGameGUI.createImageIcon(equipmentPortraitPath[enemyWeapon-1],
							("weapon: "+enemyWeapon));//
				}
				catch(Exception nullImage)
				{
					weaponPortrait=forAreanaGameGUI.createImageIcon
					("images/PortraitEquipment/GenericPort.GIF","unknown weapon");
				}
				 
				weaponPortrait=((forAreanaGameGUI.scale(weaponPortrait.getImage(), 0.55))); 
			    enemyWPortraitScene4.setIcon(weaponPortrait);
				try
				{
					armourPortrait=forAreanaGameGUI.createImageIcon(equipmentPortraitPath[armourEquippedNum-1],
							("armour: "+armourEquippedNum));
				}
				catch(Exception nullImage)
				{
					armourPortrait=forAreanaGameGUI.createImageIcon
					("images/PortraitEquipment/GenericPort2.GIF","unknown armour");
				}
				armourPortrait=((forAreanaGameGUI.scale(armourPortrait.getImage(), 0.55))); 
				 playerAPortraitScene4.setIcon(armourPortrait);
				try
				{
					armourPortrait=forAreanaGameGUI.createImageIcon(equipmentPortraitPath[enemyArmour+gameObjects.numWeapons-1],
							("armour: "+enemyArmour));//
				}
				catch(Exception nullImage)
				{
					armourPortrait=forAreanaGameGUI.createImageIcon
					("images/PortraitEquipment/GenericPort2.GIF","unknown armour");
				}
			    armourPortrait=((forAreanaGameGUI.scale(armourPortrait.getImage(), 0.55))); 
			    enemyAPortraitScene4.setIcon(armourPortrait);
	}
	
	///other useful stuff
	//gameObjects.armourArray[armourEquippedNum-gameObjects.numWeapons-1].getarmourType()!=4
	
	public void whatButton(ActionEvent e)
	{
		if (e.getSource()==revealRoomActionsBox)
		{
			if (revealRoomActionsBox.getText().equalsIgnoreCase("Do Something"))
			{
				revealRoomActionsBox.setText("Close");
				roomActionsBox.setVisible(true);
//				{"EAT","SLEEP","WORKOUT","STUDY",
				roomActionsButtons[0].setVisible(true);
				roomActionsButtons[1].setVisible(true);
				roomActionsButtons[2].setVisible(true);
				roomActionsButtons[3].setVisible(true);
			}
			else if (revealRoomActionsBox.getText().equalsIgnoreCase("Close"))
			{
				revealRoomActionsBox.setText("Do Something");
				roomActionsBox.setVisible(false);
				for (int x =0;x<numRoomActionsButtons;x++){
				roomActionsButtons[x].setVisible(false);
				roomActionsButtons[x].setText(roomActionsButtonsTitle[x]);}
				
				yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/oldRoom.PNG", "Your Room Picture, like jail");
				yourRoomBackgroundLabel.setIcon(yourRoomBackground);
				preparationScenePanel.add(yourRoomBackgroundLabel);
				layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
				layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
			}
		}
		else if (e.getSource()==roomActionsButtons[0])
		{
			
			if (roomActionsButtons[0].getText().equals("EAT"))
			{
				yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/eat.GIF", "Your EAT Picture");
				yourRoomBackgroundLabel.setIcon(yourRoomBackground);
				preparationScenePanel.add(yourRoomBackgroundLabel);
				layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
				layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
				roomActionsButtons[1].setVisible(false);
				roomActionsButtons[2].setVisible(false);
				roomActionsButtons[3].setVisible(false);
				roomActionsButtons[0].setText("Close EAT");
				roomActionsButtons[4].setVisible(true);
				roomActionsButtons[5].setVisible(true);
				roomActionsButtons[6].setVisible(true);
			}
			else
			{
				yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/oldRoom.PNG", "Your Room Picture, like jail");
				yourRoomBackgroundLabel.setIcon(yourRoomBackground);
				preparationScenePanel.add(yourRoomBackgroundLabel);
				layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
				layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
				roomActionsButtons[1].setVisible(true);
				roomActionsButtons[2].setVisible(true);
				roomActionsButtons[3].setVisible(true);
				roomActionsButtons[0].setText("EAT");
				roomActionsButtons[1].setText("SLEEP");
				roomActionsButtons[2].setText("WORKOUT");
				roomActionsButtons[3].setText("STUDY");
				roomActionsButtons[4].setVisible(false);
				roomActionsButtons[5].setVisible(false);
				roomActionsButtons[6].setVisible(false);
			}
		}
		else if (e.getSource()==roomActionsButtons[1])
		{
			if (roomActionsButtons[1].getText().equals("SLEEP"))
			{
				yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/sleep.GIF", "Your SLEEP Picture");
				yourRoomBackgroundLabel.setIcon(yourRoomBackground);
				preparationScenePanel.add(yourRoomBackgroundLabel);
				layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
				layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
				roomActionsButtons[7].setVisible(true);
				roomActionsButtons[0].setVisible(false);
				roomActionsButtons[2].setVisible(false);
				roomActionsButtons[3].setVisible(false);
				roomActionsButtons[1].setText("Close SLEEP");

			}
			else
			{
				yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/oldRoom.PNG", "Your Room Picture, like jail");
				yourRoomBackgroundLabel.setIcon(yourRoomBackground);
				preparationScenePanel.add(yourRoomBackgroundLabel);
				layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
				layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
				roomActionsButtons[0].setVisible(true);
				roomActionsButtons[2].setVisible(true);
				roomActionsButtons[3].setVisible(true);
				roomActionsButtons[0].setText("EAT");
				roomActionsButtons[1].setText("SLEEP");
				roomActionsButtons[2].setText("WORKOUT");
				roomActionsButtons[3].setText("STUDY");
				roomActionsButtons[7].setVisible(false);
			}
		}
		else if (e.getSource()==roomActionsButtons[2])
		{
			if (roomActionsButtons[2].getText().equals("WORKOUT"))
			{
				yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/workout.GIF", "a bad place for working out," +
						" at least it looks like it");
				yourRoomBackgroundLabel.setIcon(yourRoomBackground);
				preparationScenePanel.add(yourRoomBackgroundLabel);
				layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
				layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
				roomActionsButtons[1].setVisible(false);

				roomActionsButtons[3].setVisible(false);
				roomActionsButtons[0].setVisible(false);
				roomActionsButtons[2].setText("Close WORKOUT");
				roomActionsButtons[8].setVisible(true);
				roomActionsButtons[9].setVisible(true);
				roomActionsButtons[10].setVisible(true);
			}
			else
			{
				yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/oldRoom.PNG", "Your Room Picture, like jail");
				yourRoomBackgroundLabel.setIcon(yourRoomBackground);
				layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
				layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
				roomActionsButtons[1].setVisible(true);
				roomActionsButtons[0].setVisible(true);
				roomActionsButtons[3].setVisible(true);
				roomActionsButtons[0].setText("EAT");
				roomActionsButtons[1].setText("SLEEP");
				roomActionsButtons[2].setText("WORKOUT");
				roomActionsButtons[3].setText("STUDY");
				roomActionsButtons[8].setVisible(false);
				roomActionsButtons[9].setVisible(false);
				roomActionsButtons[10].setVisible(false);
			}
		}
		else if (e.getSource()==roomActionsButtons[3])
		{
			if (roomActionsButtons[3].getText().equals("STUDY"))
			{
				yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/study.gif", "just a desk for studying");
				yourRoomBackgroundLabel.setIcon(yourRoomBackground);
				layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
				layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
				roomActionsButtons[1].setVisible(false);
				roomActionsButtons[2].setVisible(false);
				roomActionsButtons[0].setVisible(false);
				roomActionsButtons[3].setText("Close STUDY");
				roomActionsButtons[11].setVisible(true);
				roomActionsButtons[12].setVisible(true);
				roomActionsButtons[13].setVisible(true);
			}
			else
			{
				yourRoomBackground=forAreanaGameGUI.createImageIcon("images/ScenePics/oldRoom.PNG", "Your Room Picture, like jail");
				yourRoomBackgroundLabel.setIcon(yourRoomBackground);
				layout1_Spring.putConstraint(SpringLayout.NORTH, yourRoomBackgroundLabel,30, SpringLayout.NORTH, preparationScenePanel );
				layout1_Spring.putConstraint(SpringLayout.WEST, yourRoomBackgroundLabel,100, SpringLayout.WEST, preparationScenePanel );
				roomActionsButtons[1].setVisible(true);
				roomActionsButtons[2].setVisible(true);
				roomActionsButtons[0].setVisible(true);
				roomActionsButtons[0].setText("EAT");
				roomActionsButtons[1].setText("SLEEP");
				roomActionsButtons[2].setText("WORKOUT");
				roomActionsButtons[3].setText("STUDY");
				roomActionsButtons[11].setVisible(false);
				roomActionsButtons[12].setVisible(false);
				roomActionsButtons[13].setVisible(false);
			}
		}
		
		
			if (e.getSource()==roomActionsButtons[4])
			{		
				increasePlayerDataByTen[4]=4;
				increaserValue+=1;
				printSpendingResult(increasePlayerDataByTen[4],"INITIATIVE", "You ate some bread\n");

			}
			else if (e.getSource()==roomActionsButtons[5])
			{increaserValue+=1;
				increasePlayerDataByTen[5]=8;
				printSpendingResult(increasePlayerDataByTen[5],"INITIATIVE", "You ate some veggies\n");

			}
			else if (e.getSource()==roomActionsButtons[6])
			{increaserValue+=1;
				increasePlayerDataByTen[6]=12;
				printSpendingResult(increasePlayerDataByTen[6],"INITIATIVE", "You ate some meat\n");
			}
			else if (e.getSource()==roomActionsButtons[7])
			{increaserValue+=1;
				printPlainMessageBox("You slept, WHAT A WASTE OF TIME!" , "Ok","Complete");
			}
			else if (e.getSource()==roomActionsButtons[8])
			{	increaserValue+=1;
				increasePlayerDataByTen[8]=8;
				printSpendingResult(increasePlayerDataByTen[8],"STRENGTH", "You did some strength workout\n");
			}
			else if (e.getSource()==roomActionsButtons[9])
			{increaserValue+=1;
				increasePlayerDataByTen[9]=8;
				printSpendingResult(increasePlayerDataByTen[9],"AGILITY", "You did some cardio workout\n");
			}
			else if (e.getSource()==roomActionsButtons[10])
			{increaserValue+=1;
				increasePlayerDataByTen[10]=4;
				printSpendingResult(increasePlayerDataByTen[10],"TRAINING", "You excersised with weapons and gained \na little experience on all types of weapons\n");
			}
			else if (e.getSource()==roomActionsButtons[11])
			{increaserValue+=1;
				increasePlayerDataByTen[11]=2;
				printSpendingResult(increasePlayerDataByTen[11],"TRAINING", "You read some combat books\n");
			}
			else if (e.getSource()==roomActionsButtons[12])
			{increaserValue+=1;
				increasePlayerDataByTen[12]=6;
				printSpendingResult(increasePlayerDataByTen[12],"SPEED", "You read some books that helped you with you nimbleness\n");
			}
			else if (e.getSource()==roomActionsButtons[13])
			{increaserValue+=1;
				increasePlayerDataByTen[13]=10;
				printSpendingResult(increasePlayerDataByTen[13],"INITIATIVE", "You read some books that gave you courage to fight\n");
			}
			else{}
		

	}
	public void printSpendingResult(int boost, String variable,String actionString)
	{
		boost=boost+increaserValue-1+ShortcutMethods.randomNumberGeneratorMethod(5);
		
		if (battlefield1.getplayerMoney()>=boost/2){
			if (variable.equals("INITIATIVE")){battlefield1.setplayerInitiative(battlefield1.getplayerInitiative() + boost);}
			else if (variable.equals("STRENGTH")){battlefield1.setplayerStr(battlefield1.getplayerStr() + boost);}
			else if (variable.equals("AGILITY")){battlefield1.setplayerAgl(battlefield1.getplayerAgl() + boost);}	
			else if (variable.equals("SPEED")){battlefield1.setplayerSpd(battlefield1.getplayerSpd() + boost);}	
			else if (variable.equals("TRAINING")){
					battlefield1.setplayerTraining_1(battlefield1.getplayerTraining_1() + boost/4);
					battlefield1.setplayerTraining_2(battlefield1.getplayerTraining_2() + boost/4);
					battlefield1.setplayerTraining_3(battlefield1.getplayerTraining_3() + boost/4);
					battlefield1.setplayerTraining_4(battlefield1.getplayerTraining_4() + boost/4);
					battlefield1.setplayerTraining_5(battlefield1.getplayerTraining_5() + boost/4);}
			
			battlefield1.setplayerMoney(battlefield1.getplayerMoney() - boost/5-(boost/(4+(playerVictories/2))));
			printPlainMessageBox(actionString+ "\nHowever, it costs you a bit of money.." +
				"\n almost everthing in this world cost money man!", "Ok","Complete");}
		
			else{printPlainMessageBox("You don't have enough $$!", "Ok","Complete");}
		
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////
	//
	//THESE METHODS BELOW ARE OTHER METHODS
	//
///////////////////////////////////////////////////////////////////////////////////////
	public void printPlainMessageBox(String body, String title, String Action)
	{
		JOptionPane.showMessageDialog(this,
				body+
				"\n"+Action, title, 
				JOptionPane.PLAIN_MESSAGE);
	}
	
	public void dualSimulationLauncher()
	{
		//generate the random enemy with the random weapon
		enemyRace=ShortcutMethods.randomNumberGeneratorMethod(gameObjects.numRaces-1);

		enemyWeapon=ShortcutMethods.randomNumberGeneratorMethod(gameObjects.numWeapons);
		if(playerVictories==1){printPlainMessageBox("First victory is sweet,\n but the second..maybe..","BEWARE","OK");}
		if(playerVictories==3){printPlainMessageBox("The more you win,\n the tougher the enemy is","BEWARE","OK");}
		if(playerVictories==7){printPlainMessageBox("The arena is getting serious now\n..beware","BEWARE","OK");}
		if (playerVictories>8){
		enemyWeapon=ShortcutMethods.randomNumberGeneratorMethodMinIncluded(32, gameObjects.numWeapons);}
		

		
		enemyArmour=ShortcutMethods.randomNumberGeneratorMethod(gameObjects.numArmour);
		
		
		
		//default
		toolBarBottomScene4.setVisible(false);
		playerMovesPanel.setVisible(false);

		
		
	    //display initial status
		combatInfo.setText("COMBAT NFO\n");
		combatInfo.append("You, a(n) "+raceRadioSelectionText[raceSelectedNum-1]+" with a(n) " 
				+ weaponsTextFieldSelectionText[weaponEquippedNum-1]+" came to fight the enemy.\n");
		
		//Initialise battlefield
		 int[] enemyselection=new int[1];//2 choices
		 enemyselection=
		battlefield1.obtainContestantData(combatInfo,raceSelectedNum-1,weaponEquippedNum,armourEquippedNum-gameObjects.numWeapons,
			enemyRace,enemyWeapon,enemyArmour);
		enemyWeapon=enemyselection[0];
		enemyArmour=enemyselection[1];
		
		battlefield1.initialization(combatInfo);
		battlefield1.distanceStatus(fightingStatusInfo);
		battlefield1.fightingStatus(fightingStatusInfo);
		
		playerHealth.setText("Health: "+battlefield1.getPlayerHp());
		enemyHealth.setText("Health: "+battlefield1.getEnemyHp());
		
		playerStamina.setText("Stamina: "+battlefield1.getPlayerStamina());
		enemyStamina.setText("Stamina: "+battlefield1.getEnemyStamina());
		
		distanceLabel.setText("Distance:"+battlefield1.getDistance()+" feet");
		
		shrinkPortrats();
	}
	
	public void dualSimualtionRefreshInformation()
	{

		
			if (sceneNum!=1&&sceneNum!=4)
			{		
				battlefield1.distanceStatus(fightingStatusInfo);
				distanceBar.setPreferredSize(new Dimension(((battlefield1.getDistance()+((battlefield1.getDistance()*3)/7)))/4,20));
				battlefield1.fightingStatus(fightingStatusInfo);
				sceneNum=battlefield1.judge(battlefield1.getEnemyHp(), battlefield1.getPlayerHp(),judgeInfo,sceneNum);
				playerHealth.setText("Health: "+battlefield1.getPlayerHp());
				enemyHealth.setText("Health: "+battlefield1.getEnemyHp());
				playerStamina.setText("Stamina: "+battlefield1.getPlayerStamina());
				enemyStamina.setText("Stamina: "+battlefield1.getEnemyStamina());
				distanceLabel.setText("Distance:"+battlefield1.getDistance()+" feet");
				toolButtonClickedWhileFighting=false;
			}
			else if (sceneNum==1)
			{
				battlefield1.restoreRegData(combatInfo);
				fightingModeStill=false;
				preparationScenePanel.setVisible(true);
				duelSimulationScenePanel.setVisible(false);
				playerMovesPanel.setVisible(false);
				toolBarBottomScene4.setVisible(false);
				//display scene data
				playerVictories+=1;
//				JOptionPane.showMessageDialog(this,
//				"\nVictory! You got his pocket cash.\nAs well the king gave u some cash\nAfter battle you recovered you health, \nbut not your other attributes"+ 
//				"\n and went back to your room"+
//				"\nOK", "YOU WIN", 
//				JOptionPane.PLAIN_MESSAGE);
				
				battlefield1.setplayerHp(battlefield1.getOriginalplayerHp());
				battlefield1.setenemyHp(battlefield1.getOriginalenemyHp());
				battlefield1.setplayerMoney((battlefield1.getplayerMoney()+(battlefield1.getenemyMoney()/2)+(playerVictories*3)+ShortcutMethods.randomNumberGeneratorMethod(10)+((playerVictories^(3)))));
				
			}
			else if (sceneNum==4)
			{
				battlefield1.restoreRegData(combatInfo);
				fightingModeStill=false;
				duelSimulationScenePanel.setVisible(false);
				playerMovesPanel.setVisible(false);
				toolBarBottomScene4.setVisible(false);
				gameOverPanel.setVisible(true);
				battlefield1.setplayerMoney(0);
				ShortcutMethods.outputToTxtFile("*\n"+playerVictories+"\n", "leadersboardsData", true);
				playerVictories=0;
				increaserValue=0;
				JOptionPane.showMessageDialog(this,
				"\nGUESS WHAT? You died. \n" +
				"Your score is sent to the leaderboards\n"+
				"Amount of victories are reset though" +
				"\n", "..", 
				JOptionPane.PLAIN_MESSAGE);

				
			}
			else
			{
				//nothing happens
			}
		
	

		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent c) 
	{
		// TODO Auto-generated method stub
		if (sceneNum==2)
		{
			if (c.getSource()==shopChoiceSelectorTextField)
			{
				shopChoiceSelectorTextField.setText("");
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		if (sceneNum==2)
		{
			if (e.getSource()==shopChoiceSelectorTextField)
			{
				shopChoiceSelectorTextField.setToolTipText
				("Enter number here only!");
			}
		}
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}


	
}


