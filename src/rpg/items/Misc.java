package rpg.items;

import rpg.enums.ItemType;

public class Misc extends Item {
    private boolean consumable;
    private boolean stackable;

    public Misc(String name, String description, int price, boolean consumable, boolean stackable) {
        super(name, description, price, ItemType.MISC);
        this.consumable = consumable;
        this.stackable = stackable;
    }

    public boolean isConsumable() {
        return this.consumable;
    }

    public boolean isStackable() {
        return this.stackable;
    }

    public void use() {
    }
}
