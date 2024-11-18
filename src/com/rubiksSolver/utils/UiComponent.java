package com.rubiksSolver.utils;

import java.awt.GridBagConstraints;

public interface UiComponent {
    default void setConstraintValues(GridBagConstraints constraint, int anchor, int fill, int gridx, int gridy, int gridWidth, int gridHeight, double weightx, double weighty, int ipadx, int ipady) {
        constraint.anchor = anchor;
        constraint.fill = fill;
        constraint.gridx = gridx;
        constraint.gridy = gridy;
        constraint.gridwidth = gridWidth;
        constraint.gridheight = gridHeight;
        constraint.weightx = weightx;
        constraint.weighty = weighty;
        constraint.ipadx = ipadx;
        constraint.ipady = ipady;
    }
}
