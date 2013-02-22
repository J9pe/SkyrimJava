package Equipment;
public class Fist extends Weapons{
		public Fist(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Fists");
			setTwoHanded(false);
			setAttack_SLASH(1);
			setAttack_CRUSH(15);
			setAttack_PIERCING(0);
			setWeaponRange(2);
			setWeaponType(4);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for reg bows
			setWeaponWeight(0);
			setWeaponCost(0);
			setDescription(" KUNG FU STYLE BABY\n" +
										"\n" +
					"================================" +
					"\nFist\n"+					
					"POWER *\n"+
					"CRUSH **\n"+
					"SPEED *****\n"+
					"RANGE N/A\n"+
					
					"PRICE N/A\n"+
					"\n"+	
					"================================" +
					"\n"
					);
		}

}
