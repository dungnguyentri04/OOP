package bth10.behavior;

import bth10.WeaponBehavior;

public class ClubBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Club Behavior");
    }
}
