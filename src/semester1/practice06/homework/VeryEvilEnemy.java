package semester1.practice06.homework;

public class VeryEvilEnemy {
    private String name = "Рікардо, великий брат Середнього";
    private int hp = 1200;
    private int maxHp = 1200;
    private boolean usedCoupons;
    private Attack[] attacks = {
            new Attack("Лупцування!", 75),
            new Attack("Пинання!", 100),
            new Attack("Записаний!", 150),
            new Attack("За родину!", 110),
            new Attack("Відповідати за дії", 200),
    };

    public int attacking() {
        int index = (int) (Math.random() * 4);
        if (!usedCoupons && (hp < (maxHp * 0.5))) {
            index = 4;
            usedCoupons = true;
        }
        System.out.println(name + " використовує " + attacks[index].getName());
        return attacks[index].getDamage();
    }

    public void takeDamage(int incomingDamage) {
        changeHp(-incomingDamage);
        System.out.println(name + " отримує " + incomingDamage + " шкоди!");
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName() {
        return name;
    }

    public String showHp() {
        return hp + "/" + maxHp;
    }

    private void changeHp(int number) {
        hp += number;
        if (hp > maxHp) {
            hp = maxHp;
        } else if (hp <= 0) {
            hp = 0;
        }
    }
}

class Attack {
    private String name;
    private int damage;

    public Attack(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

}