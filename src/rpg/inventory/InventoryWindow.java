//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package rpg.inventory;

import java.awt.BorderLayout;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rpg.items.Item;

public class InventoryWindow extends JFrame {
    private JTable itemsTable;
    private DefaultTableModel tableModel;

    public InventoryWindow(List<Item> items) {
        this.setTitle("Inventario de Ítems");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(3);
        this.setLayout(new BorderLayout());
        String[] columnNames = new String[]{"Nombre", "Descripción", "Precio", "Tipo"};
        this.tableModel = new DefaultTableModel(columnNames, 0);
        this.itemsTable = new JTable(this.tableModel);
        Iterator var3 = items.iterator();

        while(var3.hasNext()) {
            Item item = (Item)var3.next();
            Object[] rowData = new Object[]{item.getName(), item.getDescription(), item.getPrice(), item.getItemType().name()};
            this.tableModel.addRow(rowData);
        }

        JScrollPane scrollPane = new JScrollPane(this.itemsTable);
        this.add(scrollPane, "Center");
        this.setVisible(true);
    }
}
