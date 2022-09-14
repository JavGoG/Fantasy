package players.warriors;

import players.warriors.weapons.WeaponWarriors;



public abstract class Warrior implements WeaponWarriors {
    private int health = 5;
    public abstract WeaponWarriors changeWeapon(WeaponWarriors weapon);
}
