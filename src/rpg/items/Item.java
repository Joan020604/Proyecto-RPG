
package rpg.items;

import rpg.enums.ItemType;

public class Item {
    private String name;
    private String description;
    private int price;
    private ItemType itemType;

    public Item(String name, String description, int price, ItemType itemType) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.itemType = itemType;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPrice() {
        return this.price;
    }

    public ItemType getItemType() {
        return this.itemType;
    }
}
