package Layouts;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Components.Window.*;

class LayoutDefault {
  public LayoutDefault() {
    WindowArgs args = new WindowArgs();
    args.setTitle("default layout");
    args.setHeigh(300);
    args.setWidth(800);
    ComponentsType[] components = components();
    args.setComponents(components);
    new Window(args);
  }

  private ComponentsType[] components() {
    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    panel.add(new JLabel("Ventana flotante en Linux"));
    JButton boton = new JButton("Cerrar");
    boton.addActionListener(e -> System.exit(0));
    ComponentsType[] components = new ComponentsType[2];
    components[0] = new ComponentsType(panel, BorderLayout.CENTER);
    components[1] = new ComponentsType(boton, BorderLayout.SOUTH);
    return components;
  }
}
