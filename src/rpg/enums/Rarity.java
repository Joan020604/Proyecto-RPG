package rpg.enums;

/**
 * Enumeración que representa los diferentes niveles de rareza de un ítem en el juego RPG.
 * La rareza indica cuán difícil es encontrar un ítem y, generalmente, su valor o poder relativo.
 */
public enum Rarity {

    /** Común: ítems más frecuentes y fáciles de encontrar */
    COMMON,

    /** Poco común: ítems ligeramente más difíciles de obtener que los comunes */
    UNCOMMON,

    /** Raro: ítems valiosos y menos frecuentes */
    RARE,

    /** Épico: ítems muy raros y significativamente poderosos */
    EPIC,

    /** Legendario: ítems excepcionales, extremadamente raros y únicos */
    LEGENDARY;

    /**
     * Constructor privado del enumerado.
     */
    private Rarity() {
    }
}
