package bth10.character;

import bth10.Character;

public class King extends Character {
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
