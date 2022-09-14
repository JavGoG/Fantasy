package players;

import players.warriors.weapons.WeaponWarriors;

public abstract class Player {
    private int health;
    private WeaponWarriors weaponWarriors;

    public Player(int health, WeaponWarriors weaponWarriors) {
        this.health = health;
        this.weaponWarriors = weaponWarriors;
    }
}
