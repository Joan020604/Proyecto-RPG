package rpg.entities;

import rpg.enums.Stats;

import java.util.HashMap;

public class Jugador {

        private String name;
        private HashMap<Stats, Integer> stats:

        public Jugador(String name){
            this.name= name;
            this.stats= new HashMap<>();
            this.stats.put(Stats.MAX_HP,200);
            this.stats.put(Stats.HP,200);
            this.stats.put(Stats.MAX_MP,100);
            this.stats.put(Stats.MP,100);
            this.stats.put(Stats.ATAQUE,30);
            this.stats.put(Stats.DEFENSA,20);
        }


    public boolean isAlive(){
            return stats.get(Stats.HP)>0;
        }
        public void ataque(Enemy enemy){
            int dano = this.stats.get(Stats.ATAQUE)-enemy.getStats().get(Stats.DEFENSA);
            if (dano>0){
                enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP)-dano);
                System.out.println(this.name + "ataque" + enemy.getName() + "con" + dano + "de daño");
                System.out.println(enemy.getName() + "a perdido" + enemy.getStats().GET(Stats.HP)+ " de HP.");
            }
            else {
                System.out.println(this.name + " ataco " + enemy.getName() + "pero no le hizo daño");}
        }
        public String getName(){
            return name;
        }
        public HashMap<Stats, Integer> getStats(){
            return stats;
        }
    }

