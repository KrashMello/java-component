package Components.km.Button;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Button extends JButton {
  public Button(String text) {
    setText(text);
    setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    setForeground(Color.WHITE);
    setFocusPainted(false);
    setBackground(Color.GRAY);
    setPreferredSize(new Dimension(30, 30));
  }
}
