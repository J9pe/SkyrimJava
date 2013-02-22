package Equipment;

public class IronHelmet extends Armour{
		public IronHelmet(){
			//(String name,int defence1,int defence2,int defence3, 
			//int gB, int Type, int w, int sB, 
			//String armourDescription,String armourTextImage){
			super("",0,0,0,0,0,0,0,0,"","");
			setarmourName("Iron Helmet");
			setDefence_SLASH(10);
			setDefence_CRUSH(20);
			setDefence_PIERCING(15);
			setGuardBoost(5);
			setarmourType(1);			
			setWeight(20);//1 is melee, 2 is archery
			setSpeedBoost(-5);//4 for range
			setArmourCost(15);
			setDescription("\n(Military Arms & Armour \n" +
					"(excluding Firearms)) a piece of\n" +
					" protective or defensive armour \n" +
					"for the head worn by soldiers, \n" +
					"policemen, firemen, divers, etc.\n" +
					"\nMade of Iron."
			
			
			+
			"\n" +
			"================================" +
			"\nAn armour\n"+					
			"GUARD BOOST *\n"+
			"SLASH Defence ***\n"+
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
	
