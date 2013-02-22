package Equipment;

public class M16 extends Weapons{
		public M16(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("M16");
			setTwoHanded(true);
			setAttack_SLASH(10);
			setAttack_CRUSH(10);
			setAttack_PIERCING(160);
			setWeaponRange(3000);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(2);//4 for reg bows
			setWeaponWeight(22);
			setWeaponCost(380);
			setDescription("\n\nAmerican's Sweet Sixteen, the updated one"
					
							+
							"\n" +
							"================================" +
							"\nA Firearm\n"+					
							"POWER ****\n"+
							"SPEED ****\n"+
							"RANGE ******\n"+
							"PRICE *****\n"+
							"\n"+	
							"================================" 
					);
			
			
		}
	

}
