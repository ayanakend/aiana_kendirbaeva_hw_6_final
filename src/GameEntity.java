public class GameEntity implements PrintInfo {
    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    private int health;
    private int damage;
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void printInfo() {

    }
}