package Equipment;

public class MP5 extends Weapons{
		public MP5(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("MP5");
			setTwoHanded(true);
			setAttack_SLASH(5);
			setAttack_CRUSH(50);
			setAttack_PIERCING(160);
			setWeaponRange(800);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for reg bows
			setWeaponWeight(15);
			setWeaponCost(400);
			setDescription("\n\nHeckler and Knotch makes good subs."
					+
					"\n" +
					"================================" +
					"\nA firearm\n"+					
					"POWER *****\n"+
					"SPEED *****\n"+
					"RANGE *****\n"+
					"PRICE ******\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
