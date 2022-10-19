public class Weapon {

    private Enum<Main.WeaponType> weaponTypeEnum;

    private String nameWeapon;

    public Weapon(Enum<Main.WeaponType> weaponTypeEnum, String nameWeapon) {
        this.weaponTypeEnum = weaponTypeEnum;
        this.nameWeapon = nameWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public Enum<Main.WeaponType> getWeaponTypeEnum() {
        return weaponTypeEnum;
    }

    public void setWeaponTypeEnum(Enum<Main.WeaponType> weaponTypeEnum) {
        this.weaponTypeEnum = weaponTypeEnum;
    }
}