package Layouts.LayoutDefault;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

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
    JButton closeButton = new JButton("X");
    closeButton.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    closeButton.setForeground(Color.WHITE);
    closeButton.setFocusPainted(false);
    closeButton.addActionListener(e -> System.exit(0));
    closeButton.setBackground(Color.RED);
    closeButton.setPreferredSize(new Dimension(30, 30));
    container.setLayout(new GridLayout(0, 1, 0, 8));
    container.add(closeButton);
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
