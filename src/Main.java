public class Main {

    enum WeaponType {
        GUN,
        MAGIC,
        COLD;
    }

    Weapon weaponArrows;

    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponType.GUN, "Fire gun");
        Weapon arrows = new Weapon(WeaponType.MAGIC, "Fire arrows");
        Boss boss = new Boss(400, 50, weapon);
        boss.printInfo();
        Sceleton skeleton =new Sceleton(300,55, arrows, 10);
         skeleton.printInfo();

    }
}
