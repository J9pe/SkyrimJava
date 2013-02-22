package Equipment;
public class Shortsword extends Weapons{
		public Shortsword(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("ShortSword ");
			setTwoHanded(false);
			setAttack_SLASH(35);
			setAttack_CRUSH(10);
			setAttack_PIERCING(40);
			setWeaponRange(7);
			setWeaponType(4);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for reg bows
			setWeaponWeight(20);
			setWeaponCost(10);
			setDescription("\n\nA sword that is short,\n" +
					" good for stabing\n" +
					"Shortsword may refer to a number \n" +
					"of weapons intermediate between the sword and the dagger\n" +
					"Basic Description: Shortswords are\n" +
					" a very useful class of blades that fall between the daggers \n" +
					"and longswords. Because of their good \n" +
					"speed, range, and damage, they make very versatile and powerful\n" +
					" weapons in the hands of a capable user.\n"
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER ***\n"+
					"SLASH **\n"+
					"CRUSH *\n"+
					"STAB  *****\n"+
					"SPEED *****\n"+
					"RANGE N/A\n"+
					
					"PRICE **\n"+
					"\n"+	
					"================================" +
					"\n"
					);
		}

}
