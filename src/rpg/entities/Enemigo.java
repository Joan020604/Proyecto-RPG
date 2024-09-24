package rpg.entities;

import rpg.enums.Stats;

import java.util.HashMap;

public class Enemigo {

    private String name;
    private HashMap<Stats, Integer> stats;

    public Enemigo(String name){
        this.name = name;
        this.stats = new HashMap<>();
        this.stats.put(Stats.MAX_HP, 80);
        this.stats.put(Stats.HP, 80);
        this.stats.put(Stats.MAX_MP,80);
        this.stats.put(Stats.MP,80);
        this.stats.put(Stats.ATAQUE, 25);
        this.stats.put(Stats.DEFENSA, 12);
    }

    public boolean isAlive() {
        return this.stats.get(Stats.HP) > 0;
    }

    public void attack(Jugador jugador) {
        int dano = this.stats.get(Stats.ATAQUE) - jugador.getStats().get(Stats.DEFENSA);
        if (dano > 0) {
            jugador.getStats().put(Stats.HP, jugador.getStats().get(Stats.HP) - dano);
            System.out.println(this.name + " ataco a " + jugador.getName() + " con " + dano + " de daño!");
            System.out.println(jugador.getName() + " tiene " + jugador.getStats().get(Stats.HP) + " de HP.");
        }
        else {
            System.out.println(this.name + " ataco a " + jugador.getName() + " pero no le hizo daño!");
        }
    }

    public String getName() {
        return name;
    }

    public HashMap<Stats, Integer> getStats(){
        return stats;
    }
}
