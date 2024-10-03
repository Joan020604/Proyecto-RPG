package rpg.entities.enemies.bats;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.EnemyType;
import rpg.enums.Stats;
import rpg.utils.Randomized;

public class TinyBat extends Enemy {

    public TinyBat() {
        super("Basic Slime");
    }

    @Override
    public void getLoot() {
        System.out.println("The Basic Slime drops a bottle of slime.");
    }

    @Override
    protected void initCharacter() {
        this.type = EnemyType.BASIC;
        this.stats.put(Stats.MAX_HP, 20);
        this.stats.put(Stats.HP, 20);
        this.stats.put(Stats.ATTACK, 4);
        this.stats.put(Stats.DEFENSE, 1);
    }

    protected void splash(GameCharacter enemy) {
        // Recuperamos el nombre del enemigo.
        String enemyName = enemy.getName();
        // Calculamos la vida del enemigo después del ataque. El daño es 0 en este caso.
        int newHP = enemy.getStats().get(Stats.HP);
        System.out.printf("""
                %s splashes %s and does nothing.
                %s has %d HP left.
                """, this.name, enemyName, enemyName, newHP);
    }

    protected void trhowSlime(GameCharacter enemy) {

        String enemyName = enemy.getName();
        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.8);
        enemy.getStats().put(Stats.HP,
                enemy.getStats().get(Stats.HP) - damage);
        int newHP = enemy.getStats().get(Stats.HP);
        System.out.printf("""
                %s throws slime at %s for %d damage!
                %s has %d HP left.
                """, this.name, enemyName, damage, enemyName, newHP);
    }

    @Override
    public void attack(GameCharacter enemy) {

        if (Randomized.getRandomBoolean()) splash(enemy);
        else trhowSlime(enemy);
    }
}