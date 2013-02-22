package Equipment;

public class CardboardArmour extends Armour{
		public CardboardArmour(){
			//(String name,int defence1,int defence2,int defence3, 
			//int gB, int Type, int w, int sB, 
			//String armourDescription,String armourTextImage){
			super("",0,0,0,0,0,0,0,0,"","");
			setarmourName("CardboardArmour");
			setDefence_SLASH(4);
			setDefence_CRUSH(10);
			setDefence_PIERCING(1);
			setGuardBoost(2);
			setarmourType(2);			
			setWeight(5);//1 is melee, 2 is archery
			setSpeedBoost(0);//4 for range
			setArmourCost(0);
			setDescription("\nGood for nothing armour, not junk. Its free. Duck-taped together.\n"
			+
			"\n" +
			"================================" +
			"\nAn armour\n"+					
			"GUARD BOOST *\n"+
			"SLASH Defence *\n"+
			"CRUSH Defence **\n"+
			"STAB Defence  *\n"+
			"WEIGHT *\n"+
			"SPEED BOOST Neutral\n"+
			"PRICE FREE\n"+
			"\n"+	
			"================================" +
			"\n"
			
			);
		}
}
	
