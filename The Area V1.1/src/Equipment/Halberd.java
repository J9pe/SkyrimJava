package Equipment;

public class Halberd extends Weapons{
		public Halberd(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Halberd");
			setTwoHanded(false);
			setAttack_SLASH(10);
			setAttack_CRUSH(140);
			setAttack_PIERCING(50);
			setWeaponRange(13);
			setWeaponType(5);//1 is melee, 2 is archery
			setAttackSpeed(3);//
			setWeaponWeight(42);
			setWeaponCost(30);
			setDescription("\n\nAn extremely heavy polearm\n"+

					"\n\n"
					
					+
					"\n" +
					"================================" +
					"\nA Pole Arm\n"+					
					"POWER ****\n"+
					"CRUSH ****\n"+
					"SPEED ***\n"+
					"RANGE *\n"+
					
					"PRICE ***\n"+
					"\n"+	
					"================================" +
					"\n"
					
					);
			
			
			
		}
	

}