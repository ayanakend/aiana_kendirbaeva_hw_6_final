public class Boss extends GameEntity {
    private Weapon weapon;
    public Boss(int health, int damage , Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    @Override
    public void printInfo() {
        System.err.println( "Название оружие: "+getWeapon().getNameWeapon() + ", Тип оружия: " + getWeapon().getTypeWeapon() + ", Жизнь: " + getHealth() + ", Урон: " + getDamage());
    }
}