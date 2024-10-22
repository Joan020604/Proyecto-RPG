//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package rpg.items.Armors;

import rpg.enums.ArmorType;
import rpg.enums.ItemType;
import rpg.enums.Rarity;
import rpg.enums.Slot;
import rpg.items.Equipment;

public class Armor extends Equipment {
    private ArmorType armorType;

    public Armor(String name, String description, int price, ArmorType armorType, Slot slot, Rarity rarity) {
        super(name, description, price, ItemType.ARMOR, slot, rarity);
        this.armorType = armorType;
    }

    public ArmorType getArmorType() {
        return this.armorType;
    }

    public void protect() {
    }
}
