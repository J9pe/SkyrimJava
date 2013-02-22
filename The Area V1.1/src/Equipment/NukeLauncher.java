package Equipment;

public class NukeLauncher extends Weapons{
		public NukeLauncher(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("NukeLauncher");
			setTwoHanded(true);
			setAttack_SLASH(99999999);
			setAttack_CRUSH(99999999);
			setAttack_PIERCING(99999999);
			setWeaponRange(4444);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(2);//4 for reg bows
			setWeaponWeight(400);
			setWeaponCost(99999999);
			setDescription("\n\nI wonder how the employees are allowed to sell this.."
					+
					"\n" +
					"================================" +
					"\nA NUKE Launcher\n"+					
					"POWER MAX\n"+
					"SPEED *****\n"+
					"RANGE ******\n"+
					"PRICE MAX\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
