//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package rpg.inventory;

import java.util.ArrayList;
import java.util.Iterator;
import rpg.items.Item;
import rpg.items.Misc;
import rpg.items.Armors.Armor;
import rpg.items.weapons.Weapon;

public class Inventory {
    private ArrayList<Item> items;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList();
    }

    public void addItem(Item item) {
        if (!this.isFull()) {
            this.items.add(item);
        } else {
            System.out.println("El inventario está lleno.");
        }

    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public Item getItem(int index) {
        return (Item)this.items.get(index);
    }

    public int getItemCount() {
        return this.items.size();
    }

    public boolean isFull() {
        return this.items.size() >= this.capacity;
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public void clear() {
        this.items.clear();
    }

    public void increaseCapacity(int amount) {
        this.capacity += amount;
    }

    public ArrayList<Armor> listArmors() {
        ArrayList<Armor> armors = new ArrayList();
        Iterator var2 = this.items.iterator();

        while(var2.hasNext()) {
            Item item = (Item)var2.next();
            if (item instanceof Armor) {
                armors.add((Armor)item);
            }
        }

        return armors;
    }

    public ArrayList<Weapon> listWeapons() {
        ArrayList<Weapon> weapons = new ArrayList();
        Iterator var2 = this.items.iterator();

        while(var2.hasNext()) {
            Item item = (Item)var2.next();
            if (item instanceof Weapon) {
                weapons.add((Weapon)item);
            }
        }

        return weapons;
    }

    public ArrayList<Misc> listMisc() {
        ArrayList<Misc> miscItems = new ArrayList();
        Iterator var2 = this.items.iterator();

        while(var2.hasNext()) {
            Item item = (Item)var2.next();
            if (item instanceof Misc) {
                miscItems.add((Misc)item);
            }
        }

        return miscItems;
    }
}
