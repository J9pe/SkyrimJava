package Equipment;

public class AquaArmour extends Armour{
		public AquaArmour(){
			//(String name,int defence1,int defence2,int defence3, 
			//int gB, int Type, int w, int sB, 
			//String armourDescription,String armourTextImage){
			super("",0,0,0,0,0,0,0,0,"","");
			setarmourName("AquaArmour");
			setDefence_SLASH(6);
			setDefence_CRUSH(500);
			setDefence_PIERCING(100);
			setGuardBoost(5);
			setarmourType(2);			
			setWeight(25);//1 is melee, 2 is archery
			setSpeedBoost(0);//4 for range
			setArmourCost(400);
			setDescription("\nA Type of legendary magic armour that allows overall decent protection and manuverability.\n"
			+
			"\n" +
			"================================" +
			"\nAn armour\n"+					
			"GUARD BOOST *\n"+
			"SLASH Defence ***\n"+
			"CRUSH Defence ********\n"+
			"STAB Defence  *****\n"+
			"WEIGHT **\n"+
			"SPEED BOOST ***\n"+
			"PRICE ******\n"+
			"\n"+	
			"================================" +
			"\n"
			
			);
		}
}
	
