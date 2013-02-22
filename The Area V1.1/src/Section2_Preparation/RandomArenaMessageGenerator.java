package Section2_Preparation;
import java.io.IOException;

import javax.swing.JTextArea;

import Races.MythicalRaceAttributes;
import Utilities.MyIO;
import Utilities.ShortcutMethods;
import Utilities.gameObjects;

public class RandomArenaMessageGenerator {

	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: tired
	 * ##############################################################################################
	 */ 
////////////////////////////////////////////////////////////////////////////////////
//The following is for my String Manipulation mark
//note that this is not the only string manipulation I have done throughout my code
//this is just specifically towards String
////////////////////////////////////////////////////////////////////////////////////

//this class is mainly dedicated to the string Manipulation section


	private String[] titleName = {"the Chopper","the Big Guy", "the Beast","the Head Twister", "the Ninja"
			,"the ÉñÍ¯","the Boss","the Ripper", "the Geek","the Metal Cage","the Iron Fist", "the Crusher"};	
	private String[] firstName;
	private String[] verbPastTense;
	private String connectToSubjectAsToDefeat="to defeat";
	private String[] additionalInfo;

	//This is the constructor
	public RandomArenaMessageGenerator()
	{
		firstName=readLineFromFile("data\\1syllablenouns.txt","",1220);//the number are the amount of lines each file has
										//I used microsoft word to obtain them
		verbPastTense=readLineFromFile("data\\2syllableverbs.txt","ed",313);
		additionalInfo=readLineFromFile("data\\3syllableadverbs.txt","",93);
	}
	
////////////////////////////////////////////////////////////////////////////////////
//The following generates a random message based on noun+verb+noun+adverb
//sometimes, it does not make any senese, but its just for pure fun
////////////////////////////////////////////////////////////////////////////////////

	public String randomGenerate()
	{

		int randomIndex1=ShortcutMethods.randomNumberGeneratorMethod(firstName.length/2-1);
		int randomIndex2=ShortcutMethods.randomNumberGeneratorMethod(titleName.length-1);
		int randomIndex3=ShortcutMethods.randomNumberGeneratorMethod(verbPastTense.length/2-1);
		int randomIndex4=ShortcutMethods.randomNumberGeneratorMethod(firstName.length/2-1);
		int randomIndex5=ShortcutMethods.randomNumberGeneratorMethod(additionalInfo.length/2-1);
	
		int randomType=ShortcutMethods.randomNumberGeneratorMethod(8);
		String phrase = "Message";
		
	//Here are a couple of templates I used to display the random sentence
		if (randomType==1){ 
			phrase=("\n\n"+"You might think working out sucks contestant eh? \n Don't complain! Because if you don't work out, " +
					"\n someone will beat you up! For example, this happened to a guy \nwho did not work out and joined the arena:\n"+Character.toUpperCase((firstName[randomIndex1].charAt(0))))+firstName[randomIndex1].substring(1,firstName[randomIndex1].length())+
			" "+titleName[randomIndex2]+" "+verbPastTense[randomIndex3]+
					" "+Character.toUpperCase((firstName[randomIndex4].charAt(0)))+firstName[randomIndex4].substring(1,firstName[randomIndex4].length())+" "+connectToSubjectAsToDefeat+" "+additionalInfo[randomIndex5]+".";
		}
		else if (randomType==2){
				phrase=("\n"+"\n"+Character.toUpperCase((firstName[randomIndex1].charAt(0))))+firstName[randomIndex1].substring(1,firstName[randomIndex1].length())+
				" is awarded the title:"+titleName[randomIndex2]+" "+additionalInfo[randomIndex5]+" today! Congrats!";
			}
		else if (randomType==3){
				phrase=("\n"+"\n"+Character.toUpperCase((firstName[randomIndex1].charAt(0))))+firstName[randomIndex1].substring(1,firstName[randomIndex1].length())+
				", a celebrity, eat some "+firstName[randomIndex4]+" today.";
			}
		else if (randomType==4){
			phrase=("\n"+"\n"+"According to professor "+Character.toUpperCase((firstName[randomIndex1].charAt(0))))+firstName[randomIndex1].substring(1,firstName[randomIndex1].length())+
			", \nthese messages that are popping up does not make sense!"+"\nWell then, did you know that these messages\n are randomly generated through txt files?";
			}
		else if (randomType==5){
			phrase=("\n"+"\n"+"Well,\n hi, I am a hacker, called Mr. Ankun! \nI just hacked into this system, and now, \nI am loading random stuff into this game!\n HEHE!--jokking");
		}
		else if (randomType==6){
			phrase=("\n"+"\n"+"Sir "+Character.toUpperCase((firstName[randomIndex1].charAt(0))))+firstName[randomIndex1].substring(1,firstName[randomIndex1].length())+
			" said that "+Character.toUpperCase((firstName[randomIndex4].charAt(0)))+firstName[randomIndex4].substring(1,firstName[randomIndex4].length())+" are tasty!"+
					"\nAdding some salt might make it even better, or "+additionalInfo[randomIndex5]+"!";
		}
		else if (randomType==7){
			phrase=("\n"+"\n"+"Ok, last night, it was raining "+additionalInfo[randomIndex5]+"\nThus the arena was closed");
		}
		else if (randomType==8){
			phrase=("\n"+"\n"+"Ad: Welcome welcome, to my shop!!!!"+"\nIt is called the "+(Character.toUpperCase((firstName[randomIndex1].charAt(0))))+firstName[randomIndex1].substring(1,firstName[randomIndex1].length())+
					" shop for selling "+(Character.toUpperCase((firstName[randomIndex1].charAt(0))))+firstName[randomIndex1].substring(1,firstName[randomIndex1].length())+
					"(s)!"+ "\nPlease contact (613)-"+ShortcutMethods.randomNumberGeneratorMethod(9)+
					ShortcutMethods.randomNumberGeneratorMethod(9)+
					ShortcutMethods.randomNumberGeneratorMethod(9)+"-"+
					ShortcutMethods.randomNumberGeneratorMethod(9)+
					ShortcutMethods.randomNumberGeneratorMethod(9)+
					ShortcutMethods.randomNumberGeneratorMethod(9)+
					ShortcutMethods.randomNumberGeneratorMethod(9))
					+"\nOr email me at "+firstName[randomIndex1]+
					"@"+(Character.toUpperCase((firstName[randomIndex4].charAt(0))))+firstName[randomIndex1].substring(1,firstName[randomIndex1].length())+
					"mail.com";
		}
		phrase+=("\n\n=========NEXT DAY=========\n\n");
		return phrase;
		
	}
	public String randomGenerateWarTaunt()
	{

		int randomIndex2=ShortcutMethods.randomNumberGeneratorMethod(titleName.length-1);
		int randomIndex3=ShortcutMethods.randomNumberGeneratorMethod(verbPastTense.length/2-1);
	
		int randomType=ShortcutMethods.randomNumberGeneratorMethod(18);
		String phrase = "";
		
	//Here are a couple of templates I used to display the random sentence
		if (randomType==0){ 
			phrase=("\nYou think you're strong?");
		}
		else if (randomType==1){ 
			phrase=("\n\n"+"Go suck a"+titleName[randomIndex2]+", didn't you already get "+verbPastTense[randomIndex3]+
					", so just die.");
		}
		else if (randomType==2){phrase=("#@*& off!");}
		else if (randomType==3){phrase=("I am gonna kill you!");}
		else if (randomType==4){phrase=("That's all you got?");}
		else if (randomType==5){phrase=("Anything else you got?");}
		else if (randomType==6){phrase=("Son of a bitch!");}
		else if (randomType==7){phrase=("God bless me...");}
		else if (randomType==8){
				phrase=("Die! You"+" "+titleName[randomIndex2]+"!");
			}
		else{phrase=("...");}
		return phrase;
		
	}
	//This just reads the line from the file using IO
	public  String[] readLineFromFile(String path, String additionalLetters,int size)
	{		
		MyIO.openInputFile(path);
		boolean endOfLine=false;
		int x = 0;
		String[] readLinerString=new String[size];
		while(!endOfLine){
			
			try{
					
				readLinerString[x]=MyIO.readLine()+additionalLetters;
			}
			catch(Exception e){
				endOfLine=true;
			}
			x++;
		}
		try {
			MyIO.closeInputFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return readLinerString;
		
	}

	


	
	
}