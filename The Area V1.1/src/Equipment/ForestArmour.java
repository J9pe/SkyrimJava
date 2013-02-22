package Equipment;

public class ForestArmour extends Armour{
		public ForestArmour(){
			//(String name,int defence1,int defence2,int defence3, 
			//int gB, int Type, int w, int sB, 
			//String armourDescription,String armourTextImage){
			super("",0,0,0,0,0,0,0,0,"","");
			setarmourName("ForestArmour");
			setDefence_SLASH(20);
			setDefence_CRUSH(22);
			setDefence_PIERCING(23);
			setGuardBoost(5);
			setarmourType(2);			
			setWeight(55);//1 is melee, 2 is archery
			setSpeedBoost(-18);//4 for range
			setArmourCost(35);
			setDescription("\nA Type of legendary magic armour that really resists cutting.\n"
			+
			"\n" +
			"================================" +
			"\nAn armour\n"+					
			"GUARD BOOST *\n"+
			"SLASH Defence MAX\n"+
			"CRUSH Defence ***\n"+
			"STAB Defence  ***\n"+
			"WEIGHT ****\n"+
			"SPEED BOOST -**\n"+
			"PRICE ****\n"+
			"\n"+	
			"================================" +
			"\n"
			
			);
		}
}
	
