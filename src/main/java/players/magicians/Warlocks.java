package players.magicians;

import players.Player;
import players.warriors.weapons.WeaponWarriors;

public class Warlocks extends Player implements WeaponWarriors {
    private int health;
    private WeaponWarriors weaponWarriors;
    public Warlocks(int health, WeaponWarriors weaponWarriors) {
        super(health, weaponWarriors);
    }

    @Override
    public void sword() {

    }

    @Override
    public void axe() {

    }

    @Override
    public void club() {

    }
}
