import Section1_GUI_Interface.*;
import Utilities.*;
public class mainTheArena {
	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: tired
	 * ##############################################################################################
	 */ 
	/*
	 *======================================================================================================
	 * I hope you look at this class first, because this is the one the starts everything
	 * 
	 * so this is my main class, as you can see, this is in my default package
	 * The reason why I put it in the default package is because
	 * I like to organise my classes, and because
	 * the default package exists in every single project,
	 * I tend to treat this package as the one that organises and runs the entire program
	 * Throughout my entire program, this class is the only one with that organises the entire program
	 * Hence there is only 1 class in default package
	 * ======================================================================================================
	 */
	public static void main(String[] args)	{
		//There are two versions in this game, one is the GUI version which uses a JFrame, 
		//The other version is the console version, which uses the system(on a jar file,
		//it would require a command prompt)
		
		//Here are the two versions, I wrote both on the main method, but I commented one out
		//The purpose for this is to show the possibility of both versions, by just simply
		//commenting or commenting out a method.
		
		GUIVersion_Launcher();
		
		//<<This one below is commented out
		//consoleVersion_Launcher();
	}
	
	public static void consoleVersion_Launcher()
	{//The Console Version contains static methods 
		//The purpose of the static methods is so that I don't need to create an object
		//In addition, all these methods are just displaying information and not storing data
		//which means I don't really need to create an object for this
		
		ConsoleVersion.introductionMethod();//this method displays Strings that provides information for the user
											//it introduces the program
		
		ConsoleVersion.mainMenu();			//Here using scanners, I allow the user to input their choice 
											//This method displays a menu
		
		ConsoleVersion.endProgramMethod();	//The last method just ends the program
	}
	
	public static void GUIVersion_Launcher()
	{//The GUI version consists a series of non-static methods. This is because, every time one launches this JFrame,
		//it acts as an individual class, and if I had static methods, I could only store one data at the time.
		//This means that all my data is shared, and hence I cannot have 2 JFrames at a time.
		
		menuDisplayGUI menuDisplay1;//Firstly, my program generates a JFrame called menuDisplay1. 
		menuDisplay1=new menuDisplayGUI();	//It needs to access the Section 1 Package
		
		menuDisplay1.displayGUI();//The method on the left displays the GUI by turning the JFrame visible==true.	
		
	}
	
	//I suggest you to go to the Console version first
	//then GUI
}
