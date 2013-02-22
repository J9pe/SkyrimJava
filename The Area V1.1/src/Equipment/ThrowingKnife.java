package Equipment;

public class ThrowingKnife extends Weapons{
		public ThrowingKnife(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Throwing Knife");
			setTwoHanded(true);
			setAttack_SLASH(3);
			setAttack_CRUSH(0);
			setAttack_PIERCING(25);
			setWeaponRange(20);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(2);//4 for reg bows
			setWeaponWeight(1);
			setWeaponCost(1);
			setDescription("\n\nCheap stuff to distract the enemy"
					+
					"\n" +
					"================================" +
					"\nA Projectile\n"+					
					"POWER *\n"+
					"SPEED *****\n"+
					"RANGE *\n"+
					"PRICE *\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
