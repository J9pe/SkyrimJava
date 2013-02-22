package Equipment;

public class ArrowLauncher extends Weapons{
		public ArrowLauncher(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Nest of Bees Arrow Launcher");
			setTwoHanded(true);
			setAttack_SLASH(50);
			setAttack_CRUSH(100);
			setAttack_PIERCING(200);
			setWeaponRange(100);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(6);//4 for reg bows
			setWeaponWeight(18);
			setWeaponCost(100);
			setDescription("\n\nThe nest of bees will launch hell-fire on the enemy at point-blank range"
					+
					"\n" +
					"================================" +
					"\nA Launcher\n"+					
					"POWER *****\n"+
					"SPEED *\n"+
					"RANGE **\n"+
					"PRICE *****\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
