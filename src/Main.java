import java.awt.*;
import Views.MainView;

class Main {
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          new MainView();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
}
