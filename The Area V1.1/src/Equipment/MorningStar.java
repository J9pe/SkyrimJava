package Equipment;

public class MorningStar extends Weapons{
	public MorningStar(){
		super("",false,0,0,0,0,0,0,"","",0,0);
		setweaponName("MorningStar");
		setTwoHanded(false);
		setAttack_SLASH(10);
		setAttack_CRUSH(105);
		setAttack_PIERCING(0);
		setWeaponRange(15);
		setWeaponType(3);//1 is melee, 2 is archery
		setAttackSpeed(2);
		setWeaponWeight(33);
		setWeaponCost(24);
		setDescription("\n\nGood morning! This thing has range."
				
					+
					"\n" +
					"================================" +
					"\nA Heavy Weapon\n"+					
					"POWER ****\n"+
					"SLASH *\n"+
					"CRUSH *****\n"+
					"STAB  *\n"+
					"SPEED ***\n"+
					"RANGE **\n"+
					
					"PRICE ****\n"+
					"\n"+	
					"================================" +
					"\n"
				);
	}
}
