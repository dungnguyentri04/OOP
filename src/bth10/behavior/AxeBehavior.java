package bth10.behavior;

import bth10.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Axe Behavior");
    }
}
