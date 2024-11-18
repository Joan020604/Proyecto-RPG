package rpg.enums;

/**
 * Enumeración que representa los diferentes tipos de armadura en el juego RPG.
 * Cada tipo de armadura se asocia con una parte específica del cuerpo del personaje.
 */
public enum ArmorType {

    /** Casco, protege la cabeza del personaje */
    HELMET,

    /** Pechera, protege el torso del personaje */
    CHESTPLATE,

    /** Pantalones, protegen las piernas del personaje */
    LEGGINGS,

    /** Botas, protegen los pies del personaje */
    BOOTS,

    /** Guantes, protegen las manos del personaje */
    HANDS;

    /**
     * Constructor privado para evitar la creación de instancias fuera de la enumeración.
     * No se requiere inicialización adicional.
     */
    private ArmorType() {
    }
}
