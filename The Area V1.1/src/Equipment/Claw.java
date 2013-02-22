package Equipment;
public class Claw extends Weapons{
		public Claw(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Claws");
			setTwoHanded(false);
			setAttack_SLASH(25);
			setAttack_CRUSH(10);
			setAttack_PIERCING(10);
			setWeaponRange(3);
			setWeaponType(4);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for reg bows
			setWeaponWeight(1);
			setWeaponCost(0);
			setDescription("Cheetaman and Khajits have claws to defend themselves against an enemy\n" +
										"\n" +
					"================================" +
					"\nFist\n"+					
					"POWER *\n"+
					"SLASH **\n"+
					"STAB  *\n"+
					"CRUSH *\n"+
					"SPEED *****\n"+
					"RANGE N/A\n"+
					
					"PRICE N/A\n"+
					"\n"+	
					"================================" +
					"\n"
					);
		}

}
