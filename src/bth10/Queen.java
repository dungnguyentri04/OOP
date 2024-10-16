package bth10;

public class Queen extends Character{
    @Override
    public void fight() {
        if (weaponBehavior != null) {
            System.out.println("The Queen fight with");
            weaponBehavior.useWeapon();
        }
        else {
            System.out.println("The Queen don't use weapon");
        }
    }
}
