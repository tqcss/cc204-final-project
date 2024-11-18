package com.rubiksSolver.components;

import com.rubiksSolver.utils.UiComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;

public class OptionPanel extends JPanel implements UiComponent {
    public OptionPanel(GridBagConstraints constraints) {
        this.setConstraintValues(constraints, GridBagConstraints.WEST, GridBagConstraints.BOTH, 1, 1, 2, 1, 2, 1, 0, 0);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        // Set default Background
        Graphics2D graphics2d = (Graphics2D)graphics;
        graphics2d.setColor(new Color(255, 255, 255));
        graphics2d.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}
