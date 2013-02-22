package Equipment;

public class BroadSword extends Weapons{
	public BroadSword(){
		super("",false,0,0,0,0,0,0,"","",0,0);
		setweaponName("Broadsword");
		setTwoHanded(true);
		setAttack_SLASH(85);
		setAttack_CRUSH(25);
		setAttack_PIERCING(40);
		setWeaponRange(10);
		setWeaponType(1);//1 is melee, 2 is archery
		setAttackSpeed(1);
		setWeaponWeight(28);
		setWeaponCost(23);
		setDescription("\n\nBasic Description: broad and powerful\n"+
 
				"Best used by: Warriors will always benefit\n" +
				" from having a broadsword by their side. \n" +
				"Broadswords may prove too heavy for mages when \n" +
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
					"STAB  **\n"+
					"SPEED *****\n"+
					"RANGE N/A\n"+
					
					"PRICE ****\n"+
					"\n"+	
					"================================" +
					"\n"
				);
	}
}
