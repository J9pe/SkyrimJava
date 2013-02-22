package Equipment;

public class M9 extends Weapons{
		public M9(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("M9");
			setTwoHanded(true);
			setAttack_SLASH(5);
			setAttack_CRUSH(40);
			setAttack_PIERCING(100);
			setWeaponRange(400);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for reg bows
			setWeaponWeight(4);
			setWeaponCost(180);
			setDescription("\n\nVery common pistol"
					+
					"\n" +
					"================================" +
					"\nA Firearm\n"+					
					"POWER *****\n"+
					"SPEED *****\n"+
					"RANGE ****\n"+
					"PRICE ****\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
