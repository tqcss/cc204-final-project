package com.rubiksSolver;

import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Container;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Window extends JFrame {
    private final GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    public GridBagConstraints constraints = new GridBagConstraints();
    public Container contentPane = this.getContentPane();
    


    public Window() {
        // Set up initial window state
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        System.out.println(constraints);

        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setMaximizedBounds(environment.getMaximumWindowBounds());
        this.setSize(calculateReducedWindowSize(screenSize));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(Globals.TITLE);
        this.setVisible(true);

        // Define window layout
        contentPane.setLayout(new GridBagLayout());
    }

    private Dimension calculateReducedWindowSize(Dimension screenSize) {
        final int reducedX = (int)(screenSize.getWidth() * Globals.WINDOW_SIZE);
        final int reducedY = (int)(screenSize.getWidth() * Globals.WINDOW_SIZE / Globals.WINDOW_ASPECT_RATIO);
        return new Dimension(reducedX, reducedY);
    }

    public void addComponent(Component comp) {
        this.contentPane.add(comp, this.constraints);
    }
}
