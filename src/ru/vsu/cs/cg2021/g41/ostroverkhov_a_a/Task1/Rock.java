package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1;

import java.awt.*;

public class Rock extends DrawableObject{
    public Rock(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.GRAY);
        g.fillOval(x, y, width, height);
        g.fillRect(x, y+125, width, height-125);
    }
}
