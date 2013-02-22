package Equipment;

public class Dao extends Weapons{
	public Dao(){
		super("",false,0,0,0,0,0,0,"","",0,0);
		setweaponName("Dao");
		setTwoHanded(false);
		setAttack_SLASH(80);
		setAttack_CRUSH(35);
		setAttack_PIERCING(20);
		setWeaponRange(9);
		setWeaponType(1);//1 is melee, 2 is archery
		setAttackSpeed(1);
		setWeaponWeight(23);
		setWeaponCost(24);
		setDescription("\n\nChinese Weapon. Well made. Sturdy.\n Good for chopping stuff."
				
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
