package com.safari;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Statistics extends JPanel {

  public JTable table;
  public DefaultTableModel tableModel;

  public Statistics() {
    String[] columns = {"Name", "HP", "Food", "Water"};
    this.tableModel = new DefaultTableModel(columns, 0);
    this.table = new JTable(tableModel);
    JScrollPane plane = new JScrollPane(table);
    add(plane);
  }

  protected void update() {
    tableModel.setRowCount(0);
    for (Animal a : Savanna.getAnimals()) {
      tableModel.insertRow(tableModel.getRowCount(), new Object[] { a.getName(), a.getHp(), a.getFood(), a.getWater() });
    }

    for (Carrion a : Savanna.getCarrions()) {
      tableModel.insertRow(tableModel.getRowCount(), new Object[] { a.getName(), a.getDurability() });
    }
  }

  protected void showStats(Statistics stats) {
    JFrame frame = new JFrame("stats");
    frame.add(stats);
    frame.pack();
    frame.setVisible(true);
    frame.setResizable(false);
    stats.update();
  }
}
