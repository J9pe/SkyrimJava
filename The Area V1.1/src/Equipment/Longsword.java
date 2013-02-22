package Equipment;

public class Longsword extends Weapons{
	public Longsword(){
		super("",false,0,0,0,0,0,0,"","",0,0);
		setweaponName("Longsword");
		setTwoHanded(false);
		setAttack_SLASH(60);
		setAttack_CRUSH(25);
		setAttack_PIERCING(50);
		setWeaponRange(10);
		setWeaponType(1);//1 is melee, 2 is archery
		setAttackSpeed(1);
		setWeaponWeight(25);
		setWeaponCost(20);
		setDescription("\n\nBasic Description: Longswords are \n" +
				"versatile and suit any playing style and any \n" +
				"character build making them valuable additions\n" +
				" to your inventory. They have a decent reach,\n" +
				" speed and weight, benefit from Sneak Attacks \n" +
				"and can be used with shields.\n" +
				"Because of this, the Longsword is the most \n" +
				"balanced melee weapon in the game.\n"+
 
				"Best used by: Warriors will always benefit\n" +
				" from having a longsword by their side. \n" +
				"Longswords may prove too heavy for mages when \n" +
				"getting into the higher levels. For this reason some\n" +
				" mages prefer to use the Umbra blade, because\n" +
				" it can be obtained relatively easily and is weightless\n"
				
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER ****\n"+
					"SLASH *****\n"+
					"CRUSH *\n"+
					"STAB  *\n"+
					"SPEED *****\n"+
					"RANGE N/A\n"+
					
					"PRICE ****\n"+
					"\n"+	
					"================================" +
					"\n"
				);
	}
}
