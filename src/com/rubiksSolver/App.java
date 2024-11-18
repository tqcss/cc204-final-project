package com.rubiksSolver;

import com.rubiksSolver.components.*;

public class App {
    private static Window window = new Window();

    public static void main(String[] args) throws Exception {
        initializeWindow();
    }

    private static void initializeWindow() {
        // Place UI Components
        window.addComponent(new Topbar(window.constraints));
        window.addComponent(new Bottombar(window.constraints));
        window.addComponent(new Viewport(window.constraints));
        window.addComponent(new OptionPanel(window.constraints));
        window.repaint();
        window.revalidate();
    }
}
