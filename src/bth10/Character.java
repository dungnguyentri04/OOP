package bth10;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;
    public Character(){
        weaponBehavior = null;
    }
    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior=weaponBehavior;
    }
    public abstract void fight();

}
