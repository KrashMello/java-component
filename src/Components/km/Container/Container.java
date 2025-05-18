package Components.km.Container;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Config.Colors;

import java.awt.BorderLayout;
import java.awt.Component;

public class Container extends JPanel {
  public Container() {
    setLayout(new BorderLayout());
    setBackground(Colors.background);
    setForeground(Colors.foreground);
    // if (args.components != null) {
    // for (ComponentsType components : args.components) {
    // if (components.borderLayout == null) {
    // add(components.component);
    // } else {
    // add(components.component, components.borderLayout);
    // }
    // }
    // }
  }

  public void setBorderTitle(String title) {
    setBorder(BorderFactory.createTitledBorder(title));
  }

  public void setBorderless() {
    setBorder(BorderFactory.createEmptyBorder(8, 8, 1, 1));
  }

  public void changeTheme() {
    for (Component component : getComponents()) {
      component.setBackground(Colors.background);
      component.setForeground(Colors.foreground);
      component.repaint();
    }
    setBackground(Colors.background);
    repaint();
  }
}
