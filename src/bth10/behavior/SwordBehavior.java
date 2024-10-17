package bth10.behavior;

import bth10.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Sword Behavior");
    }
}
