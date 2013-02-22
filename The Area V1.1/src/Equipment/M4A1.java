package Equipment;

public class M4A1 extends Weapons{
		public M4A1(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("M4A1");
			setTwoHanded(true);
			setAttack_SLASH(10);
			setAttack_CRUSH(10);
			setAttack_PIERCING(170);
			setWeaponRange(2500);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for reg bows
			setWeaponWeight(25);
			setWeaponCost(380);
			setDescription("\n\nWell balanced weapon."
					
							+
							"\n" +
							"================================" +
							"\nA Firearm\n"+					
							"POWER *****\n"+
							"SPEED *****\n"+
							"RANGE *****\n"+
							"PRICE *****\n"+
							"\n"+	
							"================================" 
					);
			
			
		}
	

}
