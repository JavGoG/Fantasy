package players.warriors;

import players.warriors.weapons.WeaponWarriors;

import java.util.ArrayList;

public abstract class Warrior implements WeaponWarriors {
    private ArrayList<WeaponWarriors> weaponWarriors;

    protected Warrior(ArrayList<WeaponWarriors> weaponWarriors) {
        this.weaponWarriors = weaponWarriors;
    }
}
