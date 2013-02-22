package Equipment;

public class AK47 extends Weapons{
		public AK47(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("AK47");
			setTwoHanded(true);
			setAttack_SLASH(5);
			setAttack_CRUSH(60);
			setAttack_PIERCING(200);
			setWeaponRange(1000);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(2);//4 for reg bows
			setWeaponWeight(20);
			setWeaponCost(200);
			setDescription("\n\nCheap firearm, but its a gun"
					+
					"\n" +
					"================================" +
					"\nA Firearm\n"+					
					"POWER *****\n"+
					"SPEED ***\n"+
					"RANGE *****\n"+
					"PRICE *****\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
