package Equipment;

public class Greataxe extends Weapons{
		public Greataxe(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Greataxe");
			setTwoHanded(true);
			setAttack_SLASH(70);
			setAttack_CRUSH(250);
			setAttack_PIERCING(5);
			setWeaponRange(9);
			setWeaponType(3);//1 is melee, 2 is archery
			setAttackSpeed(3);//4 for range
			setWeaponWeight(65);
			setWeaponCost(50);
			setDescription("\n\nA weapon with tremendous damage, \n" +
					"on thy enemy and thyself.\n" +
					"The axe, or ax, is an implement that has\n " +
					"been used for millennia to shape,\n" +
					" split and cut wood; to harvest timber; \n" +
					"as a weapon; and as a ceremonial\n" +
					" or heraldic symbol. The axe has many \n" +
					"forms and specialized uses but generally\n" +
					" consists of an axe head with \n" +
					"a handle, or helve.\n"
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER *****\n"+
					"SLASH *****\n"+
					"CRUSH ******\n"+
					"STAB  *\n"+
					"SPEED *\n"+
					"RANGE N/A\n"+
					
					"PRICE *****\n"+
					"\n"+	
					"================================" +
					"\n"
					);
		}
}
	
