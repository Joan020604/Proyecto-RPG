package rpg.enums;

/**
 * Enumeración que representa los diferentes tipos de ítems en el juego RPG.
 * Cada tipo define una categoría específica de objetos que los jugadores pueden usar o equipar.
 */
public enum ItemType {

    /** Arma: ítems diseñados para aumentar el poder de ataque del jugador */
    WEAPON,

    /** Armadura: ítems que ofrecen protección y aumentan las estadísticas defensivas del jugador */
    ARMOR,

    /** Misceláneo: ítems variados que no encajan en las categorías anteriores, como pociones o herramientas */
    MISC;

    /**
     * Constructor privado del enumerado.
     * No se necesita lógica adicional para este enumerado.
     */
    private ItemType() {
    }
}
