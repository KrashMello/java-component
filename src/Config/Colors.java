package Config;

import java.awt.Color;

public class Colors {
  public static String FontFamily = "Arial";
  public static String theme = "DARK";
  public static Color background = Color.DARK_GRAY;
  public static Color foreground = Color.WHITE;
  public static Color primary = Color.ORANGE;
  public static Color secondary = Color.LIGHT_GRAY;

  public static void toggleTheme() {
    switch (theme) {
      case "DARK":
        theme = "LIGHT";
        background = Color.WHITE;
        foreground = Color.DARK_GRAY;
        primary = Color.BLUE;
        secondary = Color.GRAY;
        break;
      case "LIGHT":
        theme = "DARK";
        background = Color.DARK_GRAY;
        foreground = Color.WHITE;
        primary = Color.ORANGE;
        secondary = Color.LIGHT_GRAY;
        break;
      default:
        theme = "DARK";
        background = Color.DARK_GRAY;
        foreground = Color.WHITE;
        primary = Color.ORANGE;
        secondary = Color.LIGHT_GRAY;
        break;
    }
  }
}
