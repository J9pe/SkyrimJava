package Equipment;

public class VikingShield extends Armour{
		public VikingShield(){
			//(String name,int defence1,int defence2,int defence3, 
			//int gB, int Type, int w, int sB, 
			//String armourDescription,String armourTextImage){
			super("",0,0,0,0,0,0,0,0,"","");
			setarmourName("Viking Shield");
			setDefence_SLASH(20);
			setDefence_CRUSH(35);
			setDefence_PIERCING(40);
			setGuardBoost(70);
			setarmourType(4);			
			setWeight(100);//1 is melee, 2 is archery
			setSpeedBoost(-15);//4 for range
			setArmourCost(40);
			setDescription("\nViking shields were made with \n" +
					"planks of wood fastened together side\n" +
					"by side. It was normally covered in some \n" +
					"type of animal skin, with an iron boss\n" +
					"in the center. The edge would be rimmed\n" +
					" with more hide or iron. The shield was \n" +
					"ment to be chewed up as a fight went on, \n" +
					"when a warrior struck it with an ax or\n" +
					"sword it could be caught in the shield,\n" +
					" then it only reguires a simple twist\n" +
					"to dissarm the enemy. This shield was" +
					"\n especially good against arrows."
					
			+
			"\n" +
			"================================" +
			"\nAn armour\n"+					
			"GUARD BOOST *****\n"+
			"SLASH Defence **\n"+
			"CRUSH Defence ***\n"+
			"STAB Defence  ****\n"+
			"WEIGHT *****\n"+
			"SPEED BOOST -****\n"+
			"PRICE ****\n"+
			"\n"+	
			"================================" +
			"\n"
					);
		}
}
	
