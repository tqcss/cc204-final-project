package com.rubiksSolver.components;

import com.rubiksSolver.utils.UiComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;

public class Bottombar extends JPanel implements UiComponent {
    public Bottombar(GridBagConstraints constraints) {
        System.out.println(constraints);
        this.setConstraintValues(constraints, GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL, 0, 2, 0, 0, 3, 0, 0, 0);
        this.setPreferredSize(new Dimension(0, 40));
    }

    @Override
    public void paintComponent(Graphics graphics) {
        // Set default Background
        Graphics2D graphics2d = (Graphics2D)graphics;
        graphics2d.setColor(new Color(66, 135, 245));
        graphics2d.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}
