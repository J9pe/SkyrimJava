package Equipment;

public class PumpShotgun extends Weapons{
		public PumpShotgun(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("PumpShotgun");
			setTwoHanded(true);
			setAttack_SLASH(10);
			setAttack_CRUSH(200);
			setAttack_PIERCING(100);
			setWeaponRange(100);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(2);//4 for reg bows
			setWeaponWeight(20);
			setWeaponCost(120);
			setDescription("\n\nThe Texcan Dream."
					
							+
							"\n" +
							"================================" +
							"\nA Firearm\n"+					
							"POWER *****\n"+
							"SPEED **\n"+
							"RANGE **\n"+
							"PRICE ***\n"+
							"\n"+	
							"================================" 
					);
			
			
		}
	

}
