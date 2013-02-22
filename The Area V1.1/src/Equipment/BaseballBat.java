package Equipment;

public class BaseballBat extends Weapons{
		public BaseballBat(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Baseball Bat");
			setTwoHanded(false);
			setAttack_SLASH(0);
			setAttack_CRUSH(50);
			setAttack_PIERCING(0);
			setWeaponRange(10);
			setWeaponType(3);//1 is melee, 2 is archery
			setAttackSpeed(1);//
			setWeaponWeight(6);
			setWeaponCost(5);
			setDescription("\n\nA basic weapon,\n" +
					"crushing heavy weapon\n"+

					"\n\n"
					
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER **\n"+
					"CRUSH ***\n"+
					"SPEED ****\n"+
					"RANGE N/A\n"+
					
					"PRICE *\n"+
					"\n"+	
					"================================" +
					"\n"
					
					);
			
			
			
		}
	

}