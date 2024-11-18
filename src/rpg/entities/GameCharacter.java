package rpg.entities;

import rpg.enums.Stats;

import java.util.HashMap;

/**
 * Representa un personaje abstracto en el juego RPG. 
 * Define las propiedades y comportamientos básicos de un personaje, como su nombre, estadísticas
 * y la capacidad de realizar ataques a otros personajes.
 * 
 * Esta clase debe ser extendida por clases concretas que implementen el método `initCharacter`.
 */
public abstract class GameCharacter {
    
   /** Nombre del personaje 
    */
    protected String name;
    
   /** Estadísticas del personaje representadas como un mapa de Stats a enteros 
    */
    protected HashMap<Stats, Integer> stats;

   /**
    * Constructor de GameCharacter.
    * Inicializa el nombre del personaje y crea un mapa vacío para las estadísticas.
    * 
    * @param name el nombre del personaje
    */
    public GameCharacter(String name) {

        this.name = name;
        this.stats = new HashMap<>();
    }

   /**
    * Método abstracto para inicializar las características del personaje.
    * Debe ser implementado por las subclases para configurar las estadísticas iniciales.
    */
    protected abstract void initCharacter();

   /**
    * Verifica si el personaje está vivo.
    * Un personaje se considera vivo si sus puntos de vida (HP) son mayores a 0.
    * 
    * @return true si el personaje tiene HP mayor a 0, de lo contrario false.
    */
    public boolean isAlive() {
        return stats.get(Stats.HP) > 0;
    }

   /**
    * Realiza un ataque a otro personaje.
    * Calcula el daño infligido basándose en las estadísticas de ataque y defensa, 
    * actualiza los puntos de vida (HP) del enemigo y muestra un mensaje con los resultados del ataque.
    * 
    * @param enemy el personaje enemigo que recibe el ataque
    */
    public void attack(GameCharacter enemy) {

        String message = "";
        String enemyName = enemy.getName();
        int damage = this.stats.get(Stats.ATTACK)
                - enemy.getStats().get(Stats.DEFENSE);
        int newHP = enemy.getStats().get(Stats.HP);
        if (damage > 0) {

            newHP = enemy.getStats().get(Stats.HP) - damage;
            enemy.getStats().put(Stats.HP, newHP);
            message += String.format("""
                    %s attacks %s for %d damage!
                    %s has %d HP left.
                    """, this.name, enemyName, damage,
                    enemyName, newHP);
        } else {
            message += String.format("""
                    %s attacks %s but does no damage!
                    %s has %d HP left.
                    """, this.name, enemyName, enemyName, newHP);
        }
        System.out.println(message);
    }

   /**
    * Obtiene el nombre del personaje con un título decorativo.
    * 
    * @return el nombre del personaje en formato "Nombre el Intrépido".
    */
    public String getName() {
        return String.format("%s el Intrépido", name);
    }

    /**
    * Obtiene las estadísticas del personaje.
    * 
    * @return un mapa que representa las estadísticas del personaje.
    */
    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}
