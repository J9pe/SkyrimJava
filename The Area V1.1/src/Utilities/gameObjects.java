package Utilities;

import Equipment.*;
import Races.*;

public class gameObjects {
	

	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: tired
	 * ##############################################################################################
	 */ 
	/*
	 *======================================================================================================
	 * Welcome to the gameObjects class, below are the data necesary to be shared universally for any other class
	 * Hence all variables and methods are public
	 * They are also all static because this way, they are all sharing the same data, and changing the same data
	 * kinda like a library, except there is only 1 copy of each book
	 * ======================================================================================================
	 */

	// *======================================================================================================
	// * Just a note on the Mythical Race Attributes class and the weapons, and armour class.
	// * its daughter class like orc, imperial are inheriting the parent classes.
	// * I did not put them into seperate classes because this allows more accessibility and potential to create 
	// * complex data and special data specific to each equipment
	// * ======================================================================================================
	// */


// here are the number of races, weapons and armour respectively, crucial for the index of arrays
	final public static int numRaces=12;	
	final public static int numWeapons=46; 
	final public static int numArmour=9;
	
	//races
	public static Blood blood = new Blood();
	public static Bit bit = new Bit();
	public static Bosmer bosmer = new Bosmer();
	public static Darkman darkman = new Darkman();
	public static GreenNeck greenNeck = new GreenNeck();
	public static Huang huang = new Huang();
	public static Imperial imperial = new Imperial();
	public static Khajiit Khajiit = new	Khajiit();
	public static Nord nord = new Nord();
	public static Stickman stickman = new Stickman();
	public static Orc orc = new Orc();
	public static Cheetaman cheetaman = new Cheetaman();
// Now with these races, I can make an array, which can be used for viewing these information,
// such as for the raceSelector Panel in Section 1
	public static MythicalRaceAttributes[] raceArray={blood,bit,bosmer,darkman,greenNeck,huang,imperial,Khajiit,nord,stickman,orc,cheetaman};

	//weapons
	public static Greataxe Greataxe1 = new Greataxe();
	public static Longsword Longsword1 = new Longsword();
	public static ShortSpear ShortSpear1 = new ShortSpear();
	public static Shortsword Shortsword1 = new Shortsword();
	public static Steel_Crossbow Steel_Crossbow1 = new Steel_Crossbow();
	public static Tomhawk Tomhawk1 = new	Tomhawk();
	public static WarHammer WarHammer1 = new WarHammer();
	public static Wooden_Stick Wooden_Stick1 = new Wooden_Stick();
	public static YewLongbow YewLongbow1 = new YewLongbow();
	public static Musket Musket1 = new Musket();
	public static RepeatingCrossbow repeatingCrossbow1 = new RepeatingCrossbow();
	
	public static SimpleBow SimpleBow1=new SimpleBow();
	public static TurkishBow TurkishBow1 =new TurkishBow();
	public static ArrowLauncher ArrowLauncher1=new ArrowLauncher();
	public static Atlatl Atlatl1=new Atlatl();
	public static Dagger Dagger1=new Dagger();
	public static Javelin Javelin1=new Javelin();
	public static Pilum Pilum1=new Pilum();
	public static Sling Sling1=new Sling();
	public static ThrowingKnife ThrowingKnife1=new ThrowingKnife();
	public static ThrowingStar ThrowingStar1=new ThrowingStar();
	public static BaseballBat BaseballBat1=new BaseballBat();
	public static Dao Dao1=new Dao();
	public static BroadSword BroadSword1=new BroadSword();
	public static Steel_Claymore Steel_Claymore1=new Steel_Claymore();
	public static Katana Katana1=new Katana();
	public static Pike Pike1=new Pike();
	public static Lance Lance1=new Lance();
	public static Halberd Halberd1=new Halberd();
	public static Nunchucks Nunchucks1=new Nunchucks();
	public static MorningStar MorningStar1= new MorningStar();
	
	public static CompoundBow CompoundBow1=new CompoundBow();
	public static PumpShotgun Pumpshotgun1=new PumpShotgun();
	public static NukeLauncher NukeLauncher1=new NukeLauncher();
	public static MauserBoltActionRifle Mauser1=new MauserBoltActionRifle();
	public static RPG RPG1=new RPG();
	public static M9 M91=new M9();
	public static AK47 AK471=new AK47();
	public static M4A1 M4A11=new M4A1();
	public static M60 M601=new M60();
	public static TYPE56 TYPE561=new TYPE56();
	public static MP5 MP51=new MP5();
	public static BARRET50CAL BARRET50CAL1=new BARRET50CAL();
	public static M16 M161=new M16();
	
	public static Fist fist1=new Fist();
	public static Claw claw1=new Claw();
	
	
// Now with these weapons, I can make an array, which can be used for viewing these information,
// such as for the shopScene Panel in Section 1
	public static Weapons[] weaponArray={Greataxe1,Longsword1,ShortSpear1,
		Shortsword1,Steel_Crossbow1, Tomhawk1, WarHammer1, Wooden_Stick1,YewLongbow1,Musket1,repeatingCrossbow1,
		SimpleBow1,TurkishBow1,ArrowLauncher1,Atlatl1,Dagger1,Javelin1,Pilum1,Sling1,ThrowingKnife1,
		ThrowingStar1, BaseballBat1, Dao1, BroadSword1, Steel_Claymore1, Katana1, Pike1, Lance1, Halberd1,
		Nunchucks1, MorningStar1, CompoundBow1, Pumpshotgun1, NukeLauncher1, Mauser1, RPG1, M91, AK471, M4A11,
		M601, TYPE561, MP51, BARRET50CAL1, M161, fist1, claw1};
	
	//armour
	public static IronBodyArmour IronBodyArmour1 = new IronBodyArmour();
	public static IronHelmet IronHelmet1 = new IronHelmet();
	public static LeatherBoots LeatherBoots1 = new LeatherBoots();
	public static VikingShield VikingShield1 = new VikingShield();
	//v1.1
	public static PuffyArmour PuffyArmour1 = new PuffyArmour();
	public static ElectroArmour ElectroArmour1 = new ElectroArmour();
	public static AquaArmour AquaArmour1 = new AquaArmour();
	public static ForestArmour ForestArmour1 = new ForestArmour();
	public static CardboardArmour CardboardArmour1 = new CardboardArmour();
// Same with armour
	public static Armour[] armourArray={IronBodyArmour1,IronHelmet1,LeatherBoots1,VikingShield1,PuffyArmour1,
		ElectroArmour1,AquaArmour1,ForestArmour1, CardboardArmour1};

	
}
