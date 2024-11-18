package rpg.entities;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import rpg.entities.Enemy;
import rpg.enums.ItemType;
import rpg.enums.Stats;
import rpg.inventory.InventoryWindow;
import rpg.items.Item;

/**
 * Clase principal del juego RPG que implementa una interfaz gráfica para gestionar
 * combates entre un jugador y enemigos aleatorios. Proporciona mecánicas de ataque,
 * actualización de estados y un inventario.
 */
public class Game extends JFrame {

    /** El jugador controlado por el usuario */
    private Player player;
    
    /** El enemigo actual contra el que se enfrenta el jugador */
    private Enemy enemy;

    /** Área de texto para mostrar el estado del jugador y el enemigo */
    private JTextArea statusArea;

    /** Botón para realizar ataques */
    private JButton attackButton;

    /**
     * Constructor principal que inicializa la ventana del juego, el jugador y un enemigo aleatorio.
     * Configura los componentes gráficos y la lógica del combate.
     */
    public Game() {
        this.setTitle("Juego de Combate RPG");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(3);
        this.setLayout(new BorderLayout());

        // Inicializar jugador y enemigo
        this.player = new Player("Héroe");
        this.enemy = this.selectRandomEnemy();

        // Configurar área de estado
        this.statusArea = new JTextArea();
        this.statusArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(this.statusArea);
        this.add(scrollPane, "Center");

        // Configurar botón de ataque
        this.attackButton = new JButton("Atacar");
        this.add(this.attackButton, "South");

        // Agregar acción al botón de ataque
        this.attackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Game.this.player.isAlive() && Game.this.enemy.isAlive()) {
                    // El jugador ataca al enemigo
                    Game.this.player.attack(Game.this.enemy);
                    Game.this.printStatus();
                    // Si el enemigo sigue vivo, ataca al jugador
                    if (Game.this.enemy.isAlive()) {
                        Game.this.enemy.attack(Game.this.player);
                        Game.this.printStatus();
                    }
                    // Verificar el estado final del combate
                    if (!Game.this.player.isAlive() || !Game.this.enemy.isAlive()) {
                        Game.this.attackButton.setEnabled(false); // Deshabilitar el botón
                        if (Game.this.player.isAlive()) {
                            Game.this.statusArea.append("\n¡Has derrotado al enemigo!");
                        } else {
                            Game.this.statusArea.append("\nFin del juego. El enemigo te ha derrotado.");
                        }
                    }
                }

            }
        });
        // Mostrar el estado inicial
        this.printStatus();
    }
     /**
     * Selecciona un enemigo aleatorio de una lista predefinida.
     *
     * @return un objeto Enemy seleccionado al azar
     */
    private Enemy selectRandomEnemy() {
        List<Enemy> enemies = new ArrayList();
        enemies.add(new Enemy("Goblin", 50, 5, 2));
        enemies.add(new Enemy("Ogro", 80, 10, 4));
        enemies.add(new Enemy("Dragón Acorazado", 150, 20, 10));
        enemies.add(new Enemy("Esqueleto Normal", 40, 8, 1));
        enemies.add(new Enemy("Zombie", 60, 7, 3));
        Random rand = new Random();
        return (Enemy)enemies.get(rand.nextInt(enemies.size()));
    }
    /**
     * Actualiza el área de estado para mostrar información actual del jugador y del enemigo.
     */
    public void printStatus() {
        this.statusArea.setText("");
        this.statusArea.append("Estado del jugador:\n");
        this.statusArea.append("Nombre: " + this.player.getName() + "\n");
        JTextArea var10000 = this.statusArea;
        String var10001 = String.valueOf(this.player.getStats().get(Stats.HP));
        var10000.append("HP: " + var10001 + "/" + String.valueOf(this.player.getStats().get(Stats.MAX_HP)) + "\n");
        this.statusArea.append("\nEstado del enemigo:\n");
        this.statusArea.append("Nombre: " + this.enemy.getName() + "\n");
        var10000 = this.statusArea;
        var10001 = String.valueOf(this.enemy.getStats().get(Stats.HP));
        var10000.append("HP: " + var10001 + "/" + String.valueOf(this.enemy.getStats().get(Stats.MAX_HP)) + "\n");
    }
    /**
     * Método principal para ejecutar el juego.
     * Inicializa el inventario y abre la ventana del juego.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        List<Item> items = new ArrayList();
        items.add(new Item("Espada", "Una espada afilada.", 100, ItemType.WEAPON));
        items.add(new Item("Armadura", "Una armadura resistente.", 200, ItemType.ARMOR));
        items.add(new Item("Poción", "Una poción de curación.", 50, ItemType.MISC));
        // Ejecutar la ventana del inventario y luego el juego
        SwingUtilities.invokeLater(() -> {
            new InventoryWindow(items);
        });
    }
}
