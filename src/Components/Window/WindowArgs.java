package Components.Window;

public class WindowArgs {
  String title = "title";
  Integer width = 300;
  Integer heigh = 300;
  ComponentsType[] components = null;

  public void setTitle(String title) {
    this.title = title;
  }

  public void setHeigh(Integer heigh) {
    this.heigh = heigh;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public void setComponents(ComponentsType[] components) {
    this.components = components;
  }
}
