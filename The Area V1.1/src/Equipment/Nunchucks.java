package Equipment;

public class Nunchucks extends Weapons{
		public Nunchucks(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Nunchucks");
			setTwoHanded(false);
			setAttack_SLASH(5);
			setAttack_CRUSH(10);
			setAttack_PIERCING(5);
			setWeaponRange(15);
			setWeaponType(3);//1 is melee, 2 is archery
			setAttackSpeed(1);//
			setWeaponWeight(7);
			setWeaponCost(100);
			setDescription("\n\nExpensive 'weapon'. Its more like a toy\n"+

					"\n\n"
					
					+
					"\n" +
					"================================" +
					"\nA 'Weapon'\n"+					
					"POWER *\n"+
					"CRUSH *\n"+
					"SPEED *****\n"+
					"RANGE *\n"+
					
					"PRICE *****\n"+
					"\n"+	
					"================================" +
					"\n"
					
					);
			
			
			
		}
	

}