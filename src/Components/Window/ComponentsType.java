package Components.Window;

import java.awt.Component;

public class ComponentsType {
  protected Component component;
  protected String borderLayout;

  public ComponentsType(Component component, String borderLayout) {
    this.component = component;
    this.borderLayout = borderLayout;
  }

  public ComponentsType(Component component) {
    this.component = component;
  }
}
