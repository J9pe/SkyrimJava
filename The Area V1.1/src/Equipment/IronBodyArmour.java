package Equipment;

public class IronBodyArmour extends Armour{
		public IronBodyArmour(){
			//(String name,int defence1,int defence2,int defence3, 
			//int gB, int Type, int w, int sB, 
			//String armourDescription,String armourTextImage){
			super("",0,0,0,0,0,0,0,0,"","");
			setarmourName("Iron Body Armour");
			setDefence_SLASH(95);
			setDefence_CRUSH(50);
			setDefence_PIERCING(65);
			setGuardBoost(10);
			setarmourType(2);			
			setWeight(100);//1 is melee, 2 is archery
			setSpeedBoost(-25);//4 for range
			setArmourCost(55);
			setDescription("\nFor your body!\n" +
					"Due to the ever increasing thickness\n " +
					"of the armour, and the associated weight, \n" +
					"proposals were made from an early date\n" +
					" to faceharden the iron or weld steel plates\n" +
					" to the front face of iron armour. \n" +
					"Efforts to carry out these proposals failed for \n" +
					"many reasons, primarily because the \n" +
					"metallurgy at the time was not up to the task.\n"
			
			+
			"\n" +
			"================================" +
			"\nAn armour\n"+					
			"GUARD BOOST **\n"+
			"SLASH Defence ****\n"+
			"CRUSH Defence ****\n"+
			"STAB Defence  ****\n"+
			"WEIGHT *****\n"+
			"SPEED BOOST -****\n"+
			"PRICE *****\n"+
			"\n"+	
			"================================" +
			"\n"
			
			);
		}
}
	
