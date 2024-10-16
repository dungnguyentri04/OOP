package bth10;

public class King extends Character{
    @Override
    public void fight() {
        if (weaponBehavior != null) {
            System.out.println("The King fight with");
            weaponBehavior.useWeapon();
        }
        else {
            System.out.println("The King don't use weapon");
        }
    }
}
