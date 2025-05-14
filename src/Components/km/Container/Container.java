package Components.km.Container;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

public class Container extends JPanel {
  public Container() {
    setLayout(new BorderLayout());
    setBackground(Color.DARK_GRAY);
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
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
  }
}
