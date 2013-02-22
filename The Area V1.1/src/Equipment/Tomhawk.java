package Equipment;

public class Tomhawk extends Weapons{
	public Tomhawk(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Tomhawk");
			setTwoHanded(false);
			setAttack_SLASH(35);
			setAttack_CRUSH(40);
			setAttack_PIERCING(15);
			setWeaponRange(8);
			setWeaponType(4);//1 is melee, 2 is archery
			setAttackSpeed(1);
			setWeaponWeight(12);
			setWeaponCost(15);
			setDescription("\n\nA tomahawk (also referred to \n" +
					"as a Tomhawk) is a type of axe native to North America,\n" +
				" traditionally resembling a hatchet with a \n" +
				"straight shaft.[1][2] The name came into the English\n" +
				" language in the 17th century as a transliteration \n" +
				"of the Powhatan (Virginian Algonquian) word.\n" +
		 
				"Tomahawks were general purpose tools used by Native\n " +
				"Americans and European Colonials alike,\n"+
				"and often employed as a hand-to-hand or a thrown weapon,\n" +
				" much like the African nzappa zap.\n"+
				"It originally featured a stone head, but later iron\n" +
				" or brass heads were used. The metal tomahawk\n"+
				"heads were originally based on a Royal Navy boarding\n" +
				" axe and used as a trade-item with Native \n" +
				"Americans for food and other provisions.\n"
				
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER ***\n"+
					"SLASH **\n"+
					"CRUSH ***\n"+
					"STAB  **\n"+
					"SPEED *****\n"+
					"RANGE N/A\n"+
					
					"PRICE ***\n"+
					"\n"+	
					"================================" +
					"\n"
					
					);
	}
}
