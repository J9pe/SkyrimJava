package Equipment;

public class Atlatl extends Weapons{
		public Atlatl(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Atlatl");
			setTwoHanded(true);
			setAttack_SLASH(0);
			setAttack_CRUSH(0);
			setAttack_PIERCING(25);
			setWeaponRange(300);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(3);//4 for reg bows
			setWeaponWeight(3);
			setWeaponCost(4);
			setDescription("\n\nThe primitive hunting weapon. Goes far with the lever."
					+
					"\n" +
					"================================" +
					"\nA Spear Thrower\n"+					
					"POWER *\n"+
					"SPEED ****\n"+
					"RANGE ****\n"+
					"PRICE *\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
