package com.rubiksSolver.components;

import com.rubiksSolver.utils.UiComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;

public class Viewport extends JPanel implements UiComponent {
    public Viewport(GridBagConstraints constraints) {
        this.setConstraintValues(constraints, GridBagConstraints.WEST, GridBagConstraints.BOTH, 0, 1, 1, 1, 1, 1, 0, 0);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        // Set default Background
        Graphics2D graphics2d = (Graphics2D)graphics;
        graphics2d.setColor(new Color(220, 220, 220));
        graphics2d.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}
