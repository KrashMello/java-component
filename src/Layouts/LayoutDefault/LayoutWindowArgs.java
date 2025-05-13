package Layouts.LayoutDefault;

import Components.Window.WindowArgs;

import java.awt.Color;

import Components.Window.ComponentsType;

class LayoutWindowArgs extends WindowArgs {
  public LayoutWindowArgs() {
    this.title = "default layout";
    this.heigh = 300;
    this.width = 800;
    this.components = new LayoutComponents().components();
  }
}
