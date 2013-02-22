package Equipment;

public class YewLongbow extends Weapons{
		public YewLongbow(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Yew Longbow");
			setTwoHanded(true);
			setAttack_SLASH(5);
			setAttack_CRUSH(20);
			setAttack_PIERCING(70);
			setWeaponRange(250);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(4);//4 for reg bows
			setWeaponWeight(10);
			setWeaponCost(20);
			setDescription("\n\nEnglish bow, excellent for longrange" +
					"\nThe historical longbow was a self bow, often" +
					"\n made from yew. In the Middle Ages the English" +
					"\nand Welsh were famous for their very powerful English" +
					"\nlongbows, used to great effect in the civil wars of the" +
					"\nperiod and against the French in the Hundred Years' War" +
					"\n(with notable success at the battles of Crey (1346), " +
					"\nPoitiers (1356) and Agincourt (1415)."
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER ****\n"+
					"SPEED ***\n"+
					"RANGE ****\n"+
					"PRICE ***\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
