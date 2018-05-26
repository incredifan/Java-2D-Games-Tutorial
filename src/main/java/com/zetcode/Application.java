package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame {

  public Application() {
    initUI();
  }

  public void initUI() {

    add(new Board());
    setSize(330, 330);
    setTitle("Donut");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      Application ex = new Application();
      ex.setVisible(true);
    });
  }
}
