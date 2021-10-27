package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private World world;
    public DrawPanel() {
        world = new World();
    }

    @Override

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;

        world.paint(gr);
    }
}

