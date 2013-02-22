package Equipment;

public class M60 extends Weapons{
		public M60(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("M60 Machine Gun");
			setTwoHanded(true);
			setAttack_SLASH(10);
			setAttack_CRUSH(100);
			setAttack_PIERCING(220);
			setWeaponRange(2000);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for reg bows
			setWeaponWeight(300);
			setWeaponCost(1999);
			setDescription("\n\nAre you sure this is a light machine gun?\n It kills things anyways."
					+
					"\n" +
					"================================" +
					"\nA Firearm\n"+					
					"POWER ******\n"+
					"SPEED ******\n"+
					"RANGE ******\n"+
					"PRICE ******\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
