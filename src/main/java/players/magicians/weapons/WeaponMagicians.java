package players.magicians.weapons;

import players.magicians.Dragon;
import players.magicians.Ogre;

public interface WeaponMagicians {
    Dragon dragon = new Dragon();
    Ogre ogre = new Ogre();
    void fireBall();
    void lightningStrike();
}
