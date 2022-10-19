public class Main {

    enum WeaponType {
        GUN,
        SWORD,
        BOMB
    }

    public static void main(String[] args) {
        Boss boss = new Boss( 500 , 100 , new Weapon("Sword", "Katana"));
        boss.printInfo();
        Sceleton skeleton =new Sceleton(300,55,new Weapon("Gun","Fire Gun"));
        skeleton.printInfo();

    }
}
