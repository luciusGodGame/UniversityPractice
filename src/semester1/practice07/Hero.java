package semester1.practice07;

public class Hero {
    private String name;
    private int health;
    private int attackPower;
    private int defense;

    public Hero(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public void attack(Hero target) {
        int damage = this.attackPower - target.defense;
        if (damage <= 0) {
            damage = 1;
        }
        target.modifyHealth(damage * -1);
        System.out.println(target.getName() + " було атаковано на " + damage + " шкоди героєм " + name + ". "
                + target.getName() + " залишилося " + target.getHealth() + " здоровя!");
    }

    public void modifyHealth(int number) {
        health += number;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
