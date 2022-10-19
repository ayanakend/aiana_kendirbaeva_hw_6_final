public class Sceleton extends Boss  {
    public Sceleton(int health, int damage, Weapon weapon) {
        super(health, damage, weapon);
    }
    @Override
    public void printInfo() {
        System.err.println( "Название оружия: "+ getWeapon().getNameWeapon() + ", Тип оружия: " + getWeapon().getTypeWeapon() + ", Жизнь: " + getHealth() + ", Урон: " + getDamage());
    }
}