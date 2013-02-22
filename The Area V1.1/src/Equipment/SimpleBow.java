package Equipment;

public class SimpleBow extends Weapons{
		public SimpleBow(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Simple Bow");
			setTwoHanded(true);
			setAttack_SLASH(0);
			setAttack_CRUSH(5);
			setAttack_PIERCING(50);
			setWeaponRange(150);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(3);//4 for reg bows
			setWeaponWeight(5);
			setWeaponCost(14);
			setDescription("\n\nsimple self bow without any recurving. Made hastely."
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER **\n"+
					"STAB  **\n"+
					"SPEED ****\n"+
					"RANGE ***\n"+
					
					"PRICE *\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
