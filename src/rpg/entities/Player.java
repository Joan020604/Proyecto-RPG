
package rpg.entities;

import java.util.HashMap;
import java.util.Map;
import rpg.enums.Stats;

public class Player {
    private String name;
    private Map<Stats, Integer> stats;

    public Player(String name) {
        this.name = name;
        this.stats = new HashMap();
        this.stats.put(Stats.MAX_HP, 100);
        this.stats.put(Stats.HP, 100);
        this.stats.put(Stats.ATTACK, 10);
        this.stats.put(Stats.DEFENSE, 5);
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

    public void attack(rpg.entities.Enemy enemy) {
        int damage = (Integer)this.stats.get(Stats.ATTACK) - (Integer)enemy.getStats().get(Stats.DEFENSE);
        if (damage > 0) {
            enemy.getStats().put(Stats.HP, (Integer)enemy.getStats().get(Stats.HP) - damage);
        }

    }
}
