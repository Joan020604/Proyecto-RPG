package rpg.entities;

import rpg.enums.Stats;

import java.util.HashMap;

public class Enemigo {

    private String name;
    private HashMap<Stats, Integer> stats;

    public Enemigo(String name){
        this.name = name;
        this.stats = new HashMap<>();
        this.stats.put(Stats.MAX_HP, 50);
        this.stats.put(Stats.HP, 50);
        this.stats.put(Stats.ATAQUE, 5);
        this.stats.put(Stats.DEFENSA, 2);
    }

    public boolean isAlive() {
        return this.stats.get(Stats.HP) > 0;
    }

    public void attack(Jugador jugador) {
        int damage = this.stats.get(Stats.ATAQUE) - jugador.getStats().get(Stats.DEFENSA);
        if (damage > 0) {
            jugador.getStats().put(Stats.HP, jugador.getStats().get(Stats.HP) - damage);
            System.out.println(this.name + " ataca a " + jugador.getName() + " con " + damage + " de daño!");
            System.out.println(jugador.getName() + " a perdido " + jugador.getStats().get(Stats.HP) + "de HP.");
        } else {
            System.out.println(this.name + " ataco " + jugador.getName() + " pero no le hizo daño!");
        }
    }

    public String getName() {
        return name;
    }

    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}
