package Equipment;
public class Dagger extends Weapons{
		public Dagger(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Daggers");
			setTwoHanded(false);
			setAttack_SLASH(5);
			setAttack_CRUSH(0);
			setAttack_PIERCING(39);
			setWeaponRange(3);
			setWeaponType(4);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for reg bows
			setWeaponWeight(2);
			setWeaponCost(5);
			setDescription(" good for stabing\n" +
										"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER **\n"+
					"SLASH *\n"+
					"CRUSH *\n"+
					"STAB  ****\n"+
					"SPEED *****\n"+
					"RANGE N/A\n"+
					
					"PRICE *\n"+
					"\n"+	
					"================================" +
					"\n"
					);
		}

}
