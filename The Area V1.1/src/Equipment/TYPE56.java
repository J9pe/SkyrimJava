package Equipment;

public class TYPE56 extends Weapons{
		public TYPE56(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Type 56");
			setTwoHanded(true);
			setAttack_SLASH(10);
			setAttack_CRUSH(20);
			setAttack_PIERCING(190);
			setWeaponRange(900);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(2);//4 for reg bows
			setWeaponWeight(20);
			setWeaponCost(170);
			setDescription("\n\nThe TYPE56 is a cheaper version of the AK47,\n made in China"
					
							+
							"\n" +
							"================================" +
							"\nA Firearm\n"+					
							"POWER ****\n"+
							"SPEED ***\n"+
							"RANGE *****\n"+
							"PRICE ****\n"+
							"\n"+	
							"================================" 
					);
			
			
		}
	

}
