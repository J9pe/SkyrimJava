package Section2_Preparation;
import Races.MythicalRaceAttributes;
import Utilities.gameObjects;

public class Contestant {
	

	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: happy
	 * ##############################################################################################
	 */ 
////////////////////////////////////////////////////////////////////////////////////
//The following is crucial for the contestant information for running a battle simulator
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//It just contains all the variables necessary for combat
////////////////////////////////////////////////////////////////////////////////////

	/////////////////////////////////////////////////////////
	private String ContestantName;
		public String getContestantName()
		{
		return ContestantName;
		}
		
	private int ContestantAtk;
		public int getContestantAtk()
		{
		return ContestantAtk;
		}
		
	private int ContestantMve_Piercing;
		public int getContestantMve_Piercing()
		{
		return ContestantMve_Piercing;
		}
	private int ContestantMve_Slash;
		public int getContestantMve_Slash()
		{
		return ContestantMve_Slash;
		}	
	private int ContestantMve_Crush;
		public int getContestantMve_Crush()
		{
		return ContestantMve_Crush;
		}
	private int ContestantMve_Shoot;
		public int getContestantMve_Shoot()
		{
		return ContestantMve_Shoot;
		}
		
	private int ContestantGrd;
		public int getContestantGrd()
		{
		return ContestantGrd;
		}
	
	private int ContestantHp;
		public int getContestantHp()
		{
		return ContestantHp;
		}
	
	private int ContestantDefence_SLASH;
		public int getContestantDefence_SLASH()
		{
		return ContestantDefence_SLASH;
		}
	private int ContestantDefence_PIERCING;
		public int getContestantDefence_PIERCING()
		{
		return ContestantDefence_PIERCING;
		}
	private int ContestantDefence_CRUSH;
		public int getContestantDefence_CRUSH()
		{
		return ContestantDefence_CRUSH;
		}
		
	private int ContestantSpd;
		public int getContestantSpd()
		{
		return ContestantSpd;
		}
	
	private int ContestantAgl;
		public int getContestantAgl()
		{
		return ContestantAgl;
		}

	private int ContestantTraining_1;
	

		public void setContestantTraining_1(int t1) {
			this.ContestantTraining_1= t1;
		}
		public int getContestantTraining_1() {
			return ContestantTraining_1;
		}
		public void addContestantTraining_1(int num) {
			ContestantTraining_1+=num;
		}

	private int ContestantTraining_2;

		public void setContestantTraining_2(int t2) {
			this.ContestantTraining_2= t2;
		}
		public int getContestantTraining_2() {
			return ContestantTraining_2;
		}
		public void addContestantTraining_2(int num) {
			ContestantTraining_2+=num;
		}
	
	private int ContestantTraining_3;

		public void setContestantTraining_3(int t3) {
			this.ContestantTraining_3= t3;
		}
		public int getContestantTraining_3() {
			return ContestantTraining_3;
		}
		public void addContestantTraining_3(int num) {
			ContestantTraining_3+=num;
		}
		
	private int ContestantTraining_4;

		public void setContestantTraining_4(int t4) {
			this.ContestantTraining_4= t4;
		}
		public int getContestantTraining_4() {
			return ContestantTraining_4;
		}
		public void addContestantTraining_4(int num) {
			ContestantTraining_4+=num;
		}
		
	private int ContestantTraining_5;

		public void setContestantTraining_5(int t5) {
			this.ContestantTraining_5= t5;
		}
		public int getContestantTraining_5() {
			return ContestantTraining_5;
		}
		public void addContestantTraining_5(int num) {
			ContestantTraining_5+=num;
		}
		
	private int ContestantEdc;
		public int getContestantEdc()
		{
		return ContestantEdc;
		}
	
	private int ContestantStamina;
		public int getContestantStamina()
		{
		return ContestantStamina;
		}
		
	private int ContestantInitialWealth;
	public int getContestantInitialWealth() {
		return ContestantInitialWealth;
	}
	public void setContestantInitialWealth(int InitialWealth) {
		ContestantInitialWealth = InitialWealth;
	}
	
	private int ContestantInitiative;
	public int getContestantInitiative() {
		return ContestantInitiative;
	}
	public void setContestantInitiative(int contestantInitiative) {
		ContestantInitiative = contestantInitiative;
	}

	private int ContestantWgt;
		public int getContestantWgt()
		{
		return ContestantWgt;
		}
		
	//weapon
	private String ContestantWeapon;
		public String getContestantWeapon()
		{
		return ContestantWeapon;
		}
	private String ContestantWeaponWeight;
		public String getContestantWeaponWeight()
		{
		return ContestantWeaponWeight;
		}
	private int ContestantWeaponRgn;
		public int getContestantWeaponRgn()
		{
		return ContestantWeaponRgn;
		}
	private int ContestantWeaponAtkSpd;
		public int getContestantWeaponAtkSpd()
		{
		return ContestantWeaponAtkSpd;
		}

	private int ContestantWeaponType;
		public int getContestantWeaponType()
		{
		return ContestantWeaponType;
		}

	private int ContestantWeaponPrice;
		public int getContestantWeaponPrice()
		{
		return ContestantWeaponPrice;
		}
		//Armour
		
	private int ContestantArmourType;
		public int getContestantArmourType()
		{
		return ContestantArmourType;
		}
	private int ContestantArmourPrice;
		public int getContestantArmourPrice()
		{
		return ContestantArmourPrice;
		}
	private String ContestantArmour;
		public String getContestantArmour()
		{
		return ContestantArmour;
		}
	private int ContestantArmourDefence_SLASH;
		public int getContestantArmourDefence_SLASH()
		{
		return ContestantArmourDefence_SLASH;
		}
	private int ContestantArmourDefence_PIERCING;
		public int getContestantArmourDefence_PIERCING()
		{
		return ContestantArmourDefence_PIERCING;
		}
	private int ContestantArmourDefence_CRUSH;
		public int getContestantArmourDefence_CRUSH()
		{
		return ContestantArmourDefence_CRUSH;
		}
		
	
	private int ContestantArmourGuardBooster;
		public int getContestantArmourGuardBooster()
		{
		return ContestantArmourGuardBooster;
		}
		
	private int ContestantArmourWeight;
		public int getContestantArmourWeight()
		{
		return ContestantArmourWeight;
		}
		
	private int ContestantArmourSpeedBooster;
		public int getContestantArmourSpeedBooster()
		{
		return ContestantArmourSpeedBooster;
		}
////////////////////////////////////////////////////////////////////////////////////
//Here is the beautiful constructor
////////////////////////////////////////////////////////////////////////////////////
		
	public Contestant(boolean dTBoolean, String youortheenethis, int thisRace, int thisWeapon, int thisArmour)
	{	
		
		setData(dTBoolean, youortheenethis, thisRace, thisWeapon, thisArmour);
		
	}
////////////////////////////////////////////////////////////////////////////////////
//The following sets the data for the race, weapon, and armour
////////////////////////////////////////////////////////////////////////////////////
	public void setData(boolean dTBoolean, String youortheenethis, int thisRace, int thisWeapon, int thisArmour)
	{
		if (thisWeapon==1)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Greataxe1.getweaponName(), gameObjects.Greataxe1.getAttack_SLASH(), 
				gameObjects.Greataxe1.getAttack_CRUSH(), gameObjects.Greataxe1.getAttack_PIERCING(),
				gameObjects.Greataxe1.getWeaponRange(), gameObjects.Greataxe1.getWeaponType(), gameObjects.Greataxe1.getAttackSpeed(),gameObjects.Greataxe1.getWeaponCost());		
		}
		else if (thisWeapon==2)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Longsword1.getweaponName(), gameObjects.Longsword1.getAttack_SLASH(), 
				gameObjects.Longsword1.getAttack_CRUSH(), gameObjects.Longsword1.getAttack_PIERCING(),
				gameObjects.Longsword1.getWeaponRange(), gameObjects.Longsword1.getWeaponType(), gameObjects.Longsword1.getAttackSpeed(),gameObjects.Longsword1.getWeaponCost());
		}
		else if (thisWeapon==3)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.ShortSpear1.getweaponName(), gameObjects.ShortSpear1.getAttack_SLASH(), 
				gameObjects.ShortSpear1.getAttack_CRUSH(), gameObjects.ShortSpear1.getAttack_PIERCING(),
				gameObjects.ShortSpear1.getWeaponRange(), gameObjects.ShortSpear1.getWeaponType(), gameObjects.ShortSpear1.getAttackSpeed(),gameObjects.ShortSpear1.getWeaponCost());
		}
		else if (thisWeapon==4)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Shortsword1.getweaponName(), gameObjects.Shortsword1.getAttack_SLASH(), 
				gameObjects.Shortsword1.getAttack_CRUSH(), gameObjects.Shortsword1.getAttack_PIERCING(),
				gameObjects.Shortsword1.getWeaponRange(), gameObjects.Shortsword1.getWeaponType(), gameObjects.Shortsword1.getAttackSpeed(),gameObjects.Shortsword1.getWeaponCost());
		}
		
		else if (thisWeapon==5)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Steel_Crossbow1.getweaponName(), gameObjects.Steel_Crossbow1.getAttack_SLASH(), 
				gameObjects.Steel_Crossbow1.getAttack_CRUSH(), gameObjects.Steel_Crossbow1.getAttack_PIERCING(),
				gameObjects.Steel_Crossbow1.getWeaponRange(), gameObjects.Steel_Crossbow1.getWeaponType(), gameObjects.Steel_Crossbow1.getAttackSpeed(),gameObjects.Steel_Crossbow1.getWeaponCost());		
		}
		else if (thisWeapon==6)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Tomhawk1.getweaponName(), gameObjects.Tomhawk1.getAttack_SLASH(), 
				gameObjects.Tomhawk1.getAttack_CRUSH(), gameObjects.Tomhawk1.getAttack_PIERCING(),
				gameObjects.Tomhawk1.getWeaponRange(), gameObjects.Tomhawk1.getWeaponType(), gameObjects.Tomhawk1.getAttackSpeed(),gameObjects.Tomhawk1.getWeaponCost());
		}
		else if (thisWeapon==7)
		{	
			ContestantVariables_Weapons_Shortcut(gameObjects.WarHammer1.getweaponName(), gameObjects.WarHammer1.getAttack_SLASH(), 
				gameObjects.WarHammer1.getAttack_CRUSH(), gameObjects.WarHammer1.getAttack_PIERCING(),
				gameObjects.WarHammer1.getWeaponRange(), gameObjects.WarHammer1.getWeaponType(), gameObjects.WarHammer1.getAttackSpeed(),gameObjects.WarHammer1.getWeaponCost());
		}
		else if (thisWeapon==8)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Wooden_Stick1.getweaponName(), gameObjects.Wooden_Stick1.getAttack_SLASH(), 
				gameObjects.Wooden_Stick1.getAttack_CRUSH(), gameObjects.Wooden_Stick1.getAttack_PIERCING(),
				gameObjects.Wooden_Stick1.getWeaponRange(), gameObjects.Wooden_Stick1.getWeaponType(), gameObjects.Wooden_Stick1.getAttackSpeed(),gameObjects.Wooden_Stick1.getWeaponCost());
		}
		else if (thisWeapon==9)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.YewLongbow1.getweaponName(), gameObjects.YewLongbow1.getAttack_SLASH(), 
				gameObjects.YewLongbow1.getAttack_CRUSH(), gameObjects.YewLongbow1.getAttack_PIERCING(),
				gameObjects.YewLongbow1.getWeaponRange(), gameObjects.YewLongbow1.getWeaponType(), gameObjects.YewLongbow1.getAttackSpeed(),gameObjects.YewLongbow1.getWeaponCost());
		}
		else if (thisWeapon==10)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Musket1.getweaponName(), gameObjects.Musket1.getAttack_SLASH(), 
				gameObjects.Musket1.getAttack_CRUSH(), gameObjects.Musket1.getAttack_PIERCING(),
				gameObjects.Musket1.getWeaponRange(), gameObjects.Musket1.getWeaponType(), gameObjects.Musket1.getAttackSpeed(),gameObjects.Musket1.getWeaponCost());
		}
		else if (thisWeapon==11)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.repeatingCrossbow1.getweaponName(), gameObjects.repeatingCrossbow1.getAttack_SLASH(), 
					gameObjects.repeatingCrossbow1.getAttack_CRUSH(), gameObjects.repeatingCrossbow1.getAttack_PIERCING(),
					gameObjects.repeatingCrossbow1.getWeaponRange(), gameObjects.repeatingCrossbow1.getWeaponType(), gameObjects.repeatingCrossbow1.getAttackSpeed(),gameObjects.repeatingCrossbow1.getWeaponCost());
		}
		else if (thisWeapon==12)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.SimpleBow1.getweaponName(), gameObjects.SimpleBow1.getAttack_SLASH(), 
					gameObjects.SimpleBow1.getAttack_CRUSH(), gameObjects.SimpleBow1.getAttack_PIERCING(),
					gameObjects.SimpleBow1.getWeaponRange(), gameObjects.SimpleBow1.getWeaponType(), gameObjects.SimpleBow1.getAttackSpeed(),gameObjects.SimpleBow1.getWeaponCost());
		}
		else if (thisWeapon==13)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.TurkishBow1.getweaponName(), gameObjects.TurkishBow1.getAttack_SLASH(), 
					gameObjects.TurkishBow1.getAttack_CRUSH(), gameObjects.TurkishBow1.getAttack_PIERCING(),
					gameObjects.TurkishBow1.getWeaponRange(), gameObjects.TurkishBow1.getWeaponType(), gameObjects.TurkishBow1.getAttackSpeed(),gameObjects.TurkishBow1.getWeaponCost());
		}
		else if (thisWeapon==14)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.ArrowLauncher1.getweaponName(), gameObjects.ArrowLauncher1.getAttack_SLASH(), 
					gameObjects.ArrowLauncher1.getAttack_CRUSH(), gameObjects.ArrowLauncher1.getAttack_PIERCING(),
					gameObjects.ArrowLauncher1.getWeaponRange(), gameObjects.ArrowLauncher1.getWeaponType(), gameObjects.ArrowLauncher1.getAttackSpeed(),gameObjects.ArrowLauncher1.getWeaponCost());
		}
		else if (thisWeapon==15)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Atlatl1.getweaponName(), gameObjects.Atlatl1.getAttack_SLASH(), 
					gameObjects.Atlatl1.getAttack_CRUSH(), gameObjects.Atlatl1.getAttack_PIERCING(),
					gameObjects.Atlatl1.getWeaponRange(), gameObjects.Atlatl1.getWeaponType(), gameObjects.Atlatl1.getAttackSpeed(),gameObjects.Atlatl1.getWeaponCost());
		}
		else if (thisWeapon==16)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Dagger1.getweaponName(), gameObjects.Dagger1.getAttack_SLASH(), 
					gameObjects.Dagger1.getAttack_CRUSH(), gameObjects.Dagger1.getAttack_PIERCING(),
					gameObjects.Dagger1.getWeaponRange(), gameObjects.Dagger1.getWeaponType(), gameObjects.Dagger1.getAttackSpeed(),gameObjects.Dagger1.getWeaponCost());
		}
		else if (thisWeapon==17)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Javelin1.getweaponName(), gameObjects.Javelin1.getAttack_SLASH(), 
					gameObjects.Javelin1.getAttack_CRUSH(), gameObjects.Javelin1.getAttack_PIERCING(),
					gameObjects.Javelin1.getWeaponRange(), gameObjects.Javelin1.getWeaponType(), gameObjects.Javelin1.getAttackSpeed(),gameObjects.Javelin1.getWeaponCost());
		}
		else if (thisWeapon==18)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Pilum1.getweaponName(), gameObjects.Pilum1.getAttack_SLASH(), 
					gameObjects.Pilum1.getAttack_CRUSH(), gameObjects.Pilum1.getAttack_PIERCING(),
					gameObjects.Pilum1.getWeaponRange(), gameObjects.Pilum1.getWeaponType(), gameObjects.Pilum1.getAttackSpeed(),gameObjects.Pilum1.getWeaponCost());
		}
		else if (thisWeapon==19)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Sling1.getweaponName(), gameObjects.Sling1.getAttack_SLASH(), 
					gameObjects.Sling1.getAttack_CRUSH(), gameObjects.Sling1.getAttack_PIERCING(),
					gameObjects.Sling1.getWeaponRange(), gameObjects.Sling1.getWeaponType(), gameObjects.Sling1.getAttackSpeed(),gameObjects.Sling1.getWeaponCost());
		}
		else if (thisWeapon==20)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.ThrowingKnife1.getweaponName(), gameObjects.ThrowingKnife1.getAttack_SLASH(), 
					gameObjects.ThrowingKnife1.getAttack_CRUSH(), gameObjects.ThrowingKnife1.getAttack_PIERCING(),
					gameObjects.ThrowingKnife1.getWeaponRange(), gameObjects.ThrowingKnife1.getWeaponType(), gameObjects.ThrowingKnife1.getAttackSpeed(),gameObjects.ThrowingKnife1.getWeaponCost());
		}
		else if (thisWeapon==21)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.ThrowingStar1.getweaponName(), gameObjects.ThrowingStar1.getAttack_SLASH(), 
					gameObjects.ThrowingStar1.getAttack_CRUSH(), gameObjects.ThrowingStar1.getAttack_PIERCING(),
					gameObjects.ThrowingStar1.getWeaponRange(), gameObjects.ThrowingStar1.getWeaponType(), gameObjects.ThrowingStar1.getAttackSpeed(),gameObjects.ThrowingStar1.getWeaponCost());
		}
		else if (thisWeapon==22)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.BaseballBat1.getweaponName(), gameObjects.BaseballBat1.getAttack_SLASH(), 
					gameObjects.BaseballBat1.getAttack_CRUSH(), gameObjects.BaseballBat1.getAttack_PIERCING(),
					gameObjects.BaseballBat1.getWeaponRange(), gameObjects.BaseballBat1.getWeaponType(), gameObjects.BaseballBat1.getAttackSpeed(),gameObjects.BaseballBat1.getWeaponCost());
		}
		else if (thisWeapon==23)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Dao1.getweaponName(), gameObjects.Dao1.getAttack_SLASH(), 
					gameObjects.Dao1.getAttack_CRUSH(), gameObjects.Dao1.getAttack_PIERCING(),
					gameObjects.Dao1.getWeaponRange(), gameObjects.Dao1.getWeaponType(), gameObjects.Dao1.getAttackSpeed(),gameObjects.Dao1.getWeaponCost());
		}
		else if (thisWeapon==24)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.BroadSword1.getweaponName(), gameObjects.BroadSword1.getAttack_SLASH(), 
					gameObjects.BroadSword1.getAttack_CRUSH(), gameObjects.BroadSword1.getAttack_PIERCING(),
					gameObjects.BroadSword1.getWeaponRange(), gameObjects.BroadSword1.getWeaponType(), gameObjects.BroadSword1.getAttackSpeed(),gameObjects.BroadSword1.getWeaponCost());
		}
		else if (thisWeapon==25)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Steel_Claymore1.getweaponName(), gameObjects.Steel_Claymore1.getAttack_SLASH(), 
					gameObjects.Steel_Claymore1.getAttack_CRUSH(), gameObjects.Steel_Claymore1.getAttack_PIERCING(),
					gameObjects.Steel_Claymore1.getWeaponRange(), gameObjects.Steel_Claymore1.getWeaponType(), gameObjects.Steel_Claymore1.getAttackSpeed(),gameObjects.Steel_Claymore1.getWeaponCost());
		}
		else if (thisWeapon==26)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Katana1.getweaponName(), gameObjects.Katana1.getAttack_SLASH(), 
					gameObjects.Katana1.getAttack_CRUSH(), gameObjects.Katana1.getAttack_PIERCING(),
					gameObjects.Katana1.getWeaponRange(), gameObjects.Katana1.getWeaponType(), gameObjects.Katana1.getAttackSpeed(),gameObjects.Katana1.getWeaponCost());
		}
		else if (thisWeapon==27)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Pike1.getweaponName(), gameObjects.Pike1.getAttack_SLASH(), 
					gameObjects.Pike1.getAttack_CRUSH(), gameObjects.Pike1.getAttack_PIERCING(),
					gameObjects.Pike1.getWeaponRange(), gameObjects.Pike1.getWeaponType(), gameObjects.Pike1.getAttackSpeed(),gameObjects.Pike1.getWeaponCost());
		}
		else if (thisWeapon==28)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Lance1.getweaponName(), gameObjects.Lance1.getAttack_SLASH(), 
					gameObjects.Lance1.getAttack_CRUSH(), gameObjects.Lance1.getAttack_PIERCING(),
					gameObjects.Lance1.getWeaponRange(), gameObjects.Lance1.getWeaponType(), gameObjects.Lance1.getAttackSpeed(),gameObjects.Lance1.getWeaponCost());
		}
		else if (thisWeapon==29)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Halberd1.getweaponName(), gameObjects.Halberd1.getAttack_SLASH(), 
					gameObjects.Halberd1.getAttack_CRUSH(), gameObjects.Halberd1.getAttack_PIERCING(),
					gameObjects.Halberd1.getWeaponRange(), gameObjects.Halberd1.getWeaponType(), gameObjects.Halberd1.getAttackSpeed(),gameObjects.Halberd1.getWeaponCost());
		}
		else if (thisWeapon==30)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Nunchucks1.getweaponName(), gameObjects.Nunchucks1.getAttack_SLASH(), 
					gameObjects.Nunchucks1.getAttack_CRUSH(), gameObjects.Nunchucks1.getAttack_PIERCING(),
					gameObjects.Nunchucks1.getWeaponRange(), gameObjects.Nunchucks1.getWeaponType(), gameObjects.Nunchucks1.getAttackSpeed(),gameObjects.Nunchucks1.getWeaponCost());
		}
		else if (thisWeapon==31)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.MorningStar1.getweaponName(), gameObjects.MorningStar1.getAttack_SLASH(), 
					gameObjects.MorningStar1.getAttack_CRUSH(), gameObjects.MorningStar1.getAttack_PIERCING(),
					gameObjects.MorningStar1.getWeaponRange(), gameObjects.MorningStar1.getWeaponType(), gameObjects.MorningStar1.getAttackSpeed(),gameObjects.MorningStar1.getWeaponCost());
		}
		else if (thisWeapon==32)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.CompoundBow1.getweaponName(), gameObjects.CompoundBow1.getAttack_SLASH(), 
					gameObjects.CompoundBow1.getAttack_CRUSH(), gameObjects.CompoundBow1.getAttack_PIERCING(),
					gameObjects.CompoundBow1.getWeaponRange(), gameObjects.CompoundBow1.getWeaponType(), gameObjects.CompoundBow1.getAttackSpeed(),gameObjects.CompoundBow1.getWeaponCost());
		}
		else if (thisWeapon==33)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Pumpshotgun1.getweaponName(), gameObjects.Pumpshotgun1.getAttack_SLASH(), 
					gameObjects.Pumpshotgun1.getAttack_CRUSH(), gameObjects.Pumpshotgun1.getAttack_PIERCING(),
					gameObjects.Pumpshotgun1.getWeaponRange(), gameObjects.Pumpshotgun1.getWeaponType(), gameObjects.Pumpshotgun1.getAttackSpeed(),gameObjects.Pumpshotgun1.getWeaponCost());
		}
		else if (thisWeapon==34)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.NukeLauncher1.getweaponName(), gameObjects.NukeLauncher1.getAttack_SLASH(), 
					gameObjects.NukeLauncher1.getAttack_CRUSH(), gameObjects.NukeLauncher1.getAttack_PIERCING(),
					gameObjects.NukeLauncher1.getWeaponRange(), gameObjects.NukeLauncher1.getWeaponType(), gameObjects.NukeLauncher1.getAttackSpeed(),gameObjects.NukeLauncher1.getWeaponCost());
		}
		else if (thisWeapon==35)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.Mauser1.getweaponName(), gameObjects.Mauser1.getAttack_SLASH(), 
					gameObjects.Mauser1.getAttack_CRUSH(), gameObjects.Mauser1.getAttack_PIERCING(),
					gameObjects.Mauser1.getWeaponRange(), gameObjects.Mauser1.getWeaponType(), gameObjects.Mauser1.getAttackSpeed(),gameObjects.Mauser1.getWeaponCost());
		}
		else if (thisWeapon==36)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.RPG1.getweaponName(), gameObjects.RPG1.getAttack_SLASH(), 
					gameObjects.RPG1.getAttack_CRUSH(), gameObjects.RPG1.getAttack_PIERCING(),
					gameObjects.RPG1.getWeaponRange(), gameObjects.RPG1.getWeaponType(), gameObjects.RPG1.getAttackSpeed(),gameObjects.RPG1.getWeaponCost());
		}
		else if (thisWeapon==37)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.M91.getweaponName(), gameObjects.M91.getAttack_SLASH(), 
					gameObjects.M91.getAttack_CRUSH(), gameObjects.M91.getAttack_PIERCING(),
					gameObjects.M91.getWeaponRange(), gameObjects.M91.getWeaponType(), gameObjects.M91.getAttackSpeed(),gameObjects.M91.getWeaponCost());
		}
		else if (thisWeapon==38)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.AK471.getweaponName(), gameObjects.AK471.getAttack_SLASH(), 
					gameObjects.AK471.getAttack_CRUSH(), gameObjects.AK471.getAttack_PIERCING(),
					gameObjects.AK471.getWeaponRange(), gameObjects.AK471.getWeaponType(), gameObjects.AK471.getAttackSpeed(),gameObjects.AK471.getWeaponCost());
		}
		else if (thisWeapon==39)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.M4A11.getweaponName(), gameObjects.M4A11.getAttack_SLASH(), 
					gameObjects.M4A11.getAttack_CRUSH(), gameObjects.M4A11.getAttack_PIERCING(),
					gameObjects.M4A11.getWeaponRange(), gameObjects.M4A11.getWeaponType(), gameObjects.M4A11.getAttackSpeed(),gameObjects.M4A11.getWeaponCost());
		}
		else if (thisWeapon==40)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.M601.getweaponName(), gameObjects.M601.getAttack_SLASH(), 
					gameObjects.M601.getAttack_CRUSH(), gameObjects.M601.getAttack_PIERCING(),
					gameObjects.M601.getWeaponRange(), gameObjects.M601.getWeaponType(), gameObjects.M601.getAttackSpeed(),gameObjects.M601.getWeaponCost());
		}
		else if (thisWeapon==41)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.TYPE561.getweaponName(), gameObjects.TYPE561.getAttack_SLASH(), 
					gameObjects.TYPE561.getAttack_CRUSH(), gameObjects.TYPE561.getAttack_PIERCING(),
					gameObjects.TYPE561.getWeaponRange(), gameObjects.TYPE561.getWeaponType(), gameObjects.TYPE561.getAttackSpeed(),gameObjects.TYPE561.getWeaponCost());
		}
		else if (thisWeapon==42)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.MP51.getweaponName(), gameObjects.MP51.getAttack_SLASH(), 
					gameObjects.MP51.getAttack_CRUSH(), gameObjects.MP51.getAttack_PIERCING(),
					gameObjects.MP51.getWeaponRange(), gameObjects.MP51.getWeaponType(), gameObjects.MP51.getAttackSpeed(),gameObjects.MP51.getWeaponCost());
		}
		else if (thisWeapon==43)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.BARRET50CAL1.getweaponName(), gameObjects.BARRET50CAL1.getAttack_SLASH(), 
					gameObjects.BARRET50CAL1.getAttack_CRUSH(), gameObjects.BARRET50CAL1.getAttack_PIERCING(),
					gameObjects.BARRET50CAL1.getWeaponRange(), gameObjects.BARRET50CAL1.getWeaponType(), gameObjects.BARRET50CAL1.getAttackSpeed(),gameObjects.BARRET50CAL1.getWeaponCost());
		}
		else if (thisWeapon==44)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.M161.getweaponName(), gameObjects.M161.getAttack_SLASH(), 
					gameObjects.M161.getAttack_CRUSH(), gameObjects.M161.getAttack_PIERCING(),
					gameObjects.M161.getWeaponRange(), gameObjects.M161.getWeaponType(), gameObjects.M161.getAttackSpeed(),gameObjects.M161.getWeaponCost());
		}
		else if (thisWeapon==45)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.fist1.getweaponName(), gameObjects.fist1.getAttack_SLASH(), 
					gameObjects.fist1.getAttack_CRUSH(), gameObjects.fist1.getAttack_PIERCING(),
					gameObjects.fist1.getWeaponRange(), gameObjects.fist1.getWeaponType(), gameObjects.fist1.getAttackSpeed(),gameObjects.fist1.getWeaponCost());
		}
		else if (thisWeapon==46)
		{
			ContestantVariables_Weapons_Shortcut(gameObjects.claw1.getweaponName(), gameObjects.claw1.getAttack_SLASH(), 
					gameObjects.claw1.getAttack_CRUSH(), gameObjects.claw1.getAttack_PIERCING(),
					gameObjects.claw1.getWeaponRange(), gameObjects.claw1.getWeaponType(), gameObjects.claw1.getAttackSpeed(),gameObjects.claw1.getWeaponCost());
		}
		
		
		
		//ARMOUR
		if (thisArmour==1)
		{
			ContestantVariables_Armour_Shortcut(gameObjects.IronBodyArmour1.getarmourName(), gameObjects.IronBodyArmour1.getDefence_SLASH(), 
					gameObjects.IronBodyArmour1.getDefence_CRUSH(), gameObjects.IronBodyArmour1.getDefence_PIERCING(),
					gameObjects.IronBodyArmour1.getGuardBoost(), gameObjects.IronBodyArmour1.getarmourType(), gameObjects.IronBodyArmour1.getWeight(),
					gameObjects.IronBodyArmour1.getSpeedBoost(),gameObjects.IronBodyArmour1.getArmourCost());
		}
		else if (thisArmour==2)
		{
			ContestantVariables_Armour_Shortcut(gameObjects.IronHelmet1.getarmourName(), gameObjects.IronHelmet1.getDefence_SLASH(), 
					gameObjects.IronHelmet1.getDefence_CRUSH(), gameObjects.IronHelmet1.getDefence_PIERCING(),
					gameObjects.IronHelmet1.getGuardBoost(), gameObjects.IronHelmet1.getarmourType(), gameObjects.IronHelmet1.getWeight(),
					gameObjects.IronHelmet1.getSpeedBoost(),gameObjects.IronHelmet1.getArmourCost());
		}
		else if (thisArmour==3)
		{

			ContestantVariables_Armour_Shortcut(gameObjects.LeatherBoots1.getarmourName(), gameObjects.LeatherBoots1.getDefence_SLASH(), 
					gameObjects.LeatherBoots1.getDefence_CRUSH(), gameObjects.LeatherBoots1.getDefence_PIERCING(),
					gameObjects.LeatherBoots1.getGuardBoost(), gameObjects.LeatherBoots1.getarmourType(), gameObjects.LeatherBoots1.getWeight(),
					gameObjects.LeatherBoots1.getSpeedBoost(),gameObjects.LeatherBoots1.getArmourCost());
		}
		else if (thisArmour==4)
		{

			ContestantVariables_Armour_Shortcut(gameObjects.VikingShield1.getarmourName(), gameObjects.VikingShield1.getDefence_SLASH(), 
					gameObjects.VikingShield1.getDefence_CRUSH(), gameObjects.VikingShield1.getDefence_PIERCING(),
					gameObjects.VikingShield1.getGuardBoost(), gameObjects.VikingShield1.getarmourType(), gameObjects.VikingShield1.getWeight(),
					gameObjects.VikingShield1.getSpeedBoost(),gameObjects.VikingShield1.getArmourCost());	
		}
		else if (thisArmour==5)//v1.1
		{

			ContestantVariables_Armour_Shortcut(gameObjects.PuffyArmour1.getarmourName(), gameObjects.PuffyArmour1.getDefence_SLASH(), 
					gameObjects.PuffyArmour1.getDefence_CRUSH(), gameObjects.PuffyArmour1.getDefence_PIERCING(),
					gameObjects.PuffyArmour1.getGuardBoost(), gameObjects.PuffyArmour1.getarmourType(), gameObjects.PuffyArmour1.getWeight(),
					gameObjects.PuffyArmour1.getSpeedBoost(),gameObjects.PuffyArmour1.getArmourCost());	
		}
		else if (thisArmour==6)
		{

			ContestantVariables_Armour_Shortcut(gameObjects.ElectroArmour1.getarmourName(), gameObjects.ElectroArmour1.getDefence_SLASH(), 
					gameObjects.ElectroArmour1.getDefence_CRUSH(), gameObjects.ElectroArmour1.getDefence_PIERCING(),
					gameObjects.ElectroArmour1.getGuardBoost(), gameObjects.ElectroArmour1.getarmourType(), gameObjects.ElectroArmour1.getWeight(),
					gameObjects.ElectroArmour1.getSpeedBoost(),gameObjects.ElectroArmour1.getArmourCost());	
		}
		else if (thisArmour==7)
		{

			ContestantVariables_Armour_Shortcut(gameObjects.AquaArmour1.getarmourName(), gameObjects.AquaArmour1.getDefence_SLASH(), 
					gameObjects.AquaArmour1.getDefence_CRUSH(), gameObjects.AquaArmour1.getDefence_PIERCING(),
					gameObjects.AquaArmour1.getGuardBoost(), gameObjects.AquaArmour1.getarmourType(), gameObjects.AquaArmour1.getWeight(),
					gameObjects.AquaArmour1.getSpeedBoost(),gameObjects.AquaArmour1.getArmourCost());	
		}
		else if (thisArmour==8)
		{

			ContestantVariables_Armour_Shortcut(gameObjects.ForestArmour1.getarmourName(), gameObjects.ForestArmour1.getDefence_SLASH(), 
					gameObjects.ForestArmour1.getDefence_CRUSH(), gameObjects.ForestArmour1.getDefence_PIERCING(),
					gameObjects.ForestArmour1.getGuardBoost(), gameObjects.ForestArmour1.getarmourType(), gameObjects.ForestArmour1.getWeight(),
					gameObjects.ForestArmour1.getSpeedBoost(),gameObjects.ForestArmour1.getArmourCost());	
		}
		else if (thisArmour==9)
		{

			ContestantVariables_Armour_Shortcut(gameObjects.CardboardArmour1.getarmourName(), gameObjects.CardboardArmour1.getDefence_SLASH(), 
					gameObjects.CardboardArmour1.getDefence_CRUSH(), gameObjects.CardboardArmour1.getDefence_PIERCING(),
					gameObjects.CardboardArmour1.getGuardBoost(), gameObjects.CardboardArmour1.getarmourType(), gameObjects.CardboardArmour1.getWeight(),
					gameObjects.CardboardArmour1.getSpeedBoost(),gameObjects.CardboardArmour1.getArmourCost());	
		}
		
		if (thisRace==1)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.blood);
		}
		else if (thisRace==2)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.bit);
		}
		else if (thisRace==3)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.bosmer);
		}
		else if (thisRace==4)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.darkman);
		}
		else if (thisRace==5)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.greenNeck);
		}
		else if (thisRace==6)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.huang);
		}
		else if (thisRace==7)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.imperial);
			
		}
		else if (thisRace==8)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.Khajiit);
			
		}
		else if (thisRace==9)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.nord);
		}
		else if (thisRace==10)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.stickman);
		}
		else if (thisRace==11)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.orc);
		}	
		else if (thisRace==12)
		{
			ContestantVariables_Race_Shortcut(dTBoolean, youortheenethis, gameObjects.cheetaman);
		}	
	}
	
	public void ContestantVariables_Race_Shortcut(boolean dTBoolean, String youortheenethis, 
			MythicalRaceAttributes Contestantx)
	{
		if (dTBoolean==true)
		{
			System.out.print("\n"+youortheenethis+" is/are a(n) "+Contestantx.getraceName()+"\n");
		}
		ContestantName=Contestantx.getraceName();
		
		ContestantWgt=Contestantx.getplayerWeight()+ContestantArmourWeight;
		
		ContestantInitiative=Contestantx.getInitiative();
		int ContestantInitiativePercentage=20;
		int ContestantInitiativeFactor=(((100-ContestantInitiative)*ContestantInitiativePercentage/100)
				/(ContestantInitiativePercentage/4));

		ContestantGrd=Contestantx.getGuard()+ContestantArmourGuardBooster- ContestantInitiativeFactor;
		ContestantHp=Contestantx.getHealth();
		ContestantSpd=Contestantx.getSpeed()-ContestantWgt+ContestantArmourSpeedBooster-ContestantInitiativeFactor;
		if (ContestantSpd<0){ContestantSpd=5;}
		ContestantDefence_SLASH=Contestantx.getDefence()- ContestantInitiativeFactor;
		ContestantDefence_CRUSH=Contestantx.getDefence()- ContestantInitiativeFactor;
		ContestantDefence_PIERCING=Contestantx.getDefence() - ContestantInitiativeFactor;
		
		ContestantAgl=Contestantx.getAgility()-ContestantWgt- ContestantInitiativeFactor;
		if (ContestantAgl<0){ContestantAgl=5;}
		ContestantTraining_1=Contestantx.getplayerTraining_1()-(ContestantWgt/4);
		ContestantTraining_2=Contestantx.getplayerTraining_2()-(ContestantWgt/4);	
		ContestantTraining_3=Contestantx.getplayerTraining_3()-(ContestantWgt/4);
		ContestantTraining_4=Contestantx.getplayerTraining_4()-(ContestantWgt/4);	
		ContestantTraining_5=Contestantx.getplayerTraining_5()-(ContestantWgt/4);
		
		ContestantEdc=Contestantx.getEndurance(); 
		ContestantStamina=Contestantx.getStamina()+ContestantEdc-ContestantWgt-ContestantInitiativeFactor;
		
		ContestantInitialWealth=Contestantx.getInitialWealth()+10;
		if (ContestantInitialWealth>30){ContestantInitialWealth=30;}

		ContestantAtk=Contestantx.getAttack();

		if (ContestantStamina>300){ContestantStamina=300;}//300 is the MAXINUM Stamina
	}
////////////////////////////////////////////////////////////////////////////////////
//Here is the methods to place the weapons data onto contestant self variables
////////////////////////////////////////////////////////////////////////////////////
	public void ContestantVariables_Weapons_Shortcut(String weaponNameParameter, int ContestantAttack_SLASH, int ContestantAttack_CRUSH, int ContestantAttack_PIERCING, 
			int thisweaponRange, int thisweaponType, int thisweaponAtkSpd,int thisweaponprice)
	{
		ContestantMve_Slash=ContestantAttack_SLASH;
		ContestantMve_Piercing=	ContestantAttack_PIERCING;
		ContestantMve_Crush=ContestantAttack_CRUSH;
		ContestantMve_Shoot=(ContestantAttack_PIERCING+(ContestantAttack_SLASH)+(ContestantAttack_CRUSH));
		
		ContestantWeapon=weaponNameParameter;
		ContestantWeaponRgn=thisweaponRange;
		ContestantWeaponType=thisweaponType;
		ContestantWeaponAtkSpd=thisweaponAtkSpd;
		
		ContestantWeaponPrice=thisweaponprice;
		//change attack into 3 diff attacks
	}
	public void ContestantVariables_Armour_Shortcut(String armourNameParameter, 
			int ContestantArmourDefend_SLASHParameter, int ContestantArmourDefend_CRUSHParameter, 
			int ContestantArmourDefend_PIERCINGParameter, 
			int thisarmourGuardBooster, int thisarmourType, int thisarmourWeight, 
			int thisarmourSpeedBooster, int thisarmourprice)
	{
		ContestantArmourDefence_SLASH=ContestantArmourDefend_SLASHParameter;
		ContestantArmourDefence_CRUSH=ContestantArmourDefend_CRUSHParameter;
		ContestantArmourDefence_PIERCING=ContestantArmourDefend_PIERCINGParameter;
		
		ContestantArmour=armourNameParameter;
		ContestantArmourGuardBooster=thisarmourGuardBooster;
		ContestantArmourType=thisarmourType;
		ContestantArmourWeight=thisarmourWeight;
		ContestantArmourSpeedBooster=thisarmourSpeedBooster;
		
		ContestantArmourPrice=thisarmourprice;
		//change Defend into 3 diff Defends
	}

	
	
}
