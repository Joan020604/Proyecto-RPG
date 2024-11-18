package rpg.enums;

/**
 * Enumeración que representa los diferentes tipos de armas disponibles
 * en el juego (RPG).
 */
public enum WeaponType {
    /**
     * Espada: arma equilibrada con buena capacidad de ataque.
     */
    SWORD,

    /**
     * Hacha: arma poderosa con mayor daño pero menos precisión.
     */
    AXE,

    /**
     * Arco: arma de ataque a distancia con alta velocidad.
     */
    BOW,

    /**
     * Bastón: arma mágica utilizada principalmente por magos o sanadores.
     */
    STAFF,

    /**
     * Grimorio: libro mágico que permite lanzar hechizos avanzados.
     */
    GRIMOIRE;

    /**
     * Constructor privado de la enumeración.
     */
    private WeaponType() {
    }
}
