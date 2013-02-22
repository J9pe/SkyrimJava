package Equipment;

public class Musket extends Weapons{
		public Musket(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Matchlock Musket");
			setTwoHanded(false);
			setAttack_SLASH(0);
			setAttack_CRUSH(20);
			setAttack_PIERCING(200);
			setWeaponRange(100);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(6);//4 for range
			setWeaponWeight(20);
			setWeaponCost(70);
			setDescription("\n\nThe primitive firearm, lacks accuracy and range\n"
					
					+
					"\n" +
					"================================" +
					"\nA Firearm\n"+					
					"POWER MAX\n"+
					"SPEED *\n"+
					"RANGE **\n"+
					
					"PRICE MAX\n"+
					"\n"+	
					"================================" +
					"\n"
					);
		}
	

}