package rpg.entities;

import rpg.enums.Stats;

import java.util.HashMap;

public class Enemy {

    private String name;
    private HashMap<Stats, Integer> stats;

    public Enemy(String name){
        this.name = name;
        this.stats = new HashMap<>();
        this.stats.put(Stats.MAX_HP, 50);
        this.stats.put(Stats.HP, 50);
        this.stats.put(Stats.ATTACK, 5);
        this.stats.put(Stats.DEFENSE, 2);
    }

    public boolean isAlive() {
        return this.stats.get(Stats.HP) > 0;
    }

    public void attack(Player player) {
        int damage = this.stats.get(Stats.ATTACK) - player.getStats().get(Stats.DEFENSE);
        if (damage > 0) {
            player.getStats().put(Stats.HP, player.getStats().get(Stats.HP) - damage);
            System.out.println(this.name + " ataca a " + player.getName() + " con " + damage + " de daño!");
            System.out.println(player.getName() + " a perdido " + player.getStats().get(Stats.HP) + "de HP.");
        } else {
            System.out.println(this.name + " ataco " + player.getName() + " pero no le hizo daño!");
        }
    }

    public String getName() {
        return name;
    }

    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}
