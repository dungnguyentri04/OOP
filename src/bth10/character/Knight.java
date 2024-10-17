package bth10.character;

import bth10.Character;

public class Knight extends Character {
    @Override
    public void fight() {
        if (weaponBehavior != null) {
            System.out.println("The Knight fight with");
            weaponBehavior.useWeapon();
        }
        else {
            System.out.println("The Knight don't use weapon");
        }
    }
}
