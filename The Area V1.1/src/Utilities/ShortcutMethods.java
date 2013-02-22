package Utilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import Equipment.IronBodyArmour;
import Equipment.IronHelmet;
import Equipment.LeatherBoots;
import Equipment.VikingShield;


	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: tired
	 * ##############################################################################################
	 */ 

	/*
	 *======================================================================================================
	 * Welcome to the shortcut methods class, this is one of the most CRUCIAL classes!
	 * When you were programming, have you ever realised that I am using the same method over and 
	 * over again, but in different classes? Well, this class allows all the other classes to get access from 
	 * this class! For example, a method to randomly generate a number, well this class has that!
	 * ======================================================================================================
	 */

	 // This class is just to output information that is either unessary or redundant 
	 // if not created in a method, like generating spaces and generating a random number etc.

public class ShortcutMethods implements ImageObserver {//ever wondered what image observer is for?
							//this is an interface for changing the size of my images
							//explained further below
	
//First of all, here is a series of different fonts,
//I could of put this in an array, but originally I though I was only gonna have 2 fonts, but now, i realize
//that I would need more
//no time to put it to an array, but that is something that I can definitely improve on

	public final static Font font1= new Font("Lucida Handwriting", Font.BOLD, 25);// need an instance when calling from another method
	public final static Font font2= new Font("Serif", Font.PLAIN,14);// need an instance when calling from another method
	public final static Font font3= new Font("Terminal", Font.TYPE1_FONT,16);// need an instance when calling from another method
	public final static Font font4= new Font("Old English Text MT",Font.TYPE1_FONT,20);// need an instance when calling from another method
	public final static Font font5= new Font("Georgia",Font.TYPE1_FONT,15);// need an instance when calling from another method
	public final static Font font6= new Font("Arial",Font.TYPE1_FONT,50);// need an instance when calling from another method
	public final static Font font7= new Font("Times New Roman",Font.BOLD,23);// need an instance when calling from another method
	

	/*
	 *======================================================================================================
	 * Now here are the custom colors, that I made, one is brown(actually light brown); the 
	 * other is forest green, the rest of the colors I just use Color.whatever
	 * ======================================================================================================
	 */
	public final static Color brown=new Color(184,134,12);
	public final static Color forestGreen=new Color(34,139,34);



	/*
	 *======================================================================================================
	 * The following class is to load the description for the desired race selectedNum, and it
         * calls from the class gameObjects; also keep in mind that this is in the shortcut method because.
	 * more than one class can obtain the descrition of the desired race
	 * ======================================================================================================
	 */
	public static String loadRaceDescription(int raceSelectedNum, String raceNameDescription)
	//this one only loads one by one after each corresponding user interaction
	{
		try
		{
			if (raceSelectedNum==0)
			{
				raceNameDescription=gameObjects.blood.getDescription();
			}
			else if (raceSelectedNum==1)
			{
				raceNameDescription=gameObjects.bit.getDescription();
			}
			else if (raceSelectedNum==2)
			{
				raceNameDescription=gameObjects.bosmer.getDescription();
			}
			else if (raceSelectedNum==3)
			{
				raceNameDescription=gameObjects.darkman.getDescription();
			}
			else if (raceSelectedNum==4)
			{
				raceNameDescription=gameObjects.greenNeck.getDescription();
			}
			else if (raceSelectedNum==5)
			{
				raceNameDescription=gameObjects.huang.getDescription();
			}
			else if (raceSelectedNum==6)
			{
				raceNameDescription=gameObjects.imperial.getDescription();
			}
			else if (raceSelectedNum==7)
    		{
				raceNameDescription=gameObjects.Khajiit.getDescription();
    		}
			else if (raceSelectedNum==8)
    		{
				raceNameDescription=gameObjects.nord.getDescription();
    		}
			else if (raceSelectedNum==9)
			{
				raceNameDescription=gameObjects.stickman.getDescription();
			}
			else if (raceSelectedNum==10)
			{
				raceNameDescription=gameObjects.orc.getDescription();
			}
			else if (raceSelectedNum==11)
			{
				raceNameDescription=gameObjects.cheetaman.getDescription();
			}
			else{}
		}
		catch(Exception noRaceSelected)
		{
			System.out.print("failed to load race Description");
		}
		return raceNameDescription;
	}
	

	/*
	 *======================================================================================================
	 * The following class is to load the description for the desired weapon selectedNum, and it
         * calls from the class gameObjects; also keep in mind that this is in the shortcut method because.
	 * more than one class can obtain the descrition of the desired weapon
	 * ======================================================================================================
	 */
	public static void loadWeaponDescription(int weaponSelectedNum, JTextArea outputer)
	//this one only loads one by one after each corresponding user interaction
	{
		try
		{
			//set Weapon Descriptions
			if (weaponSelectedNum==1)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Greataxe1.getDescription());
			}
			else if (weaponSelectedNum==2)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Longsword1.getDescription());
			}	
			else if (weaponSelectedNum==3)
			{
				outputer.setText(weaponSelectedNum+gameObjects.ShortSpear1.getDescription());
			}
			else if (weaponSelectedNum==4)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Shortsword1.getDescription());
			}
			else if (weaponSelectedNum==5)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Steel_Crossbow1.getDescription());
			}
			else if (weaponSelectedNum==6)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Tomhawk1.getDescription());
			}
			else if (weaponSelectedNum==7)
			{
				outputer.setText(weaponSelectedNum+gameObjects.WarHammer1.getDescription());
			}
			else if (weaponSelectedNum==8)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Wooden_Stick1.getDescription());
			}
			else if (weaponSelectedNum==9)
			{
				outputer.setText(weaponSelectedNum+gameObjects.YewLongbow1.getDescription());
			}
			else if (weaponSelectedNum==10)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Musket1.getDescription());
			}
			else if (weaponSelectedNum==11)
			{
				outputer.setText(weaponSelectedNum+gameObjects.repeatingCrossbow1.getDescription());
			}
			else if (weaponSelectedNum==12)
			{
				outputer.setText(weaponSelectedNum+gameObjects.SimpleBow1.getDescription());
			}
			else if (weaponSelectedNum==13)
			{
				outputer.setText(weaponSelectedNum+gameObjects.TurkishBow1.getDescription());
			}
			else if (weaponSelectedNum==14)
			{
				outputer.setText(weaponSelectedNum+gameObjects.ArrowLauncher1.getDescription());
			}
			else if (weaponSelectedNum==15)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Atlatl1.getDescription());
			}
			else if (weaponSelectedNum==16)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Dagger1.getDescription());
			}
			else if (weaponSelectedNum==17)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Javelin1.getDescription());
			}
			else if (weaponSelectedNum==18)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Pilum1.getDescription());
			}
			else if (weaponSelectedNum==19)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Sling1.getDescription());
			}
			else if (weaponSelectedNum==20)
			{
				outputer.setText(weaponSelectedNum+gameObjects.ThrowingKnife1.getDescription());
			}
			else if (weaponSelectedNum==21)
			{
				outputer.setText(weaponSelectedNum+gameObjects.ThrowingStar1.getDescription());
			}
			else if (weaponSelectedNum==22)
			{
				outputer.setText(weaponSelectedNum+gameObjects.BaseballBat1.getDescription());
			}
			else if (weaponSelectedNum==23)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Dao1.getDescription());
			}
			else if (weaponSelectedNum==24)
			{
				outputer.setText(weaponSelectedNum+gameObjects.BroadSword1.getDescription());
			}
			else if (weaponSelectedNum==25)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Steel_Claymore1.getDescription());
			}
			else if (weaponSelectedNum==26)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Katana1.getDescription());
			}
			else if (weaponSelectedNum==27)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Pike1.getDescription());
			}
			else if (weaponSelectedNum==28)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Lance1.getDescription());
			}
			else if (weaponSelectedNum==29)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Halberd1.getDescription());
			}
			else if (weaponSelectedNum==30)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Nunchucks1.getDescription());
			}
			else if (weaponSelectedNum==31)
			{
				outputer.setText(weaponSelectedNum+gameObjects.MorningStar1.getDescription());
			}
			else if (weaponSelectedNum==32)
			{
				outputer.setText(weaponSelectedNum+gameObjects.CompoundBow1.getDescription());
			}
			else if (weaponSelectedNum==33)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Pumpshotgun1.getDescription());
			}
			else if (weaponSelectedNum==34)
			{
				outputer.setText(weaponSelectedNum+gameObjects.NukeLauncher1.getDescription());
			}
			else if (weaponSelectedNum==35)
			{
				outputer.setText(weaponSelectedNum+gameObjects.Mauser1.getDescription());
			}
			else if (weaponSelectedNum==36)
			{
				outputer.setText(weaponSelectedNum+gameObjects.RPG1.getDescription());
			}
			else if (weaponSelectedNum==37)
			{
				outputer.setText(weaponSelectedNum+gameObjects.M91.getDescription());
			}
			else if (weaponSelectedNum==38)
			{
				outputer.setText(weaponSelectedNum+gameObjects.AK471.getDescription());
			}
			else if (weaponSelectedNum==39)
			{
				outputer.setText(weaponSelectedNum+gameObjects.M4A11.getDescription());
			}
			else if (weaponSelectedNum==40)
			{
				outputer.setText(weaponSelectedNum+gameObjects.M601.getDescription());
			}
			else if (weaponSelectedNum==41)
			{
				outputer.setText(weaponSelectedNum+gameObjects.TYPE561.getDescription());
			}
			else if (weaponSelectedNum==42)
			{
				outputer.setText(weaponSelectedNum+gameObjects.MP51.getDescription());
			}
			else if (weaponSelectedNum==43)
			{
				outputer.setText(weaponSelectedNum+gameObjects.BARRET50CAL1.getDescription());
			}	
			else if (weaponSelectedNum==44)
			{
				outputer.setText(weaponSelectedNum+gameObjects.M161.getDescription());
			}	
			else if (weaponSelectedNum==45)
			{
				outputer.setText(weaponSelectedNum+gameObjects.fist1.getDescription());
			}
			else if (weaponSelectedNum==46)
			{
				outputer.setText(weaponSelectedNum+gameObjects.claw1.getDescription());
			}
			else{}
		}
		catch(Exception noWeaponSelected)
		{
			outputer.setText("\n\n\tYou have to select a weapon first\n\t-type the num of the weapon\n\n");
		}
	}


	/*
	 *======================================================================================================
	 * The following class is to load the description for the desired armour selectedNum, and it
         * calls from the class gameObjects; also keep in mind that this is in the shortcut method because.
	 * more than one class can obtain the descrition of the desired armour
	 * ======================================================================================================
	 */
	public static void loadArmourDescription(int armourSelectedNum, JTextArea outputer)
	//this one only loads one by one after each corresponding user interaction
	{
		try
		{	
			//set armour Descriptions
			if (armourSelectedNum==gameObjects.numWeapons+1)
			{
				outputer.setText(armourSelectedNum+gameObjects.IronBodyArmour1.getDescription());
			}
			else if (armourSelectedNum==gameObjects.numWeapons+2)
			{
				outputer.setText(armourSelectedNum+gameObjects.IronHelmet1.getDescription());
			}	
			else if (armourSelectedNum==gameObjects.numWeapons+3)
			{
				outputer.setText(armourSelectedNum+gameObjects.LeatherBoots1.getDescription());
			}	
			else if (armourSelectedNum==gameObjects.numWeapons+4)
			{
				outputer.setText(armourSelectedNum+gameObjects.VikingShield1.getDescription());
			}	
			else if (armourSelectedNum==gameObjects.numWeapons+5)
			{
				outputer.setText(armourSelectedNum+gameObjects.PuffyArmour1.getDescription());
			}	
			else if (armourSelectedNum==gameObjects.numWeapons+6)
			{
				outputer.setText(armourSelectedNum+gameObjects.ElectroArmour1.getDescription());
			}	
			else if (armourSelectedNum==gameObjects.numWeapons+7)
			{
				outputer.setText(armourSelectedNum+gameObjects.AquaArmour1.getDescription());
			}	
			else if (armourSelectedNum==gameObjects.numWeapons+8)
			{
				outputer.setText(armourSelectedNum+gameObjects.ForestArmour1.getDescription());
			}	
			else if (armourSelectedNum==gameObjects.numWeapons+9)
			{
				outputer.setText(armourSelectedNum+gameObjects.CardboardArmour1.getDescription());
			}	
			else{}
		
		}
		catch(Exception noarmourSelected)
		{
			outputer.setText("\n\n\tNO ARMOUR\n\t-type the num of the armour\n\n");
		}
	}
	//STALL
	public static void stall(int num) {
		try {Thread.sleep(num/10);} //CHANGE NUM FOR TESTING PURPOSES
		catch (Exception e) {System.out.print("\nERROR\n");}
	}//end method
	//
	/*
	 *======================================================================================================
	 * This creates/returnsan image icon, or returns null if path != null
	 * ======================================================================================================
	 */	
	//CREATE IMAGE ICON
    public ImageIcon createImageIcon(String path,String description) 
    {	
	//if the path is not null, I will return a proper image icon, and the path and description is from the parameters
		if (path != null) 
		{
			return new ImageIcon(path, description);
		} 
	//or else it will print an error
		else 
		{
			System.err.println("Couldn't find file: " + path);
			return null;
		}
    }

		/*
	 *======================================================================================================
	 * Another class that deals with image icons,
	 * this class changes the size of the image, and depends on your desired scale(a parameter)
	 * ======================================================================================================
	 */
    public ImageIcon scale(Image src, double scale) 
    {         
	//the width and height of the image will be scaled 
    	int w = (int)(scale*src.getWidth(this));  
    	int h = (int)(scale*src.getHeight(this));

	//then it would regenerate this image
    	int type = BufferedImage.TYPE_INT_RGB;        
    	BufferedImage dst = new BufferedImage(w, h, type);     
	//The BufferedImage subclass describes an Image with an accessible buffer of image data.
    	
	//This Graphics2D class extends the Graphics class to provide more sophisticated control over geometry, 
	//coordinate transformations, color management, and text layout. This is the fundamental class for
 	//rendering 2-dimensional shapes, text and images on the Java(tm) platform. 
	Graphics2D g2 = dst.createGraphics();        
    	g2.drawImage(src, 0, 0, w, h, this);       
    	g2.dispose();       
    	return new ImageIcon(dst);  
    } 
    
	// -----------------------------------------------------------------------------------------
	// Random Number Generating Method
//	 *======================================================================================================
//	 * By using a maxNumber, I can generate a number from 1-MaxNumber
//	 * ======================================================================================================
//	 */
	public static int randomNumberGeneratorMethod(int maxNumber) 
	{
		double randomNumber = 1 + Math.random() * maxNumber;
		int i = (int) randomNumber;
		return i;
	}
	
	// -----------------------------------------------------------------------------------------
	// Random Number Generating Method WITH init
//	 *======================================================================================================
//	 * By using a maxNumber, I can generate a number from 1-MaxNumber
//	 * ======================================================================================================
//	 */
	public static int randomNumberGeneratorMethodMinIncluded(int minNumber,int maxNumber ) 
	{
		double randomNumber = minNumber +1+ (Math.random() * (maxNumber-minNumber));
		int i = (int) randomNumber;
		return i;
	}
	
	//------------------------------------------------------------------------------------------
	//The rest is for Console
	// -----------------------------------------------------------------------------------------


	// -----------------------------------------------------------------------------------------
	// Spaces Generating Method
	// -----------------------------------------------------------------------------------------
//	 *======================================================================================================
//	 * Now this part is for clearing the screen; In fact it does not clear the console screen
//	 * It rather generates a couple of spaces so that is looks as if the screen is cleared
//	 * ======================================================================================================
//	 */
	public static void generateSpaces(int m)
	{
		for (int i = 0; i < m; i++)
		{
			System.out.println("\n");
		}
	}

	// -----------------------------------------------------------------------------------------
	// Place data into a file Method
	// -----------------------------------------------------------------------------------------
	// Now this part is for generating a file to contain the text fileText

    public static void outputToTxtFile( String fileText, String title, boolean addable)
    {

    	try {
    		MyIO.createOutputFile("data/"+title+".txt", addable);//true adds to original; false rewrites it
    		MyIO.print(fileText);
    		MyIO.closeOutputFile();
		} catch (Exception cannotOpenFile) {
			// TODO Auto-generated catch block
			cannotOpenFile.printStackTrace();
			System.out.print("Cannot output to txt file");
		}
    }
    
	// -----------------------------------------------------------------------------------------
	// Read data from a file Method
	// -----------------------------------------------------------------------------------------
	// Now this part is for obtaining information of a file
    public String readFromTxtFile(String title)
    {
    	
    	int lineNum=0;
    	int lineCounter=0;
    	boolean error=false;
    	MyIO.openInputFile("data/"+title+".txt");
    		while (error==false)
    		{
    			lineCounter++;
	    		try 
	        	{

	    			if ((MyIO.readLine()!=null)) 
		    		{
		    			
		    			MyIO.readLine();
		    		}
		    		else
		    		{
		    			error=true;
		    		}
	        	}
	    		catch(Exception e){

	    		}
    		}
    		
			try {
				MyIO.closeInputFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			lineNum=lineCounter+1;
			System.out.print(lineNum+"<<<");
    	
    	
    	int leadersboardsMemory=1000;
    	boolean error2=false;
    	int[] outputInt=new int[leadersboardsMemory];
    	String[] outputString=new String[leadersboardsMemory];
    	String list = "";
    

	//The section below is for the highscores, in which I will sort the info and create highscores in increasing order
    	try 
    	{
    		MyIO.openInputFile("data/"+title+".txt");
		} 
    	catch (Exception e) 
    	{
    		for (int x=0;x<outputString.length;x++){
    		outputString[x]="<NO FILE>";}
    	}
		    	for(int x=0;x<leadersboardsMemory;x++){
		    	outputString[x]="";}
   		while (error2==false){
	    	try 
	    	{
	    		
	    		
	    		if ((MyIO.readLine()!=null)) 
	    		{
	    			for (int x=1; x<=lineNum; x++)
	    			{
	    				int a=Integer.parseInt(MyIO.readLine());
	    				
	    				outputInt[x]=a;
	    				
	    				
	    			}
	    			Arrays.sort(outputInt);
	    			for (int x=leadersboardsMemory-1;x>=leadersboardsMemory-1-lineNum;x--){
	    				list+=outputString[x]+="Number:"+(leadersboardsMemory-x)+" had "+outputInt[x]+" victories\n";
	    			}
	    		}
	    		else
	    		{
	    			error2=true;
	    		}
	    		
			} 
	    	catch (Exception e) 
	    	{
	    		error2=true;
	    		
	    		try 
	    		{
					MyIO.closeInputFile();
				} 
	    		catch (IOException e1) 
	    		{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
   		}
		try 
		{
			MyIO.closeInputFile();
		} 
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return list;
    	
    }
    
	//This is to update the image, once the size is changed
	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
