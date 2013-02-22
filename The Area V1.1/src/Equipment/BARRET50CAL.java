package Equipment;

public class BARRET50CAL extends Weapons{
		public BARRET50CAL(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("BARRET50CAL.");
			setTwoHanded(true);
			setAttack_SLASH(5);
			setAttack_CRUSH(300);
			setAttack_PIERCING(500);
			setWeaponRange(4000);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for reg bows
			setWeaponWeight(35);
			setWeaponCost(2000);
			setDescription("\n\nAccurate and long-ranged rifle."
					+
					"\n" +
					"================================" +
					"\nA firearm\n"+					
					"POWER ******\n"+
					"SPEED **\n"+
					"RANGE *******\n"+
					"PRICE *******\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
