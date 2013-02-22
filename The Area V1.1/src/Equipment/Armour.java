package Equipment;

public class Armour {

	private int defence_SLASH=0;
	private int defence_CRUSH=0;
	private int defence_PIERCING=0;
	
	private int guardBoost=0;//the amount that it guards
	private int armourType=0;//0 is nothing, 1 is helmet, 2 is body, 3 is footwear, 4 is shield 
	private int weight=0;
	private int speedBoost=0;

	private String armourName;
	private String description;
	private String textImage;

	private int ArmourCost;
		
	public Armour(String name,int defence1,int defence2,int defence3, 
			int gB, int Type, int w, int sB, int wC,
			String armourDescription,String armourTextImage){
		armourName=name;
		defence_SLASH=defence1;
		defence_CRUSH=defence2;
		defence_PIERCING=defence3;
		guardBoost=gB;
		armourType=Type;
		weight=w;
		speedBoost=sB;
		ArmourCost=wC;
		description=armourDescription;
		textImage=armourTextImage;
	}
	
	
	public void setDefence_PIERCING(int defence_PIERCING) {
		this.defence_PIERCING = defence_PIERCING;
	}

	public int getDefence_PIERCING() {
		return defence_PIERCING;
	}

	public void setDefence_CRUSH(int defence_CRUSH) {
		this.defence_CRUSH = defence_CRUSH;
	}

	public int getDefence_CRUSH() {
		return defence_CRUSH;
	}

	public void setDefence_SLASH(int defence_SLASH) {
		this.defence_SLASH = defence_SLASH;
	}

	public int getDefence_SLASH() {
		return defence_SLASH;
	}

	public void setarmourType(int Type) {
		this.armourType = Type;
	}

	public int getarmourType() {
		return armourType;
	}

	public void setarmourName(String armourName) {
		this.armourName = armourName;
	}
	public String getarmourName() {
		return armourName;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void settextImage(String textImage) {
		this.textImage = textImage;
	}
	public String gettextImage() {
		return textImage;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSpeedBoost() {
		return speedBoost;
	}
	public void setSpeedBoost(int speedBoost) {
		this.speedBoost = speedBoost;
	}


	public int getGuardBoost() {
		return guardBoost;
	}
	public void setGuardBoost(int guardBoost) {
		this.guardBoost = guardBoost;
	}

	public int getArmourCost() {
		return ArmourCost;
	}
	public void setArmourCost(int ArmourCost) {
		this.ArmourCost = ArmourCost;
	}


}
