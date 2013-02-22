package Races;

public class MythicalRaceAttributes {


	private int health;
	private int attack;//SEPERATE
	private int guard;
	private int defence;
	private int speed;
	private int agility;
	private int endurance;
	private int playerWeight;
	private int playerTraining_1;//moderate_melee
	private int playerTraining_2;//ranged
	private int playerTraining_3;//heavy_melee
	private int playerTraining_4;//light_melee
	private int playerTraining_5;//pole arm
	private int Stamina;
	private int initialWealth;
	private int initiative;
	
	private String raceName;
	private String description;
	private String textImage;
	
	//add luck, or maybe level, experience,all that stuff

	//added training
	//change attack into 4 catagories, blade, blunt, other
	//guard should make the opponent skip next turn if you are successful
	
	public MythicalRaceAttributes( String rName, int h, int ak, int gd, int def,
			int s, int ag, int ed, int w, int f, int iw, int i, String d, String t, 
			int pt1, int pt2, int pt3, int pt4, int pt5)
	{
	     raceName=rName;
		 health=h;
		 attack=ak;
		 guard=gd;
		 defence=def;
		 speed=s;
		 agility=ag;
		 endurance=ed;
		 playerWeight=w;
		 Stamina=f;
		 initialWealth=iw;
		 initiative=i;
		 playerTraining_1=pt1;		 
		 playerTraining_2=pt2;
		 playerTraining_3=pt3;		 
		 playerTraining_4=pt4;
		 playerTraining_5=pt5;
		 description=d;
		 textImage=t;
	}
	

	public void setraceName(String raceName) {
		this.raceName = raceName;
	}
	public String getraceName() {
		return raceName;
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
	
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealth() {
		return health;
	}
	public void addHealth(int num) {
		health+=num;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void addSpeed(int num) {
		speed+=num;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getAttack() {
		return attack;
	}
	
	public void setGuard(int Guard) {
		this.guard = Guard;
	}
	public int getGuard() {
		return guard;
	}
	public void addGuard(int num) {
		guard+=num;
	}
	
	public void setDefence(int Defence) {
		this.defence= Defence;
	}
	public int getDefence() {
		return defence;
	}
	public void addDefence(int num) {
		defence+=num;
		
	}
	
	public void setAgility(int agility) {
		this.agility= agility;
	}
	public int getAgility() {
		return agility;
	}
	public void addAgility(int num) {
		agility+=num;
	}
	
	public void setEndurance(int endurance) {
		this.endurance= endurance;
	}
	public int getEndurance() {
		return endurance;
	}
	public void addEndurance(int num) {
		endurance+=num;
	}
	
	public void setplayerWeight(int playerWeight) {
		this.playerWeight= playerWeight;
	}
	public int getplayerWeight() {
		return playerWeight;
	}
	public void addplayerWeight(int num) {
		playerWeight+=num;
	}
	
	public void setStamina(int Stamina) {
		this.Stamina= Stamina;
	}
	public int getStamina() {
		return Stamina;
	}
	public void addStamina(int num) {
		Stamina+=num;
	}

	public void setplayerTraining_1(int t1) {
		this.playerTraining_1= t1;
	}
	public int getplayerTraining_1() {
		return playerTraining_1;
	}
	public void addplayerTraining_1(int num) {
		playerTraining_1+=num;
	}

	public void setplayerTraining_2(int t2) {
		this.playerTraining_2= t2;
	}
	public int getplayerTraining_2() {
		return playerTraining_2;
	}
	public void addplayerTraining_2(int num) {
		playerTraining_2+=num;
	}
	
	public void setplayerTraining_3(int t3) {
		this.playerTraining_3= t3;
	}
	public int getplayerTraining_3() {
		return playerTraining_3;
	}
	public void addplayerTraining_3(int num) {
		playerTraining_3+=num;
	}
	
	public void setplayerTraining_4(int t4) {
		this.playerTraining_4= t4;
	}
	public int getplayerTraining_4() {
		return playerTraining_4;
	}
	public void addplayerTraining_4(int num) {
		playerTraining_4+=num;
	}
	
	public void setplayerTraining_5(int t5) {
		this.playerTraining_5= t5;
	}
	public int getplayerTraining_5() {
		return playerTraining_5;
	}
	public void addplayerTraining_5(int num) {
		playerTraining_5+=num;
	}


	public int getInitialWealth() {
		return initialWealth;
	}
	public void setInitialWealth(int initialWealth) {
		this.initialWealth = initialWealth;
	}


	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	
	

}
