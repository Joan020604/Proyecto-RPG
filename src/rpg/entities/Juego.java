package rpg.entities;

import java.util.HashMap;

public class Juego {

    private Jugador jugador;
    private Enemigo enemigo;

    public Juego() {
        this.jugador = new Jugador("Rocket");
        this.enemigo = new Enemigo("Loky");
    }
    public void startGame() {
        while (jugador.isAlive() && enemigo.isAlive()) {
            System.out.println("\n--- Turno del jugador ---");
            jugador.ataque(enemigo);

            if (enemigo.isAlive()) {
                System.out.println("\n--- Turno del enemigo ---");
                enemigo.attack(jugador);
            }
        }
        if (jugador.isAlive()) {
            System.out.println("\n¡Victoria! El jugador ha ganado.");
        } else {
            System.out.println("\n¡Derrota! El enemigo ha ganado.");
        }
    }
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.startGame();
    }
}