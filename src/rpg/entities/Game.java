package rpg.entities;
import java.util.HashMap;

public class Game {

    private Player player;
    private Enemy enemy;
    public Game(Player player, Enemy enemigo) {
        this.player = player;
        this.enemy = enemigo;
    }
    public void startGame() {
        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\n--- Turno del jugador ---");
            player.attack(enemy);

            if (enemy.isAlive()) {
                System.out.println("\n--- Turno del enemigo ---");
                enemy.attack(player);
            }
        }
        if (player.isAlive()) {
            System.out.println("\n¡Victoria! El jugador ha ganado.");
        } else {
            System.out.println("\n¡Derrota! El enemigo ha ganado.");
        }
    }
    public static void main(String[] args) {
        Player player = new Player("Rocket", new HashMap<>());
        Enemy enemy = new Enemy("Loky", new HashMap<>());
        Game game = new Game(player, enemy);
        Game.startGame();
    }
}