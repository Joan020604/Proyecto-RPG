/**
 * Enumeración que representa los diferentes tipos de ranuras (slots) 
 * disponibles para equipamiento en un juego de rol (RPG).
 * 
 * <p>Cada constante de esta enumeración representa una ranura específica 
 * en la que se pueden equipar objetos, como cascos, armaduras o armas. 
 * Estas ranuras permiten organizar el equipamiento del personaje.
 * </p>
 */
package rpg.enums;

public enum Slot {
    /**
     * Ranura para equipamiento en la cabeza (por ejemplo, cascos o coronas).
     */
    HEAD,

    /**
     * Ranura para equipamiento en el torso (por ejemplo, armaduras).
     */
    BODY,

    /**
     * Ranura para equipamiento en las piernas (por ejemplo, pantalones o grebas).
     */
    LEGS,

    /**
     * Ranura para equipamiento en los pies (por ejemplo, botas).
     */
    FEET,

    /**
     * Ranura para equipamiento en las manos (por ejemplo, guantes).
     */
    HANDS,

    /**
     * Ranura principal para equipamiento de armas (por ejemplo, espadas o bastones).
     */
    MAIN_HAND;

    /**
     * Constructor privado de la enumeración.
     * 
     * <p>Se utiliza para evitar la creación de instancias de la enumeración
     * fuera de esta definición.</p>
     */
    private Slot() {
    }
}
