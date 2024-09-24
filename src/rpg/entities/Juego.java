package rpg.entities;
import java.util.HashMap;

public class Juego {

    private Jugador jugador;
    private Enemigo enemigo;
    public Juego(Jugador jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }
    public void startGame() {
        while (jugador.isAlive() && enemigo.isAlive()) {
            System.out.println("\n--- Turno del jugador ---");
            // jugador.attack(enemy);

            if (enemigo.isAlive()) {
                System.out.println("\n--- Turno del enemigo ---");
                //enemigo.attack(jugador);
            }
        }
        if (jugador.isAlive()) {
            System.out.println("\n¡Victoria! El jugador ha ganado.");
        } else {
            System.out.println("\n¡Derrota! El enemigo ha ganado.");
        }
    }
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Rocket", new HashMap<>());
        Enemigo enemigo = new Enemigo("Loky", new HashMap<>());
        Juego juego = new Juego(jugador, enemigo);
        Juego.startGame();
    }
}