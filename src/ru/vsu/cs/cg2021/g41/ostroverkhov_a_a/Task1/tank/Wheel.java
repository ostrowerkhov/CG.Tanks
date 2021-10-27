package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.tank;

import ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.DrawableObject;

import java.awt.*;

public class Wheel extends DrawableObject {
    public Wheel(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.DARK_GRAY);
        g.fillOval(x, y, this.width, this.height);
    }
}
