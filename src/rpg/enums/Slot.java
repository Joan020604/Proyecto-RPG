/**
 * Enumeración que representa los diferentes tipos de (slots) 
 * disponibles para equipamiento en el juego (RPG).
 */
package rpg.enums;

public enum Slot {
    /**
     * Slot para equipamiento en la cabeza.
     */
    HEAD,

    /**
     * Slot para equipamiento en el torso.
     */
    BODY,

    /**
     * Slot para equipamiento en las piernas.
     */
    LEGS,

    /**
     * Slot para equipamiento en los pies.
     */
    FEET,

    /**
     * Slot para equipamiento en las manos.
     */
    HANDS,

    /**
     * Slot principal para equipamiento de armas.
     */
    MAIN_HAND;

    /**
     * Constructor privado de la enumeración.
     */
    private Slot() {
    }
}
