public class Boss extends GameEntity {

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    private Weapon weapon;
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    @Override
    public void printInfo() {
        System.out.println( "Название оружие: "+getWeapon().getNameWeapon() + ", Тип оружия: " + getWeapon().getWeaponTypeEnum() + ", Жизнь: " + getHealth() + ", Урон: " + getDamage());
    }
}