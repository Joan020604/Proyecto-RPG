package rpg.entities;

import rpg.enums.Stats;

import java.util.HashMap;

public class Player {

        private String name;
        private HashMap<Stats, Integer> stats;

        public Player(String name){
            this.name= name;
            this.stats= new HashMap<>();
            this.stats.put(Stats.MAX_HP,200);
            this.stats.put(Stats.HP,200);
            this.stats.put(Stats.MAX_MP,100);
            this.stats.put(Stats.MP,100);
            this.stats.put(Stats.ATTACK,30);
            this.stats.put(Stats.DEFENSE,20);
        }


    public boolean isAlive(){
            return stats.get(Stats.HP)>0;
        }
        public void attack(Enemy enemy){
            int dano = this.stats.get(Stats.ATTACK)-enemy.getStats().get(Stats.DEFENSE);
            if (dano>0){
                enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP)-dano);
                System.out.println(this.name + "ataque" + enemy.getName() + "con" + dano + "de daño");
                System.out.println(enemy.getName() + "a perdido" + enemy.getStats().get(Stats.HP)+ " de HP.");
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

