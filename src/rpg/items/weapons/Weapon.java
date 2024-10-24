package rpg.items.weapons;

import rpg.enums.ItemType;
import rpg.enums.Rarity;
import rpg.enums.Slot;
import rpg.enums.WeaponType;
import rpg.items.Equipment;

public class Weapon extends Equipment {
    private WeaponType weaponType;

    public Weapon(String name, String description, int price, WeaponType weaponType, Slot slot, Rarity rarity) {
        super(name, description, price, ItemType.WEAPON, slot, rarity);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return this.weaponType;
    }

    public void slash() {
    }
}
