package Components.km.Window;

import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends JFrame {
  public Window(WindowArgs args) {
    setPreferredSize(new Dimension(args.width, args.heigh));
    setUndecorated(true);
    setLocationRelativeTo(null);
    setTitle(args.title);
    getContentPane().setBackground(args.background);
    setLayout(new BorderLayout());
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    if (args.components != null) {
      for (ComponentsType components : args.components) {
        if (components.borderLayout == null) {
          add(components.component);
        } else {
          add(components.component, components.borderLayout);
        }
      }
    }
    setVisible(true);
  }
}
