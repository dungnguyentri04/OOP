package bth10;

import bth10.behavior.AxeBehavior;
import bth10.behavior.ClubBehavior;
import bth10.behavior.KnifeBehavior;
import bth10.behavior.SwordBehavior;
import bth10.character.King;
import bth10.character.Knight;
import bth10.character.Queen;
import bth10.character.Troll;

public class Main {
    public static void main(String[] args){
        ClubBehavior clubBehavior = new ClubBehavior();
        KnifeBehavior knifeBehavior = new KnifeBehavior();
        SwordBehavior swordBehavior = new SwordBehavior();
        AxeBehavior axeBehavior = new AxeBehavior();
        King king = new King();
        Queen queen = new Queen();
        Troll troll = new Troll();
        Knight knight = new Knight();
        king.setWeaponBehavior(clubBehavior);
        queen.setWeaponBehavior(axeBehavior);
        troll.setWeaponBehavior(knifeBehavior);
        knight.setWeaponBehavior(swordBehavior);
        king.fight();
    }
}
