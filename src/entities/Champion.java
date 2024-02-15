package entities;

public class Champion {
	
	private String name;
    private int health;
    private int attack;
    private int armor;

    public Champion(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(Champion opponent) {
        int damage = Math.max(1, opponent.attack - this.armor);
        this.health = Math.max(0, this.health - damage);
    }

    public String status() {
        if (this.health > 0) {
            return this.name + ": " + this.health + " de vida";
        } else {
            return this.name + ": 0 de vida (morreu)";
        }
    }
}