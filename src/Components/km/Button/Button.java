package Components.km.Button;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import Config.Colors;

public class Button extends JButton {
  public Button(String text) {
    setText(text);
    setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    setForeground(Colors.foreground);
    setFocusPainted(false);
    setBackground(Colors.primary);
    setPreferredSize(new Dimension(30, 30));
  }
}
