
package rpg.entities.enemies;

import java.util.HashMap;
import java.util.Map;
import rpg.enums.Stats;


public class Enemy {
    private String name;
    private Map<Stats, Integer> stats;

    public Enemy(String name, int maxHP, int attack, int defense) {
        this.name = name;
        this.stats = new HashMap();
        this.stats.put(Stats.MAX_HP, maxHP);
        this.stats.put(Stats.HP, maxHP);
        this.stats.put(Stats.ATTACK, attack);
        this.stats.put(Stats.DEFENSE, defense);
    }

    public String getName() {
        return this.name;
    }

    public Map<Stats, Integer> getStats() {
        return this.stats;
    }

    public boolean isAlive() {
        return (Integer)this.stats.get(Stats.HP) > 0;
    }

    public void attack(Player player) {
        int damage = (Integer)this.stats.get(Stats.ATTACK) - (Integer)player.getStats().get(Stats.DEFENSE);
        if (damage > 0) {
            player.getStats().put(Stats.HP, (Integer)player.getStats().get(Stats.HP) - damage);
        }

    }
}
