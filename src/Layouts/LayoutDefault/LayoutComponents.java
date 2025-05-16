package Layouts.LayoutDefault;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import Components.km.Button.Button;
import Components.km.Container.Container;
import Components.km.Window.ComponentsType;

class LayoutComponents extends ComponentsType {
  public LayoutComponents() {
    this.component = containerMain();
  }

  private Container containerMain() {
    Container container = new Container();
    container.add(centerContainer(), BorderLayout.CENTER);
    container.add(containerNorth(), BorderLayout.NORTH);
    return container;
  }

  private Container containerNorth() {
    Container container = new Container();
    container.setBorderTitle("north container");
    container.add(buttonContainer(), BorderLayout.EAST);
    return container;
  }

  private Container buttonContainer() {
    Container container = new Container();
    Button closeButton = new Button("X");
    closeButton.addActionListener(e -> System.exit(0));
    container.add(closeButton, BorderLayout.EAST);
    return container;
  }

  private Container centerContainer() {
    Container container = new Container();
    container.setBorder(BorderFactory.createTitledBorder("center Container"));
    container.add(leftContainer(), BorderLayout.WEST);
    container.add(centerInCenterContainer(), BorderLayout.CENTER);
    return container;
  }

  private Container leftContainer() {
    Container container = new Container();
    container.setBorder(BorderFactory.createTitledBorder("left Container"));
    container.add(new JLabel("label in left container", JLabel.CENTER), BorderLayout.CENTER);
    return container;
  }

  private Container centerInCenterContainer() {
    Container container = new Container();
    container.setBorder(BorderFactory.createTitledBorder("center in center Container"));
    container.add(new JLabel("label in center center container", JLabel.CENTER), BorderLayout.CENTER);
    return container;
  }

}
