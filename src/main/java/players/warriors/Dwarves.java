package players.warriors;

import players.warriors.weapons.WeaponWarriors;

public class Dwarves extends Warrior implements WeaponWarriors {
    @Override
    public WeaponWarriors changeWeapon(WeaponWarriors weapon) {
        return weapon;
    }

    @Override
    public void sword() {
        System.out.println("Sword!");

    }

    @Override
    public void axe() {
        System.out.println("Axe!");

    }

    @Override
    public void club() {
        System.out.println("Club!");


    }
}
