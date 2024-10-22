//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package rpg.items;

import java.util.HashMap;
import rpg.enums.ItemType;
import rpg.enums.Rarity;
import rpg.enums.Slot;
import rpg.enums.Stats;
import rpg.interfaces.Equipable;

public abstract class Equipment extends Item implements Equipable {
    protected Slot slot;
    protected Rarity rarity;
    protected HashMap<Stats, Integer> stats;

    public Equipment(String name, String description, int price, ItemType itemType, Slot slot, Rarity rarity) {
        super(name, description, price, itemType);
        this.slot = slot;
        this.rarity = rarity;
        this.stats = new HashMap();
    }

    public void equip() {
    }

    public void unequip() {
    }

    public Slot getSlot() {
        return this.slot;
    }

    public Rarity getRarity() {
        return this.rarity;
    }

    public HashMap<Stats, Integer> getStats() {
        return this.stats;
    }
}
