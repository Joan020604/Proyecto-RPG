package rpg.enums;

/**
 * Enumeración que representa los diferentes tipos de enemigos en el juego RPG.
 * Cada tipo de enemigo indica su nivel de dificultad o rareza.
 */
public enum EnemyType {

    /** Enemigo básico: nivel inicial, comúnmente más débil y fácil de derrotar */
    BASIC,

    /** Enemigo medio: nivel intermedio, presenta mayor desafío que un enemigo básico */
    MEDIUM,

    /** Jefe: enemigo poderoso con estadísticas superiores y habilidades especiales */
    BOSS,

    /** Enemigo secreto: rara vez encontrado, puede tener habilidades únicas o recompensas especiales */
    SECRET;
}
