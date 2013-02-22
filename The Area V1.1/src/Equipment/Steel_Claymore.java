package Equipment;

public class Steel_Claymore extends Weapons{
	public Steel_Claymore(){
		super("",false,0,0,0,0,0,0,"","",0,0);
		setweaponName("Steel Claymore");
		setTwoHanded(false);
		setAttack_SLASH(400);
		setAttack_CRUSH(320);
		setAttack_PIERCING(50);
		setWeaponRange(10);
		setWeaponType(1);//1 is melee, 2 is archery
		setAttackSpeed(3);
		setWeaponWeight(35);
		setWeaponCost(50);
		setDescription("\n\nThe heavier, the better, right?\n"
				
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER *****\n"+
					"SLASH *****\n"+
					"CRUSH *****\n"+
					"STAB  *\n"+
					"SPEED *\n"+
					"RANGE N/A\n"+
					
					"PRICE *****\n"+
					"\n"+	
					"================================" +
					"\n"
				);
	}
}
