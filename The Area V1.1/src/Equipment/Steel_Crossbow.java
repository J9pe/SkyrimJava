package Equipment;

public class Steel_Crossbow extends Weapons{
		public Steel_Crossbow(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Steel Crossbow");
			setTwoHanded(false);
			setAttack_SLASH(10);
			setAttack_CRUSH(20);
			setAttack_PIERCING(80);
			setWeaponRange(650);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(6);//4 for range
			setWeaponWeight(26);
			setWeaponCost(75);
			setDescription("\n\nOne of the strongest ranged weapons,\ncertainly the furthest for bows\n " +
					"acts like a sniper weapon\n" +
					"A crossbow is a weapon consisting of a bow\n" +
					" mounted on a stock that shoots projectiles,\n" +
					" often called bolts or quarrels. The medieval\n" +
					" crossbow was called by many names, \n" +
					"most of which derived from the word ballista,\n" +
					" a torsion engine resembling a crossbow \n" +
					"in appearance.\n\n" +
					"Historically, crossbows played a significant \n" +
					"role in the warfare of East Asia since the \n" +
					"4th century B.C., as well as Europe and the \n" +
					"Mediterranean. Today, they are used primarily\n" +
					" for target shooting and hunting\n"	+	"\n"
					
					+
					"\n" +
					"================================" +
					"\nA Crossbow\n"+					
					"POWER *****\n"+
					"SPEED *\n"+
					"RANGE *****\n"+
					
					"PRICE *****\n"+
					"\n"+	
					"================================" +
					"\n"
					);
		}
	

}