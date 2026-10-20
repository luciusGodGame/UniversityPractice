package semester1.practice06.homework;

public class Asta {
    private String name = "Аста";
    private int maxHp = 1000;
    private int hp = 1000;
    private int antiMagicEnergy;
    private int baseAttack = 120;
    private int defense = 35;
    private boolean isBlackFormActive;
    private boolean isOnHislimits;
    private String[] skills = {"Удар Демоноборця", "Чорний Ураган", "Метеорит Демона", "Форма Чорного Демона"};

    public void showStatus() {
        System.out.println("[СТАТУС]" + name);
        System.out.print("Здоровя: ");
        for (int i = 0; i * 50 < maxHp; i++) {
            if (i < hp / 50) {
                System.out.print("█");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(" " + hp + " / " + maxHp);
        System.out.println("Антимагія:" + antiMagicEnergy + " / 100");
        System.out.println("Режим Чорного Демона:" + isBlackFormActive);
    }

    public int basicSwordAttack() {
        changeAntiMagicEnergy(20);
        int damage = isBlackFormActive ? baseAttack * 2 : baseAttack;
        System.out.println(name + " розсікає простір мечем Демоноборця! завдано" + damage + " шкоди");
        return damage;
    }

    public int useSkill(int skillIndes) {
        switch (skillIndes) {
            case 0: {
                if (antiMagicEnergy >= 25) {
                    changeAntiMagicEnergy(-25);
                    System.out.println(name + " використовує" + skills[skillIndes] + " ціною 25 енергії");
                    return 220;
                }
                break;
            }
            case 1: {
                if (antiMagicEnergy >= 50) {
                    changeAntiMagicEnergy(-50);
                    System.out.println(name + " використовує" + skills[skillIndes] + " за ціною 50 енергії");
                    return 380;
                }
                break;
            }
            case 2: {
                if (antiMagicEnergy >= 75) {
                    changeAntiMagicEnergy(-75);
                    System.out.println(name + " використовує" + skills[skillIndes] + " ціною 75 енергії");
                    return 550;
                }
                break;
            }
            case 3: {
                if (antiMagicEnergy >= 100) {
                    changeAntiMagicEnergy(-100);
                    System.out.println(name + " використовує" + skills[skillIndes] + " та активовує форму Чорного Демона! \n" +
                            " Це відновлює 300HP посилює атаки й вартувало 100 енергії!");
                    changeHp(300);
                    isBlackFormActive = true;
                    return 0;
                }
                break;
            }
            default: {
                System.out.println("Не правильно обрана здібність!");
                return 0;
            }
        }
        System.out.println("Недостатньо енергії для цієї навички!");
        return 0;
    }

    public void takeDamage(int incomingDamage) {
        incomingDamage = incomingDamage - defense;
        if (incomingDamage < 15) {
            incomingDamage = 15;
        }
        changeHp(-incomingDamage);
        System.out.println("Меч частково блокує шкоду!" + name + " отримує " + incomingDamage + " чистої шкоди");
    }

    public void pushLimits() {
        if (!isOnHislimits && (hp < (maxHp * 0.25))) {
            System.out.println(name + " досяг свого ліміту й не бажає здаватися!");
            isOnHislimits = true;
            changeHp(150);
            changeAntiMagicEnergy(50);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    private void changeAntiMagicEnergy(int number) {
        antiMagicEnergy += number;
        if (antiMagicEnergy > 100) {
            antiMagicEnergy = 100;
        }
        if (antiMagicEnergy < 0) {
            antiMagicEnergy = 0;
        }
    }

    private void changeHp(int number) {
        hp += number;
        if (hp > maxHp) {
            hp = maxHp;
        } else if (hp <= 0) {
            hp = 0;
        }
        if (hp > 0) {
            pushLimits();
        }
    }
}
