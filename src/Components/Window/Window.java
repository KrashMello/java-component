package Components.Window;

import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends JFrame {
  public Window(WindowArgs args) {
    setSize(args.width, args.heigh);
    setUndecorated(true);
    setLocationRelativeTo(null);
    setTitle(args.title);
    setBackground(Color.DARK_GRAY);
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
