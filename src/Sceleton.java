public class Sceleton extends Boss  {

    private int arrows;

    public Sceleton(int health, int damage, Weapon weapon, int arrows) {
        super(health, damage, weapon);
        this.arrows = arrows;
    }

    @Override
    public void printInfo() {
        System.out.println( "Название оружия: "+ getWeapon().getNameWeapon() + ", Тип оружия: " + getWeapon().getNameWeapon() + ", Жизнь: " + getHealth() + ", Урон: " + getDamage() + ", Стрелы: " + arrows);
    }
}