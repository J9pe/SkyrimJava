package Equipment;

public class RPG extends Weapons{
		public RPG(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("RPG");
			setTwoHanded(true);
			setAttack_SLASH(20);
			setAttack_CRUSH(1000);
			setAttack_PIERCING(200);
			setWeaponRange(200);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(3);//4 for reg bows
			setWeaponWeight(25);
			setWeaponCost(280);
			setDescription("\n\nCheapest Soviet-developed rocket Launcher"
					
							+
							"\n" +
							"================================" +
							"\nA Launcher\n"+					
							"POWER ******\n"+
							"SPEED ***\n"+
							"RANGE ***\n"+
							"PRICE ****\n"+
							"\n"+	
							"================================" 
					);
			
			
		}
	

}
