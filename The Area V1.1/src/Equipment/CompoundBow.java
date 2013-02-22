package Equipment;

public class CompoundBow extends Weapons{
		public CompoundBow(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("75% let-off Compound Bow");
			setTwoHanded(true);
			setAttack_SLASH(50);
			setAttack_CRUSH(50);
			setAttack_PIERCING(80);
			setWeaponRange(350);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(4);//4 for reg bows
			setWeaponWeight(5);
			setWeaponCost(85);
			setDescription("\n\nSpace bows are nice. 75 percent let off."
					+
					"\n" +
					"================================" +
					"\nA Bow\n"+					
					"POWER ***\n"+
					"SPEED ***\n"+
					"RANGE ***\n"+
					"PRICE ***\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
