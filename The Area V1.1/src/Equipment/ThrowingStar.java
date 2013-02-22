package Equipment;

public class ThrowingStar extends Weapons{
		public ThrowingStar(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Throwing Star");
			setTwoHanded(true);
			setAttack_SLASH(10);
			setAttack_CRUSH(0);
			setAttack_PIERCING(25);
			setWeaponRange(30);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(2);//4 for reg bows
			setWeaponWeight(1);
			setWeaponCost(2);
			setDescription("\n\nCheap Stars to distract the enemy"
					+
					"\n" +
					"================================" +
					"\nA Projectile\n"+					
					"POWER **\n"+
					"SPEED *****\n"+
					"RANGE *\n"+
					"PRICE *\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
