package bth10.character;

import bth10.Character;

public class Troll extends Character {
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
