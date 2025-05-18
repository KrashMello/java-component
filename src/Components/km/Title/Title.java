package Components.km.Title;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

import Config.Colors;

public class Title extends JLabel {
  private String fontFamily = "Arial";

  public Title(String text) {
    setText(text);
    setForeground(Colors.foreground);
    setHorizontalAlignment(JLabel.CENTER);
    setFont(new Font(this.fontFamily, Font.BOLD, 20));
  }

  public void setMediumFont() {
    setFont(new Font(this.fontFamily, Font.BOLD, 20));
  }

  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }
}
