package Equipment;

public class ElectroArmour extends Armour{
		public ElectroArmour(){
			//(String name,int defence1,int defence2,int defence3, 
			//int gB, int Type, int w, int sB, 
			//String armourDescription,String armourTextImage){
			super("",0,0,0,0,0,0,0,0,"","");
			setarmourName("ElectroArmour");
			setDefence_SLASH(26);
			setDefence_CRUSH(12);
			setDefence_PIERCING(200);
			setGuardBoost(5);
			setarmourType(2);			
			setWeight(5);//1 is melee, 2 is archery
			setSpeedBoost(200);//4 for range
			setArmourCost(320);
			setDescription("\nA Type of legendary magic armour that boosts ones speed.\n"
			+
			"\n" +
			"================================" +
			"\nAn armour\n"+					
			"GUARD BOOST *\n"+
			"SLASH Defence **\n"+
			"CRUSH Defence **\n"+
			"STAB Defence  *****\n"+
			"WEIGHT *\n"+
			"SPEED BOOST ******\n"+
			"PRICE ******\n"+
			"\n"+	
			"================================" +
			"\n"
			
			);
		}
}
	
