package semester1.practice06;

public class Player {
    public String nickname;
    private int health = 100;

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
            System.out.println(nickname + " загинув!");
        }
    }

    public void heal(int amount) {
        this.health += amount;
        if (this.health > 100) {
            this.health = 100;
        }
    }
}
