package Equipment;

public class MauserBoltActionRifle extends Weapons{
		public MauserBoltActionRifle(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("MauserBoltActionRifle");
			setTwoHanded(true);
			setAttack_SLASH(5);
			setAttack_CRUSH(200);
			setAttack_PIERCING(300);
			setWeaponRange(3000);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(5);//4 for reg bows
			setWeaponWeight(30);
			setWeaponCost(280);
			setDescription("\n\nVery powerful bolt actioner"
					+
					"\n" +
					"================================" +
					"\nA Firearm\n"+					
					"POWER *****\n"+
					"SPEED *\n"+
					"RANGE ******\n"+
					"PRICE *****\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
