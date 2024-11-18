/**
 * Enumeración que representa las diferentes estadísticas (stats) de un personaje
 * en el juego (RPG).
 */
package rpg.enums;

public enum Stats {
    /**
     * Salud actual del personaje.
     */
    HP,

    /**
     * Salud máxima del personaje.
     */
    MAX_HP,

    /**
     * Maná actual del personaje.
     */
    MP,

    /**
     * Maná máximo del personaje.
     */
    MAX_MP,

    /**
     * Poder de ataque del personaje.
     */
    ATTACK,

    /**
     * Defensa del personaje contra ataques.
     */
    DEFENSE,

    /**
     * Velocidad del personaje, afecta el orden de los turnos.
     */
    SPEED,

    /**
     * Destreza, que puede influir en acciones precisas.
     */
    DEXTERITY,

    /**
     * Suerte, afecta eventos aleatorios como hallazgos y críticos.
     */
    LUCK,

    /**
     * Precisión del personaje, afecta la probabilidad de acertar ataques.
     */
    ACCURACY,

    /**
     * Evasión, probabilidad de esquivar ataques enemigos.
     */
    EVASION,

    /**
     * Probabilidad de realizar un golpe crítico.
     */
    CRITICAL_HIT_CHANCE,

    /**
     * Daño adicional que se realiza en un golpe crítico.
     */
    CRITICAL_HIT_DAMAGE;

    /**
     * Constructor privado de la enumeración.
     */
    private Stats() {
    }
}
