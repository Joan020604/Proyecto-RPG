package rpg.entities;

import java.util.HashMap;

public class Game {

    private Player player;
    private Enemy enemy;

    public Game() {
        this.player = new Player("Rocket");
        this.enemy = new Enemy("Loky");
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
        Game game = new Game();
        game.startGame();
    }
}