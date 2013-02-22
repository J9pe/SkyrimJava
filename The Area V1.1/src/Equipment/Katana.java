package Equipment;

public class Katana extends Weapons{
	public Katana(){
		super("",false,0,0,0,0,0,0,"","",0,0);
		setweaponName("Katana");
		setTwoHanded(false);
		setAttack_SLASH(200);
		setAttack_CRUSH(15);
		setAttack_PIERCING(50);
		setWeaponRange(10);
		setWeaponType(1);//1 is melee, 2 is archery
		setAttackSpeed(2);
		setWeaponWeight(23);
		setWeaponCost(60);
		setDescription("\n\n200 Slash damage. Good weapon. Made in Japan."
				
					+
					"\nThe Japs have the best slashing weapon" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER *****\n"+
					"SLASH MAX\n"+
					"CRUSH *\n"+
					"STAB  ***\n"+
					"SPEED ***\n"+
					"RANGE N/A\n"+
					
					"PRICE *****\n"+
					"\n"+	
					"================================" +
					"\n"
				);
	}
}
