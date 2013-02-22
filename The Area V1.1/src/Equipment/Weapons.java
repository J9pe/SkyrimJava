package Equipment;

public class Weapons {

	private boolean twoHanded=false;
	private int attack_SLASH=0;
	private int attack_CRUSH=0;
	private int attack_PIERCING=0;
	private int attackSpeed=0;
	private int weaponRange=0;
	private int weaponType=0;
	private int weaponWeight=0;
	private int weaponCost=0;
	private String weaponName;
	private String description;
	private String textImage;


		
	public Weapons(String name,boolean hand,int attack1,int attack2,int attack3,
			int wrange, int Type, int weaponCostParameter, String weapondescription, String weapontextimage, 
			int aSpeed, int wWeight){
		weaponName=name;
		twoHanded=hand;
		attack_SLASH=attack1;
		attack_CRUSH=attack2;
		attack_PIERCING=attack3;
		weaponRange=wrange;
		weaponType=Type;
		description=weapondescription;
		textImage=weapontextimage;
		attackSpeed=aSpeed;
		weaponCost=weaponCostParameter;
		weaponWeight=wWeight;
	}
	
	
	public void setAttack_PIERCING(int attack_PIERCING) {
		this.attack_PIERCING = attack_PIERCING;
	}

	public int getAttack_PIERCING() {
		return attack_PIERCING;
	}

	public void setAttack_CRUSH(int attack_CRUSH) {
		this.attack_CRUSH = attack_CRUSH;
	}

	public int getAttack_CRUSH() {
		return attack_CRUSH;
	}

	public void setAttack_SLASH(int attack_SLASH) {
		this.attack_SLASH = attack_SLASH;
	}

	public int getAttack_SLASH() {
		return attack_SLASH;
	}

	public void setWeaponType(int Type) {
		this.weaponType = Type;
	}

	public int getWeaponType() {
		return weaponType;
	}
	
	public void setTwoHanded(boolean TwoHanded) {
		this.twoHanded = TwoHanded;
	}

	public boolean getTwoHanded() {
		return twoHanded;
	}

	public void setweaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	public String getweaponName() {
		return weaponName;
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


	public void setWeaponRange(int weaponRange) {
		this.weaponRange = weaponRange;
	}
	public int getWeaponRange() {
		return weaponRange;
	}
	
	public int getAttackSpeed() {
		return attackSpeed;
	}
	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}


	public int getWeaponWeight() {
		return weaponWeight;
	}
	public void setWeaponWeight(int weaponWeight) {
		this.weaponWeight = weaponWeight;
	}


	public void setWeaponCost(int weaponCost) {
		this.weaponCost = weaponCost;
	}


	public int getWeaponCost() {
		return weaponCost;
	}
}
