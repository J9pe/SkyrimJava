package Equipment;

public class LeatherBoots extends Armour{
		public LeatherBoots(){
			//(String name,int defence1,int defence2,int defence3, 
			//int gB, int Type, int w, int sB, 
			//String armourDescription,String armourTextImage){
			super("",0,0,0,0,0,0,0,0,"","");
			setarmourName("Leather Boots");
			setDefence_SLASH(3);
			setDefence_CRUSH(2);
			setDefence_PIERCING(3);
			setGuardBoost(0);
			setarmourType(3);			
			setWeight(5);//1 is melee, 2 is archery
			setSpeedBoost(25);//4 for range
			setArmourCost(5);
			setDescription("\nA pair of strong sturdy boots\n" +
					" for comfort and durability\n"
			
			+
			"\n" +
			"================================" +
			"\nAn armour\n"+					
			"GUARD BOOST N/A\n"+
			"SLASH Defence *\n"+
			"CRUSH Defence *\n"+
			"STAB Defence  *\n"+
			"WEIGHT *\n"+
			"SPEED BOOST **\n"+
			"PRICE **\n"+
			"\n"+	
			"================================" +
			"\n"
			
			);
		}
}
	
