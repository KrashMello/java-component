package Layouts.LayoutDefault;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import Components.km.Button.Button;
import Components.km.Container.Container;
import Components.km.Title.Title;
import Components.km.Window.ComponentsType;
import Config.Colors;

class LayoutComponents extends ComponentsType {

  Container containerMain = new Container();
  Container containerNorth = new Container();
  Container containerCenter = new Container();
  Container containerButton = new Container();
  Container containerCenterInCenter = new Container();
  Container containerLeftInCenter = new Container();

  public LayoutComponents() {
    this.component = getContainerMain();
  }

  private Container getContainerMain() {
    containerMain.add(getContainerCenter(), BorderLayout.CENTER);
    containerMain.add(getContainerNorth(), BorderLayout.NORTH);
    return containerMain;
  }

  private Container getContainerNorth() {
    containerNorth.setBorderless();
    Title label = new Title("label in north container");
    containerNorth.add(label, BorderLayout.WEST);
    containerNorth.add(getContainerButton(), BorderLayout.EAST);
    return containerNorth;
  }

  private Container getContainerButton() {
    containerButton.setLayout(new GridLayout(1, 2, 1, 0));
    Button closeButton = new Button("X");
    Button toggleThemeButton = new Button("Theme");
    closeButton.addActionListener(e -> System.exit(0));
    toggleThemeButton.addActionListener(e -> {
      Colors.toggleTheme();
      containerNorth.changeTheme();
      containerCenter.changeTheme();
    });
    toggleThemeButton.setPreferredSize(new Dimension(50, 30));
    containerButton.add(toggleThemeButton);
    containerButton.add(closeButton);
    return containerButton;
  }

  private Container getContainerCenter() {
    containerCenter.setBorder(BorderFactory.createTitledBorder("center Container"));
    containerCenter.add(getContainerLeftInCenter(), BorderLayout.WEST);
    containerCenter.add(getContainerCenterInCenter(), BorderLayout.CENTER);
    return containerCenter;
  }

  private Container getContainerLeftInCenter() {
    containerLeftInCenter.setBorder(BorderFactory.createTitledBorder("left Container"));
    containerLeftInCenter.add(new JLabel("label in left container", JLabel.CENTER), BorderLayout.CENTER);
    return containerLeftInCenter;
  }

  private Container getContainerCenterInCenter() {
    containerCenterInCenter.setBorder(BorderFactory.createTitledBorder("center in center Container"));
    containerCenterInCenter.add(new JLabel("label in center center container", JLabel.CENTER), BorderLayout.CENTER);
    return containerCenterInCenter;
  }

}
