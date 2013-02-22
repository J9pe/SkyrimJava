package Equipment;

public class PuffyArmour extends Armour{
		public PuffyArmour(){
			//(String name,int defence1,int defence2,int defence3, 
			//int gB, int Type, int w, int sB, 
			//String armourDescription,String armourTextImage){
			super("",0,0,0,0,0,0,0,0,"","");
			setarmourName("PuffyArmour");
			setDefence_SLASH(16);
			setDefence_CRUSH(20);
			setDefence_PIERCING(13);
			setGuardBoost(5);
			setarmourType(2);			
			setWeight(15);//1 is melee, 2 is archery
			setSpeedBoost(-5);//4 for range
			setArmourCost(8);
			setDescription("\nFor your body!\n" +
					"Yo man its fashion, suck it up\n"
			+
			"\n" +
			"================================" +
			"\nAn armour\n"+					
			"GUARD BOOST *\n"+
			"SLASH Defence **\n"+
			"CRUSH Defence ***\n"+
			"STAB Defence  **\n"+
			"WEIGHT *\n"+
			"SPEED BOOST -*\n"+
			"PRICE **\n"+
			"\n"+	
			"================================" +
			"\n"
			
			);
		}
}
	
