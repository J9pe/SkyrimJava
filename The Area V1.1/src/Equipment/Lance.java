package Equipment;

public class Lance extends Weapons{
		public Lance(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Lance");
			setTwoHanded(false);
			setAttack_SLASH(10);
			setAttack_CRUSH(0);
			setAttack_PIERCING(100);
			setWeaponRange(25);
			setWeaponType(5);//1 is melee, 2 is archery
			setAttackSpeed(2);//
			setWeaponWeight(22);
			setWeaponCost(37);
			setDescription("\n\nA basic weapon,\n" +
					"crushing heavy weapon\n"+

					"\n\n"
					
					+
					"\n" +
					"================================" +
					"\nA Pole Arm\n"+					
					"POWER ***\n"+
					"STAB  ****\n"+
					"SPEED ****\n"+
					"RANGE ****\n"+
					
					"PRICE ***\n"+
					"\n"+	
					"================================" +
					"\n"
					
					);
			
			
			
		}
	

}