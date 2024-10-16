package bth10;

public class Troll extends Character{
    @Override
    public void fight() {
        if (weaponBehavior != null) {
            System.out.println("The Troll fight with");
            weaponBehavior.useWeapon();
        }
        else {
            System.out.println("The Troll don't use weapon");
        }
    }
}
