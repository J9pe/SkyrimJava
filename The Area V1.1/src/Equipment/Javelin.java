package Equipment;

public class Javelin extends Weapons{
		public Javelin(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Javelin");
			setTwoHanded(true);
			setAttack_SLASH(10);
			setAttack_CRUSH(10);
			setAttack_PIERCING(55);
			setWeaponRange(60);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(2);//4 for reg bows
			setWeaponWeight(6);
			setWeaponCost(10);
			setDescription("\n\n/Javelin designed against flesh."
					+
					"\n" +
					"================================" +
					"\nA Spear Thrower\n"+					
					"POWER ***\n"+
					"SPEED ****\n"+
					"RANGE **\n"+
					"PRICE **\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
