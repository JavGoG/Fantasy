package players.warriors;

import players.warriors.weapons.WeaponWarriors;

import java.util.ArrayList;

public class Barbarians extends Warrior{

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



    @Override
    public WeaponWarriors changeWeapon(WeaponWarriors weapon) {
        return weapon;
    }
}
